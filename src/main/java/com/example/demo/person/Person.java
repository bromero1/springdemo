package com.example.demo.person;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode @ToString
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long person_id;
    private String first_name;

    private String last_name;
    @Column(unique=true)
    private String email;
    private LocalDate dob;
    private Integer age;

    public Person(Long person_id, String first_name, String email, LocalDate dob, Integer age) {
        this.person_id = person_id;
        this.first_name = first_name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Person(String first_name, String email, LocalDate dob, Integer age) {
        this.first_name = first_name;
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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
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
