
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchFilmsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchFilmsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="movies" type="{http://movie.schallerl.com/}movies" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchFilmsResponse", propOrder = {
    "movies"
})
public class SearchFilmsResponse {

    protected Movies movies;

    /**
     * Gets the value of the movies property.
     * 
     * @return
     *     possible object is
     *     {@link Movies }
     *     
     */
    public Movies getMovies() {
        return movies;
    }

    /**
     * Sets the value of the movies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Movies }
     *     
     */
    public void setMovies(Movies value) {
        this.movies = value;
    }

}
