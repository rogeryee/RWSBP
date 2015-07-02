package com.yee.rwsbp.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 * Author: RogerYee
 */
public class ControllerTest
{
    public static void main(String[] args) throws Exception
    {
        // 测试GET方法
        testGetAccount("phoebecao");

        // 测试POST方式传递JSON对象
//        testPostAccount();
    }

    private static void testGetAccount(String name)
    {
        String url = "http://localhost:8888/services/account/" + name;
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url);
        Response response = target
                .request()
                .get();
        System.out.println("response: " + response.readEntity(String.class));
        response.close();
    }

    private static void testPostAccount()
    {
        String url = "http://localhost:8888/services/account";
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url);

        String postRequest = "{ \"name\" : \"phoebecao\",\"password\":\"321123\",\"addresses\" : [ {\"detailed\":\"Shenzhen\",\"zipCode\":\"200007\"} ]}";

        Response response = target
                .request()
                .post(Entity.json(postRequest));
        System.out.println("response: " + response.readEntity(String.class));
        response.close();
    }
}
