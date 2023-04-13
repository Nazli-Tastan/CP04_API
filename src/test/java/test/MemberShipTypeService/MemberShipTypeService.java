package test.MemberShipTypeService;


import BaseURL.UserGroupServiceBaseURL;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import testData.UserGroupServiceData;
import utilities.JsonToJava;

import java.util.HashMap;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class MemberShipTypeService extends UserGroupServiceBaseURL {

    @Test
    public void getMemberSTS1(){
        String URL ="https://a3m-qa-gm3.quaspareparts.com/auth/api/membership-type";
                //Step1 https://a3m-qa-gm3.quaspareparts.com/auth/api/membership-type
        specification.pathParam("memberPath","membership-type");
        //Step2/*
        UserGroupServiceData data = new UserGroupServiceData();
        String expectedData= "{  \"id\": 3,\n" +
                "        \"name\": \"A3M Guest Membership\",\n" +
                "        \"short_name\": \"Guest Membr.\",\n" +
                "        \"is_enabled\": true,\n" +
                "        \"is_individual_plan\": true,\n" +
                "        \"default_role_id\": 3,\n" +
                "        \"subscription_type_id\": 3,\n" +
                "        \"app_id\": 1,\n" +
                "        \"created_at\": \"2023-01-17T18:59:11.199980Z\",\n" +
                "        \"updated_at\": \"2023-01-19T10:02:38.430971Z\"}";
        System.out.println("ExpectedDataString: "+expectedData);
        HashMap<String,Object> expectedDataMap = JsonToJava.convertJsonToJavaObject(expectedData,HashMap.class);
        System.out.println("EXPECTED DATA MAP: " + expectedDataMap);

        //Step3
        Response response = given().
                spec(specification).
                when().
                header("Authorization","Bearer c0aa77eb8a368a7d991c8e10e6afb9756130abe80e29a6826477f8645165c7b0").  //Dokuman
                        get("/{memberPath}");


        Response res=given().spec(specification).when().header("Authorization","Bearer eyJraWQiOiJlZWY0NGVjYS0xNTg1LTRiZGItOTBkNy03YzgxN2Y1Y2M2ZmEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJib0B0ZXN0aW9uZXh1cy5jb20iLCJzdWJfZGVmYXVsdF9tZW1iZXJzaGlwX3R5cGVfaWQiOjUsInN1Yl9pZCI6MzM4LCJzdWJfZGVmYXVsdF9zdWJzY3JpcHRpb25faWQiOiI0MGI4NmYxMC03ZmIzLTRlZjAtODRiMS00NWQ5ODI2ZjFkNTUiLCJzdWJfYXBwIjoyLCJpc3MiOiJodHRwczpcL1wvYTNtLXFhLWdtMy5xdWFzcGFyZXBhcnRzLmNvbSIsInN1Yl9kZWZhdWx0X29yZ19pZCI6MTg0LCJhdWQiOiIxNjczOTg1MTg0X1pYc05UN0N1aFR6cmlqbCIsIm5iZiI6MTY4MTE1OTQ1MSwic3ViX2RlZmF1bHRfb3JnX25hbWUiOiJUZXN0aW9OZXh1cyIsInNjb3BlIjpbIlJPTEVfQnVzaW5lc3MgT3duZXIiLCJhcHBsaWNhdGlvbjpyZWFkIiwib3JkZXI6d3JpdGUiLCJmaWxlOndyaXRlIiwiaW52ZW50b3J5OnJlYWQiLCJyZWNlcHRpb246Y29uZmlybSIsIndpc2hsaXN0OmFwcHJvdmVkIiwiaW52b2ljZTpyZWFkIiwiaW52ZW50b3J5OndyaXRlIiwidXNlci1yb2xlOnJlYWQiLCJkYXNoYm9hcmQ6cmVhZCIsInBlcm1pc3Npb246d3JpdGUiLCJ1c2VyOndyaXRlIiwic3BlY3ByaWNlOnJlYWQiLCJhY2NvdW50aW5nOndyaXRlIiwidXNlci1vcmdhbml6YXRpb246cmVhZCIsInVzZXItZ3JvdXA6cmVhZCIsInNwZWNwcmljZTp3cml0ZSIsImNvbXBhbnk6YWRtaW4iLCJtZW1iZXJzaGlwLXR5cGU6d3JpdGUiLCJyb2xlOndyaXRlIiwicGVybWlzc2lvbjpyZWFkIiwicHVyY2hhc2luZzpjb25maXJtIiwicmVjZXB0aW9uOnJlYWQiLCJ3aXNobGlzdDpxdWFsaXR5X2NvbmZpcm0iLCJ1c2VyLWdyb3VwOndyaXRlIiwidXNlci1zdGF0dXM6cmVhZCIsImNvdW50cnk6cmVhZCIsIm1lbWJlcnNoaXAtdHlwZTpyZWFkIiwicHJvY3VyZW1lbnQ6cmVhZCIsIm9yZ2FuaXphdGlvbi1zdGF0dXM6d3JpdGUiLCJjb21wYW55OnJlYWQiLCJjb21wYW55OmZpbl9jb25maXJtIiwidXNlci1zdGF0dXM6d3JpdGUiLCJ3aXNobGlzdDpzZXRfY29kaW5nIiwidXNlci1ncm91cC10eXBlOnJlYWQiLCJ1c2VyLXJvbGU6d3JpdGUiLCJ3aXNobGlzdDpvZmZlcl9yZWFkeSIsInB1cmNoYXNpbmc6cmVhZCIsIm9yZ2FuaXphdGlvbjpyZWFkIiwid2lzaGxpc3Q6YWRtaW4iLCJvcmRlcjpyZWFkIiwidXNlci1vcmdhbml6YXRpb246d3JpdGUiLCJoYW5kbWFkZTp3cml0ZSIsIndpc2hsaXN0Om9mZmVyX2NvbmZpcm0iLCJ3aXNobGlzdDpjYW5jZWwiLCJhcHBsaWNhdGlvbjp3cml0ZSIsInN1YnNjcmlwdGlvbjpyZWFkIiwiZmlsZTpyZWFkIiwidXNlcjpyZWFkIiwidXNlci1ncm91cC10eXBlOndyaXRlIiwib3JnYW5pemF0aW9uLWdyb3VwOnJlYWQiLCJpbnZvaWNlOndyaXRlIiwiaGFuZG1hZGU6Y29uZmlybSIsInJlY2VwdGlvbjp3cml0ZSIsIndpc2hsaXN0OnNldF9wcmljZSIsIm9yZ2FuaXphdGlvbjp3cml0ZSIsInJvbGU6cmVhZCIsIm1lbWJlcnNoaXA6cmVhZCIsIndpc2hsaXN0OnNhbGVfY29uZmlybSIsIm9yZ2FuaXphdGlvbi1ncm91cDp3cml0ZSIsInB1cmNoYXNpbmc6d3JpdGUiLCJ3aXNobGlzdDp2aWV3X3N1cHBfcHJpY2UiLCJpbnZvaWNlOmNvbmZpcm0iLCJoYW5kbWFkZTpyZWFkIiwicHJvY3VyZW1lbnQ6d3JpdGUiLCJvcmdhbml6YXRpb24tc3RhdHVzOnJlYWQiLCJjb21wYW55OnF1YWxfY29uZmlybSIsInB1cmNoYXNpbmc6cmVhZF9jb3N0IiwibWVtYmVyc2hpcDp3cml0ZSIsImFjY291bnRpbmc6cmVhZCIsIm9yZGVyOmNvbmZpcm0iLCJzdWJzY3JpcHRpb246d3JpdGUiLCJ3aXNobGlzdDpyZWFkIl0sInN1Yl9kZWZhdWx0X3JvbGVfaWQiOjUsImV4cCI6MTY4MTE2MTI1MSwiaWF0IjoxNjgxMTU5NDUxfQ.ixp4aMfz1E6ro_eCm-KaNsQ856wCu5cJF9NBqY9zVVFSU3JAUDqGKjWFm-TQljuOP_THIW28xjVSgzP1s_tt-9Bpg1UY_tPHhqvRrkZGjvgRTDCcWwYSF3PzgDahiRpdRsZI7nX5TneJ3dvKArmeI1caBvw1dUli4wDfMIAOxX8wrpZ96V6HgbW3w0YafMBA95ptiC9Jw4hNoSqoCSIFq1SLzgLJW_ZxqlrlCm6UpC5Fbc1dWp0KK0OF_MvoqfZIlUxiCcxXtytav-L9CfWH_SRgwtRu2d4ts4Zjb4ZfFNo25c9k3ZKYlmx-WaLWWfzdQbNk6qMNLDdYacXmjQBDWg").
                get("/{memberPath}");
        System.out.println("Response: ");
        response.prettyPrint();
        //Step4
        response.then().assertThat().statusCode(200);
        assertEquals(data.statusCodeForGet(), response.statusCode());

    }
}
