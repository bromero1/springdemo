package com.example.demo.person;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long person_id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Person() {
    }
    public Person(Long person_id, String name, String email, LocalDate dob, Integer age) {
        this.person_id = person_id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Person(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }



    public Long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Long person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
