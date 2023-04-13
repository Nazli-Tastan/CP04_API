package test.UserStatusServis;

import Pages.Login;
import PojoClass.MemberShipTypeServicePojo;
import PojoClass.UserStatusServis;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Reusable;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;

public class GET_UserStatusServis extends Login {
    @Test
    public void TestGet(){
        String Url ="https://a3m-qa-gm3.quaspareparts.com/auth/api/user-status";
        Response response= Reusable.getMethod(Url);
        response.then().assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body("id",hasItems(2,3),"name",hasItems("Pending User Action","Staged"));

    }
    @Test
    public void TestGetId(){
        String Url ="https://a3m-qa-gm3.quaspareparts.com/auth/api/user-status/117";
        Response response= Reusable.getMethod(Url);
        response.then().assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body("id",equalTo(117),"name",equalTo("naz_active3"));

    }
    @Test
    public void TestPost() {
        String url="\"https://a3m-qa-gm3.quaspareparts.com/auth/api/user-status";
        UserStatusServis expectedPojo= new UserStatusServis("team04","team04çalış");
        Response response=Reusable.postMethod(url,expectedPojo);
        Map<Object,Object> actualydata=response.as(HashMap.class);

       // Assert.assertEquals((actualydata.get("name"),expectedPojo.getName());
    //DELETE CALIŞALIM
        Reusable.deleteMethod(url,actualydata.get( "id"));
    }



}
