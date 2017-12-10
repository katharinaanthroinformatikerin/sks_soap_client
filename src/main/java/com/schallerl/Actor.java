package com.schallerl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.Date;

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
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date birthdate;

    public Actor(){}

    public Actor( String lastname, String firstname, Sex sex, Date birthdate){
        this.lastname = lastname;
        this.firstname = firstname;
        this.sex = sex;
        this.birthdate = birthdate;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String dateOfBirth) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", sex=" + sex +
                ", dateofbirth='" + birthdate + '\'' +
                '}';
    }
}
