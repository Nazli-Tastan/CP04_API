package utilities;

import Pages.Login;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

public class Reusable {


    public static Response getMethod(String url){



        Response response=given().
                accept(ContentType.JSON).
                when().
                auth().preemptive().oauth2(Login.token).
                get(url).
                then().
                extract().
                response();
        response.prettyPrint();

        return response;

    }

    public static Response putMethod(String url, Object expectedBody){



        Response response=given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                when().
                auth().preemptive().oauth2(Login.token).
                body(expectedBody).
                put(ConfigReader.getProperty(url)).
                then().
                extract().
                response();;
        response.prettyPrint();

        return response;

    }

    public static Response postMethod(String url, Object expectedBody){



        Response response=given().
                accept(ContentType.JSON).
                when().
                auth().preemptive().oauth2(Login.token).
                contentType(ContentType.JSON).
                body(expectedBody).
                post(url).
                then().
                extract().
                response();

        response.prettyPrint();

        return response;

    }

    public static Response deleteMethod(String url, Object id){



        Response response=given().
                accept(ContentType.JSON).
                when().
                auth().preemptive().oauth2(Login.token).
                delete(ConfigReader.getProperty(url)+"/"+id).
                then().
                extract().
                response();


        return response;

    }
    public static Response getIDMethod(String url,Object id){



        Response response=given().
                accept(ContentType.JSON).
                when().
                auth().preemptive().oauth2(Login.token).
                get(ConfigReader.getProperty(url)+"/"+id).
                then().
                extract().
                response();
        response.prettyPrint();

        return response;

    }
}