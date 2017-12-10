package com.schallerl;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ActorsResourceClient {
    public static void main(String[] args) {
        //usage of args: as parameters when starting the app
        //args[0] = firstname, args[1] = lastname, args[2]= sex, args[3] = dateofbirth

        WebTarget target = ClientBuilder
                .newClient()
                .target("http://localhost:8080/MovieServiceWebApp/resources/actor");

        //getting actor-data
        System.out.print("Enter last name: ");
        Scanner sc = new Scanner(System.in);
        String lastname = sc.nextLine();
        System.out.print("\nEnter first name: ");
        String firstname = sc.nextLine();
        System.out.print("\nEnter sex (FEMALE, MALE):");
        Sex sex = Sex.valueOf(sc.nextLine());
        System.out.print("\nEnter date of birth (YYYY-MM-DD): ");
        String inputBirthdate = sc.nextLine();
        //converting birthdate to LocalDate
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdate = null;
        try {
            birthdate = formatter.parse(inputBirthdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //post dataset:
        Response response = target
                .request()
                .post(Entity.json(
                        new Actor(
                                lastname,
                                firstname,
                                sex,
                                birthdate)));
        System.out.println(response.getLocation());
    }
}

//Liste der Actors ausgeben
        /*List<Actor> actorList = target
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Actor>>(){});
        actorList.forEach(System.out::println);

        //um actor über eine ID zu holen
        Actor actor = target
                .path("/{actorId}")
                .resolveTemplate("actorId", 1)
                .request(MediaType.APPLICATION_JSON)
                .get(Actor.class);
        System.out.println(actor);*/
