package com.schallerl;

import generated.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SoapClient
{
    public static void main(String[] args) {
        System.setProperty( "com.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize", "true");

        if(args.length != 4){
            System.out.println("Usage: SoapClient search|import searchterm|importfile username password");
            return;
        }

        PasswordAuthenticator.install(args[2], args[3]);

        if (args[0].equals("search")) {
            searchMovies(args[1]);
        }
        else if (args[0].equals("import")){
            importMovies(args[1]);
        }
    }

    private static void importMovies(String filename){
        try {
            JAXBContext jaxbcontext = JAXBContext.newInstance(Movies.class);
            Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();

            System.out.println("Datei " + filename + " lesen...");
            StreamSource source = new StreamSource(new File(filename));

            //When unmarshalling, define "root"-class, for mapping the xml to the object, in our case: Movies.class.
            JAXBElement<Movies> moviesparsed = (JAXBElement<Movies>) unmarshaller.unmarshal(source, Movies.class);
            List<Movie> movies = moviesparsed.getValue().getMovie();
            movies.forEach(movie ->printMovie(movie));
            System.out.println("Import startet...");
            System.setProperty("com.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize", "true");

            MovieWebService_Service service = new MovieWebService_Service();
            MovieWebService port = service.getMovieWebServicePort();
            try {
                port.importMovies(moviesparsed.getValue());
                System.out.println("Movie(s) erfolgreich importiert.");
            }catch(Exception e) {
                System.err.println("Fehler beim MovieImport: " + e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void searchMovies(String searchterm) {
        System.setProperty("com.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize", "true");

        MovieWebService_Service service = new MovieWebService_Service();
        MovieWebService port = service.getMovieWebServicePort();

        Movies movies = port.searchFilms(searchterm);
        for (Movie movie : movies.getMovie()){
            printMovie(movie);
        }
    }

    private static void printMovie(Movie movie) {
        System.out.println("Movie [movieId=" + movie.getId() +
                ", title=" + movie.getTitle() +
                ", description=" + movie.getDescription() + "]");
    }
}

 /*Movies movies = new Movies();
            movies.setMovies(new ArrayList<>());
            Movie movie = new Movie();
            movie.setGenre(Genre.ACTION);
            movies.getMovies().add(movie);
            //movie.setGenre(Genre.ACTION);
            JAXBContext jaxbcontext = JAXBContext.newInstance(Movies.class);
            Marshaller marshaller = jaxbcontext.createMarshaller();
            Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(movies, System.out);
            Movies moviesparsed = (Movies)unmarshaller.unmarshal(new File("movies.xml"));
            System.out.println(moviesparsed.getMovies().size());
            //marshaller.marshal(person, new File("person.xml"));
            //System.out.println(movie.getGenre());
            System.out.println("Hello World!");*/
