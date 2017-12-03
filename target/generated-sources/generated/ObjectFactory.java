
package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ImportMoviesResponse_QNAME = new QName("http://movie.schallerl.com/", "importMoviesResponse");
    private final static QName _SearchFilms_QNAME = new QName("http://movie.schallerl.com/", "searchFilms");
    private final static QName _Actor_QNAME = new QName("http://movie.schallerl.com/", "actor");
    private final static QName _Movies_QNAME = new QName("http://movie.schallerl.com/", "movies");
    private final static QName _ImportMovies_QNAME = new QName("http://movie.schallerl.com/", "importMovies");
    private final static QName _Movie_QNAME = new QName("http://movie.schallerl.com/", "movie");
    private final static QName _SearchFilmsResponse_QNAME = new QName("http://movie.schallerl.com/", "searchFilmsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link Actor }
     * 
     */
    public Actor createActor() {
        return new Actor();
    }

    /**
     * Create an instance of {@link Movies }
     * 
     */
    public Movies createMovies() {
        return new Movies();
    }

    /**
     * Create an instance of {@link SearchFilms }
     * 
     */
    public SearchFilms createSearchFilms() {
        return new SearchFilms();
    }

    /**
     * Create an instance of {@link ImportMovies }
     * 
     */
    public ImportMovies createImportMovies() {
        return new ImportMovies();
    }

    /**
     * Create an instance of {@link SearchFilmsResponse }
     * 
     */
    public SearchFilmsResponse createSearchFilmsResponse() {
        return new SearchFilmsResponse();
    }

    /**
     * Create an instance of {@link ImportMoviesResponse }
     * 
     */
    public ImportMoviesResponse createImportMoviesResponse() {
        return new ImportMoviesResponse();
    }

    /**
     * Create an instance of {@link Studio }
     * 
     */
    public Studio createStudio() {
        return new Studio();
    }

    /**
     * Create an instance of {@link Movie.Actors }
     * 
     */
    public Movie.Actors createMovieActors() {
        return new Movie.Actors();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movie.schallerl.com/", name = "importMoviesResponse")
    public JAXBElement<ImportMoviesResponse> createImportMoviesResponse(ImportMoviesResponse value) {
        return new JAXBElement<ImportMoviesResponse>(_ImportMoviesResponse_QNAME, ImportMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFilms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movie.schallerl.com/", name = "searchFilms")
    public JAXBElement<SearchFilms> createSearchFilms(SearchFilms value) {
        return new JAXBElement<SearchFilms>(_SearchFilms_QNAME, SearchFilms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movie.schallerl.com/", name = "actor")
    public JAXBElement<Actor> createActor(Actor value) {
        return new JAXBElement<Actor>(_Actor_QNAME, Actor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movie.schallerl.com/", name = "movies")
    public JAXBElement<Movies> createMovies(Movies value) {
        return new JAXBElement<Movies>(_Movies_QNAME, Movies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movie.schallerl.com/", name = "importMovies")
    public JAXBElement<ImportMovies> createImportMovies(ImportMovies value) {
        return new JAXBElement<ImportMovies>(_ImportMovies_QNAME, ImportMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movie.schallerl.com/", name = "movie")
    public JAXBElement<Movie> createMovie(Movie value) {
        return new JAXBElement<Movie>(_Movie_QNAME, Movie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFilmsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://movie.schallerl.com/", name = "searchFilmsResponse")
    public JAXBElement<SearchFilmsResponse> createSearchFilmsResponse(SearchFilmsResponse value) {
        return new JAXBElement<SearchFilmsResponse>(_SearchFilmsResponse_QNAME, SearchFilmsResponse.class, null, value);
    }

}
