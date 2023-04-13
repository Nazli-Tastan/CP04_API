package PojoClass;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)  //org.codehaus.jackson.map.exc.UnrecognizedPropertyException: Unrecognized field "data" (Class pojoDatas.DummyResTApiReqPojo), not marked as ignorable
//at [Source: java.io.StringReader@3a26ec8d; line: 3, column: 14] (through reference chain: pojoDatas.DummyResTApiReqPojo["data"])

public class UserGroupExpectedPOJO {
    /*
   name :"neww Departmentt",

    group-type-id : 1,
    organization-id: 24,
    status code:201
     */

    private int statusCode;
    private UserGroupPOJO addNewUserGroupPOJO;


    public UserGroupExpectedPOJO() {
    }

    public UserGroupExpectedPOJO(int statusCode, UserGroupPOJO addNewUserGroupPOJO) {
        this.statusCode = statusCode;
        this.addNewUserGroupPOJO = addNewUserGroupPOJO;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public UserGroupPOJO getAddNewUserGroupPOJO() {
        return addNewUserGroupPOJO;
    }

    public void setAddNewUserGroupPOJO(UserGroupPOJO addNewUserGroupPOJO ) {
        this.addNewUserGroupPOJO = addNewUserGroupPOJO;
    }


    @Override
    public String toString() {
        return "UserGroupExpectedPOJO{" +
                "statusCode=" + statusCode +
                ", addNewUserGroupPOJO=" + addNewUserGroupPOJO +
                '}';
    }
}
