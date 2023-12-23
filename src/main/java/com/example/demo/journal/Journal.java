package com.example.demo.journal;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Journal {
    @Id
    @GeneratedValue
    private Long journal_id;

//    @OneToOne(cascade = CascadeType.ALL)
    private Long userId;

    @OneToMany(mappedBy = "userId")
    private Set<JournalEntry> entries = new HashSet<>();
    private String title;
    private Integer entryCount;

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
}

