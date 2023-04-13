package test.UserGroupService;


import Pages.Login;
import PojoClass.UserGroupPOJO;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import org.testng.annotations.Test;


import utilities.Reusable;

import static io.restassured.RestAssured.given;

public class POST_AddNewUserGroup extends Login {


    /* request body & response body
    {
      "name": "UserGroupDeneme",

      "group_type_id": 2,

      "organization_id": 24
    }
     */
    @Test
    public void AddNewUserGroup(){

//https://a3m-qa-gm3.quaspareparts.com/auth/api/user-group

     //   specification.pathParam("userPath","user-group");

        //Set Expected and Req. Body

         /*
   name :"neww Departmentt",

    group-type-id : 1,
    organization-id: 24,
    status code:201
     */
        String URL ="https://a3m-qa-gm3.quaspareparts.com/auth/api/user-group" ;
        UserGroupPOJO expected = new UserGroupPOJO(2,"UserGroupDeneme",184);
        System.out.println("expected = " + expected);
       Response response= Reusable.postMethod(URL,expected);

       JsonPath actual=response.jsonPath();

       Assert.assertEquals(expected.getGroup_type_id(), actual.getInt("group_type_id"));
       Assert.assertEquals(expected.getOrganization_id(),actual.getInt("organization_id"));
       Assert.assertEquals(expected.getName(),actual.getString("name"));





        /*
        UserGroupExpectedPOJO act_data=response.as(UserGroupExpectedPOJO.class);
        System.out.println("act_data:"+act_data);
*/
    }
}
