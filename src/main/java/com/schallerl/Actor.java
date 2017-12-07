package com.schallerl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Actor {

    private Long id;

    @XmlAttribute
    private String lastname;

    @XmlAttribute
    private String firstname;

    @XmlAttribute
    private Sex sex;

    @XmlAttribute
    private String dateofbirth;

    public Actor(){}

    public Actor( String lastname, String firstname, Sex sex, String dateofbirth){
        this.lastname = lastname;
        this.firstname = firstname;
        this.sex = sex;
        this.dateofbirth = dateofbirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String surname) {
        this.lastname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateOfBirth) {
        this.dateofbirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", sex=" + sex +
                ", dateofbirth='" + dateofbirth + '\'' +
                '}';
    }
}
