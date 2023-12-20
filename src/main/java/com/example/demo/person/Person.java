package com.example.demo.person;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long person_id;
    private String name;

    @Column(unique=true)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(person_id, person.person_id) && Objects.equals(name, person.name) && Objects.equals(email, person.email) && Objects.equals(dob, person.dob) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person_id, name, email, dob, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "person_id=" + person_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
