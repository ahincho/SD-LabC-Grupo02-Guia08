package com.unsa.test;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.unsa.domain.entities.Item;
import java.util.List;

public class ClientGetOrders {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8085/RestService-1.0/Marketplace/shopping-cart/getOrders"))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(ClientGetOrders::processResponse)
                .join();
    }
    private static void processResponse(String responseBody) {
        Gson gson = new Gson();
        Type itemType = new TypeToken<List<Item>>() {}.getType();
        List<Item> items = gson.fromJson(responseBody, itemType);
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
