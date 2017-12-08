package com.schallerl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Studio {

    private Long id;

    @XmlAttribute
    private String name;

    @XmlAttribute
    private String countrycode;

    @XmlAttribute
    private String postcode;

    /*@OneToMany(mappedBy = "studio")
    private Set<Movie> movies;
*/
    /*@ManyToMany
    @JoinTable(
            name="studio_actor",
            joinColumns=@JoinColumn(name="studio_id", referencedColumnName="id", foreignKey = @ForeignKey(name="fk_studio_actor_studio")),
            inverseJoinColumns=@JoinColumn(name="actor_id", referencedColumnName="id", foreignKey = @ForeignKey(name="fk_studio_actor_actor")))
    private Set<Actor> actors;*/

    public Studio(){}

    public Studio(String name, String countrycode, String postcode){
        this.name = name;
        this.countrycode = countrycode;
        this.postcode = postcode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String street) {
        this.countrycode = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String zipcode) {
        this.postcode = zipcode;
    }
/*
    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }*/
}
