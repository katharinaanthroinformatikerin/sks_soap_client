package com.schallerl;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.util.Scanner;

public class StudiosResourceClient {
    public static void main(String[] args) {
        //usage of args: as parameters when starting the app
        //args[0] = firstname, args[1] = lastname, args[2]= sex, args[3] = dateofbirth

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
                .request()
                .post(Entity.json(
                        new Studio(
                                studioname,
                                postcode,
                                countrycode)));
        System.out.println(response.getLocation());
    }
}
