import Base.BaseLibrary;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class PetStoreTests extends BaseLibrary {

    @Test(priority = 1,description = "POST - /v2/user")
    public void createUser(){
        Map<String,Object>headers = new HashMap<>();
        headers.put("accept","application/json");
        headers.put("Content-Type","application/json");

        Map<String,Object>body = new HashMap<>();
        body.put("id","1667");
        body.put("username","yusufcokal");
        body.put("firstName","yusuf");
        body.put("lastName","cokal");
        body.put("email","yusufcokaltest@gmail.com");
        body.put("password","1667");
        body.put("phone","507000");
        body.put("userStatus","1");

        Post(URL + "/v2/user",headers,body);

    }

    @Test(priority = 3,description = "GET - /v2/user/username")
    public void getUserByName(){
        Get(URL+ "/v2/user/yusufcokalYeni");
    }

    @Test(priority = 2,description = "PUT - /v2/user/")
    public void updateUser()
    {
        Map<String,Object>headers = new HashMap<>();
        headers.put("accept","application/json");
        headers.put("Content-Type","application/json");

        Map<String,Object>body = new HashMap<>();
        body.put("id","1667");
        body.put("username","yusufcokalYeni");
        body.put("firstName","yusuff");
        body.put("lastName","cokall");
        body.put("email","yusufcokalyenitest@gmail.com");
        body.put("password","2559");
        body.put("phone","532000");
        body.put("userStatus","1");

        Put(URL+"/v2/user/yusufcokal",headers,body);
    }

    @Test(priority = 4,description = "DELETE - /v2/user/")
    public void deleteUser(){
        Delete(URL+"/v2/user/yusufCokalYeni");
    }

    @Test(description = "GET - /v2/user/login")
    public void login(){
        Map<String,Object>params = new HashMap<>();
        params.put("username","yusufcokal");
        params.put("password","1667");

        Get(URL+"/v2/user/login",params);
    }

    @Test(description = "GET - /v2/user/logout")
    public void logout()
    {
        Get(URL+"/v2/user/logout");
    }

    @Test(description = "POST- /v2/user/createWithArray")
    public void createWithArray(){
        Map<String,Object>headers = new HashMap<>();
        headers.put("accept","application/json");
        headers.put("Content-Type","application/json");


        Map<String,Object>body = new HashMap<>();
        body.put("id","121");
        body.put("username","yusuftest");
        body.put("firstName","yusuff");
        body.put("lastName","ckl");
        body.put("email","yusuftest@gmail.com");
        body.put("password","1234");
        body.put("phone","535000");
        body.put("userStatus","1");

        Post(URL+"/v2/user/createWithArray",headers,body);
    }

    @Test(description = "POST - /v2/user/createWithList")
    public void createWithList()
    {
        Map<String,Object>headers = new HashMap<>();
        headers.put("accept","application/json");
        headers.put("Content-Type","application/json");


        Map<String,Object>body = new HashMap<>();
        body.put("id","131");
        body.put("username","ysf");
        body.put("firstName","yusuff");
        body.put("lastName","cokall");
        body.put("email","yusuff@gmail.com");
        body.put("password","166747");
        body.put("phone","534000");
        body.put("userStatus","1");

        Post(URL+"/v2/user/createWithList",headers,body);
    }
}
