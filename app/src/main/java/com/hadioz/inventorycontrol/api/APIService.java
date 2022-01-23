package com.hadioz.inventorycontrol.api;

import com.hadioz.inventorycontrol.Log;
import com.hadioz.inventorycontrol.Product;
import com.hadioz.inventorycontrol.User;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIService {
    @POST("/signin")
    Call<String> createPost(@Body User user);

    @GET("/products")
    Call<ArrayList<Product>> getProducts();

    @GET("/logs")
    Call<String> getLog(@Query("id-product") String id);


}
