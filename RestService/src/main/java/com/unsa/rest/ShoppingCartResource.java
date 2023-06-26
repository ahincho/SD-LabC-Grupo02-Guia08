package com.unsa.rest;

import com.unsa.domain.entities.Item;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Path("/shopping-cart")
public class ShoppingCartResource {
    @GET
    @Path("/getOrders")
    @Produces("text/json")
    public List<Item> getOrders() {
        List<Item> items = new ArrayList<>();
        Item ssd = new Item("SSD", 500);
        Item gCard = new Item("Graphic Card", 5000);
        Item gpu = new Item("GPU", 100);
        items.add(ssd);
        items.add(gCard);
        items.add(gpu);
        return items;
    }
    @GET
    @Path("/addOrder/{name}")
    @Produces("text/plain")
    public String addOrder(@PathParam("name") String name) {
        System.out.println("Client bought " + name);
        return "You bought a '" + name + "'. Your order has been added!";
    }
}