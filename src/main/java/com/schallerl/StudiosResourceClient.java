package com.schallerl;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.util.Scanner;

public class StudiosResourceClient {
    public static void main(String[] args) {

        if (args.length != 2){
            System.out.println("Usage: username password");
            return;
        }

        WebTarget target = ClientBuilder
                .newClient()
                .target("http://localhost:8080/MovieServiceWebApp/resources/studio");

        //studio-data-input
        System.out.print("Enter studioname: ");
        Scanner sc = new Scanner(System.in);
        String studioname = sc.nextLine();
        System.out.print("\nEnter postcode: ");
        String postcode = sc.nextLine();
        System.out.print("\nEnter countrycode:");
        String countrycode = sc.nextLine();

        //post dataset:
        Response response = target
                .register(new RequestFilter(args[0], args[1]))
                .request()
                .post(Entity.json(
                        new Studio(
                                studioname,
                                postcode,
                                countrycode)));
        System.out.println(response.getLocation());
    }
}
