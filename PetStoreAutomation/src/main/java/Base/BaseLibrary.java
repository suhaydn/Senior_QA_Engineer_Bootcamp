package Base;


import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;

public class BaseLibrary extends Data {

    @Step("{url} Get Istegi ")
    public Response Get(String url)
    {
        Response response = RestAssured.get(url);
        System.out.println( "Response:" + response.getBody().asString());
        return response;
    }

    @Step("{url} Post Istegi ")
    public Response Post(String url, Map<String,Object>headers,Map<String,Object>body){
        Response response = RestAssured.given().body(body).headers(headers).when().post(url);
        System.out.println( "Response:" + response.getBody().asString());
        return response;
    }

    @Step("{url} Put Istegi ")
    public Response Put(String url, Map<String,Object>headers,Map<String,Object>body){
        Response response = RestAssured.given().body(body).headers(headers).when().put(url);
        System.out.println( "Response:" + response.getBody().asString());
        return response;
    }

    @Step("{url} Delete Istegi ")
    public Response Delete(String url)
    {
        Response response = RestAssured.delete(url);
        System.out.println( "Response:" + response.getBody().asString());
        return response;
    }

    @Step("{url} Parametreli Get Istegi ")
    public Response Get(String url, Map<String,Object>params){
        Response response = RestAssured.given().queryParams(params).when().get(url);
        System.out.println( "Response:" + response.getBody().asString());
        return response;
    }
}
