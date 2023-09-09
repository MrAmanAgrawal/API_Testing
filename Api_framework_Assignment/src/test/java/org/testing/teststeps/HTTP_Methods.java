package org.testing.teststeps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class HTTP_Methods {

	Properties pr;

	public HTTP_Methods(Properties pr) {
		this.pr = pr;
	}

	public Response post_method(String request_body, String uri_keyname) {

		String uri_value = pr.getProperty(uri_keyname);
		Response res = given().contentType(ContentType.JSON).body(request_body).when().post(uri_value);
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		return res;
	}

	public Response get_method(String uri_keyname) {

		String uri_value = pr.getProperty(uri_keyname);
		Response res = given().contentType(ContentType.JSON).when().get(uri_value);
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		return res;
	}

	public Response get_method_particular(String uri_keyname, String endpoint) {

		String uri_value = pr.getProperty(uri_keyname) + "/" + endpoint;
		Response res = given().contentType(ContentType.JSON).when().get(uri_value);
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		return res;
	}
	
	
	public Response put_method(String request_body, String uri_keyname , String endpoint) {

		String uri_value = pr.getProperty(uri_keyname)+ "/" + endpoint;
		Response res = given().contentType(ContentType.JSON).body(request_body).when().put(uri_value);
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		return res;
	}
	
	public Response delete_method(String uri_keyname, String endpoint) {

		String uri_value = pr.getProperty(uri_keyname) + "/" + endpoint;
		Response res = given().contentType(ContentType.JSON).when().delete(uri_value);
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		return res;
	}
}
