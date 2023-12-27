package com.example.demo.journal;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Journal {
    @Id
    @GeneratedValue
    private Long journal_id;

    private Long userId;

    @OneToMany(mappedBy = "journal", cascade = CascadeType.ALL)
    private Set<JournalEntry> entries = new HashSet<>();
    private String title;
    private Integer entryCount;

    public void setId(Long id) {
        this.journal_id = id;
    }
    public Long getId() {
        return journal_id;
    }
}

