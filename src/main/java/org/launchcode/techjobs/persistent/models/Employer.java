package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @Size(max = 50, message = "Location is too long.")
    @NotBlank(message = "Location is required.")
    private String location;

    /** Constructors **/

    public Employer() {
    }

    /** Getters and setters **/

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

/** Will persist this class in part 2. DONE. **/