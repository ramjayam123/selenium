package com.apitest;

import io.restassured.RestAssured;


import static io.restassured.RestAssured.*;

import com.resueblemethods.BaseClass;
import com.resueblemethods.payload;

public class Firstapi {

	public static void main(String[] args) {
		
RestAssured.baseURI="https://rahulshettyacademy.com";
String addresponce = given().log().all().body(payload.addplacepayload()).queryParam("key", "qaclick123")
.when().post("/maps/api/place/add/json")
.then().log().all().assertThat().statusCode(200).extract().response().asString();



String place_id = BaseClass.rawToJson(addresponce).getString("place_id");
System.out.println(place_id);
    // GET PLACE

given().log().all().queryParam("key", "qaclick123").queryParam("place_id", place_id)
.when().get("/maps/api/place/get/json")
.then().log().all().assertThat().statusCode(200);

	}
}
