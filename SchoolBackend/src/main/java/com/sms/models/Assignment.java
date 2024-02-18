package com.sms.models;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="Assigments")
@Data

@AllArgsConstructor
@Builder
@ToString
public class Assignment {
    @Id
    @GeneratedValue
    private long id;
    private String subject;
    private String std;
    private Date lastdate;
    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "file") 
    private Filedata file;
    
    public Assignment() {
        super();
    }
}

