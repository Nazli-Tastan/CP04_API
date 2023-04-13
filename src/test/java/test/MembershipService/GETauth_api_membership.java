package test.MembershipService;

import PojoClass.ResponsePojo;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;


import static io.restassured.RestAssured.given;

public class GETauth_api_membership  {
String token = "eyJraWQiOiIyOGQ1MDVjMy01MDgxLTQwOGEtOGU0NC01NTgzMTYxN2EwYjQiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJib0B0ZXN0aW9uZXh1cy5jb20iLCJzdWJfZGVmYXVsdF9tZW1iZXJzaGlwX3R5cGVfaWQiOjUsInN1Yl9pZCI6MjI3LCJzdWJfZGVmYXVsdF9zdWJzY3JpcHRpb25faWQiOiI0YWYzYmMyNS1jZDI0LTRkMjItYTk2Ny1mZWM0ZDI4NzI0YTYiLCJzdWJfYXBwIjoyLCJpc3MiOiJodHRwczpcL1wvYTNtLXFhLWdtMy5xdWFzcGFyZXBhcnRzLmNvbSIsInN1Yl9kZWZhdWx0X29yZ19pZCI6MjQsImF1ZCI6IjE2NzM5ODUxODRfWlhzTlQ3Q3VoVHpyaWpsIiwibmJmIjoxNjgwNTU0Nzk2LCJzdWJfZGVmYXVsdF9vcmdfbmFtZSI6Imdyb3VwMDA0Iiwic2NvcGUiOlsiUk9MRV9CdXNpbmVzcyBPd25lciIsImFwcGxpY2F0aW9uOnJlYWQiLCJvcmRlcjp3cml0ZSIsImZpbGU6d3JpdGUiLCJpbnZlbnRvcnk6cmVhZCIsInJlY2VwdGlvbjpjb25maXJtIiwid2lzaGxpc3Q6YXBwcm92ZWQiLCJpbnZvaWNlOnJlYWQiLCJpbnZlbnRvcnk6d3JpdGUiLCJST0xFX1B1cmNoYXNlIE1hbmFnZXIiLCJ1c2VyLXJvbGU6cmVhZCIsImRhc2hib2FyZDpyZWFkIiwicGVybWlzc2lvbjp3cml0ZSIsInVzZXI6d3JpdGUiLCJzcGVjcHJpY2U6cmVhZCIsIlJPTEVfUHVyY2hhc2UgUGVyc29ubmVsIiwiYWNjb3VudGluZzp3cml0ZSIsInVzZXItb3JnYW5pemF0aW9uOnJlYWQiLCJ1c2VyLWdyb3VwOnJlYWQiLCJzcGVjcHJpY2U6d3JpdGUiLCJjb21wYW55OmFkbWluIiwibWVtYmVyc2hpcC10eXBlOndyaXRlIiwicm9sZTp3cml0ZSIsInBlcm1pc3Npb246cmVhZCIsInB1cmNoYXNpbmc6Y29uZmlybSIsInJlY2VwdGlvbjpyZWFkIiwid2lzaGxpc3Q6cXVhbGl0eV9jb25maXJtIiwidXNlci1ncm91cDp3cml0ZSIsInVzZXItc3RhdHVzOnJlYWQiLCJjb3VudHJ5OnJlYWQiLCJtZW1iZXJzaGlwLXR5cGU6cmVhZCIsInByb2N1cmVtZW50OnJlYWQiLCJvcmdhbml6YXRpb24tc3RhdHVzOndyaXRlIiwiY29tcGFueTpyZWFkIiwiY29tcGFueTpmaW5fY29uZmlybSIsInVzZXItc3RhdHVzOndyaXRlIiwid2lzaGxpc3Q6c2V0X2NvZGluZyIsInVzZXItZ3JvdXAtdHlwZTpyZWFkIiwidXNlci1yb2xlOndyaXRlIiwid2lzaGxpc3Q6b2ZmZXJfcmVhZHkiLCJwdXJjaGFzaW5nOnJlYWQiLCJvcmdhbml6YXRpb246cmVhZCIsIndpc2hsaXN0OmFkbWluIiwib3JkZXI6cmVhZCIsInVzZXItb3JnYW5pemF0aW9uOndyaXRlIiwiaGFuZG1hZGU6d3JpdGUiLCJ3aXNobGlzdDpvZmZlcl9jb25maXJtIiwid2lzaGxpc3Q6Y2FuY2VsIiwiYXBwbGljYXRpb246d3JpdGUiLCJzdWJzY3JpcHRpb246cmVhZCIsImNvbXBhbnk6d3JpdGUiLCJmaWxlOnJlYWQiLCJ1c2VyOnJlYWQiLCJ1c2VyLWdyb3VwLXR5cGU6d3JpdGUiLCJvcmdhbml6YXRpb24tZ3JvdXA6cmVhZCIsImludm9pY2U6d3JpdGUiLCJoYW5kbWFkZTpjb25maXJtIiwiUk9MRV9TYWxlcyBNYW5hZ2VyIiwicmVjZXB0aW9uOndyaXRlIiwid2lzaGxpc3Q6c2V0X3ByaWNlIiwib3JnYW5pemF0aW9uOndyaXRlIiwicm9sZTpyZWFkIiwibWVtYmVyc2hpcDpyZWFkIiwid2lzaGxpc3Q6c2FsZV9jb25maXJtIiwib3JnYW5pemF0aW9uLWdyb3VwOndyaXRlIiwicHVyY2hhc2luZzp3cml0ZSIsIndpc2hsaXN0OnZpZXdfc3VwcF9wcmljZSIsImludm9pY2U6Y29uZmlybSIsImNsaWVudDp3cml0ZSIsImhhbmRtYWRlOnJlYWQiLCJwcm9jdXJlbWVudDp3cml0ZSIsIm9yZ2FuaXphdGlvbi1zdGF0dXM6cmVhZCIsImNvbXBhbnk6cXVhbF9jb25maXJtIiwicHVyY2hhc2luZzpyZWFkX2Nvc3QiLCJtZW1iZXJzaGlwOndyaXRlIiwiYWNjb3VudGluZzpyZWFkIiwib3JkZXI6Y29uZmlybSIsInN1YnNjcmlwdGlvbjp3cml0ZSIsIndpc2hsaXN0OnJlYWQiLCJjbGllbnQ6cmVhZCJdLCJzdWJfZGVmYXVsdF9yb2xlX2lkIjo1LCJleHAiOjE2ODA1NTY1OTYsImlhdCI6MTY4MDU1NDc5Nn0.CShXTQ5fhOqoJLuor8hBodznf3dd1ZJl2BEgcOi2S8O_hB0u8GVUBLWNsfCTQssNeLSNpzU1udUsDD7n0jfkrvEXtFza9HvgoLELnp3xkvMf1j1pCY9MzUupxr7lBJG2aAGQroFTziykw1cQJn931WVtCTpRiImyxBmOUhXeHPP7O1w-OfpUU3-SJBb2KA1GMMOcdMWSA5VkU-T7WiRYyyhVEERjddxV9wkfApNNrhHRMucEBJUR5ol14iY1-Ocs61X9OAUfWBhZuB9rjiPTwLEcZw3w33uQ-ZJpS2erdoX_n0dTk7cF-skLtuOeuC5aliO_QgLmsid_U2KiRzI1WA";
    @Test
    public void Membirship1GET(){
//https://a3m-qa-gm3.quaspareparts.com/auth/api/membership

/*
expected

 /*
    {
        "app_id": 2,
        "user_id": 227,
        "subscription_id": "9eb6e23e-6235-471c-af9f-ccf1df90f9b7",
        "is_individual_membership": true,
        "default_role_id": 6,
        "is_active": true,
        "is_default": false
    },


 */
        //https://a3m-qa-gm3.quaspareparts.com/auth/api/membership
        //specification.param("p1","membership");

        ResponsePojo expecteddata = new ResponsePojo();
        expecteddata.setApp_id(2);
        expecteddata.setUser_id(227);
        expecteddata.setSubscription_id("9eb6e23e-6235-471c-af9f-ccf1df90f9b7");


       // Response response = given().spec(specification).
         //       when().header("Authorization", "Bearer " + token).
       //        contentType(ContentType.JSON).get("{p1}");

        //response.prettyPrint();


    }

}
