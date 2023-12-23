package com.example.demo.journal;

import jakarta.persistence.*;

@Entity
public class JournalEntry {

    @Id
    @GeneratedValue
    private Long entryNumber;

    @ManyToOne
    @JoinColumn(name = "" )

    private Long personId;
    private String title;
    private String entryText;

}
