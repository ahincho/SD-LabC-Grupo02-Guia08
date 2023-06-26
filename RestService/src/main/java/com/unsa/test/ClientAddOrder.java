package com.unsa.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClientAddOrder {
    public static void main(String[] args) {
        String item = "MotherBoard";
        try {
            // Intenta conectarse a la API
            String urlString = "http://localhost:8085/RestService-1.0/Marketplace/shopping-cart/addOrder/" + item;
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            // Obtiene la respuesta de la API
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Lee la respuesta de la API
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                // Muestra la respuesta de la API
                System.out.println("Respuesta de la API: " + response.toString());
            } else {
                System.out.println("Error al consumir la API. Código de respuesta: " + responseCode);
            }
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
