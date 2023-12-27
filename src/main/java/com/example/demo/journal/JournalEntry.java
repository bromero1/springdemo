package com.example.demo.journal;

import jakarta.persistence.*;

@Entity
public class JournalEntry {

    @Id
    @GeneratedValue
    private Long entryNumber;

    @ManyToOne
    @JoinColumn(name = "journal_id")
    private Journal journal;

     private Long personId;
    private String title;
    private String entryText;

}
