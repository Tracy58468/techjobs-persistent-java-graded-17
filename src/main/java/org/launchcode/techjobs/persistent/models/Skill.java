package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 100, message = "Description is too long.")
    @NotBlank(message = "Description is required.")
    private String description;

    /** Constructors **/

    public Skill() {
    }

    /** Getters and setters **/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

/** Will persist this class in part 2. DONE. **/