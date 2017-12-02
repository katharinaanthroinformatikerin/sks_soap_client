package com.schallerl;

import com.schallerl.generated.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SoapClient
{
    public static void main(String[] args) {

        if(args.length != 2){
            System.out.println("Usage: SoapClient search|import searchterm|importfile");
            return;
        }

        if (args[0].equals("search")) {
            searchMovies(args[1]);
        }
        else if (args[0].equals("import")){
            importMovies(args[1]);
        }
    }

    private static void importMovies(String filename){
        try {
            JAXBContext jaxbcontext = JAXBContext.newInstance(ObjectFactory.class);
            Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
            Marshaller marshaller = jaxbcontext.createMarshaller();
            //List<Movie> movies = new ArrayList<>();
            /*MovieArray array = new MovieArray();
            Movie movie = new Movie();
            movie.setId(1L);
            movie.setTitle("testtitle");
            array.getItem().add(movie);
            ObjectFactory of = new ObjectFactory();
            marshaller.marshal(of.createMovies(array), System.out);
            System.out.println("\n--------------------");*/
            JAXBElement<Movies> moviesparsed = (JAXBElement<Movies>) unmarshaller.unmarshal(new File(filename));
            List<Movie> movies = moviesparsed.getValue().getMovie();
            movies.forEach(movie ->printMovie(movie));

            System.setProperty("com.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize", "true");

            MovieWebServiceService service = new MovieWebServiceService();
            MovieWebService port = service.getMovieWebServicePort();

            port.importMovies(moviesparsed.getValue());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void searchMovies(String searchterm) {
        System.setProperty("com.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize", "true");

        MovieWebServiceService service = new MovieWebServiceService();
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
