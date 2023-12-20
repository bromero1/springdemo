package com.example.demo.journal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Journal {
    @Id
    @GeneratedValue
    private Long id;

    private Long userId;
    private String title;
    private

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

