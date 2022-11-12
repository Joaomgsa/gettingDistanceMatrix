package org.example.application;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.RequestBody;
import org.example.model.entities.EndBodyResponse;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        final String key = "21eb9dee4d2f4bc7b886d75de722aa42";

        OkHttpClient client = new OkHttpClient().newBuilder().build();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"mode\":\"walk\",\"sources\":[{\"location\":[-43.17751755735455,-22.9070456]},{\"location\":[-43.1769268,-22.9562566]}],\"targets\":[{\"location\":[-43.17751755735455,-22.9070456]},{\"location\":[-43.1769268,-22.9562566]}]}");
        Request request = new Request.Builder()
                .url("https://api.geoapify.com/v1/routematrix?apiKey="+key)
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = client.newCall(request).execute();

        Gson gson = new Gson();
        ResponseBody responseBody = client.newCall(request).execute().body();



        String test = responseBody.string();

        System.out.println(test);

        ObjectMapper mapper = new ObjectMapper();

        /*EndBodyResponse endBodyResponse = gson.fromJson(responseBody.string(), EndBodyResponse.class);

        System.out.println(endBodyResponse.toString());*/
    }
}