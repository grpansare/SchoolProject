package com.sms.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="ImageData")
@Data
@AllArgsConstructor
@Builder
@ToString
public class Filedata {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String type;
    private String filePath;
    @JsonBackReference
    @OneToOne(mappedBy = "file")
    private Assignment assignment;
    
    public Filedata() {
        super();
    }
}
