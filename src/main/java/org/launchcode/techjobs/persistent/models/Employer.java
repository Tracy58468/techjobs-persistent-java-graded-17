package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @Size(max = 50, message = "Location is too long.")
    @NotBlank(message = "Location is required.")
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();

    /** Constructors **/

    public Employer() {
    }

    public Employer(String location) {

        this.location = location;

    }

    /** Getters and setters **/

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() { // allows list of employers to be viewed in the controllers
        return jobs;
    }
}

/** Will persist this class in part 2. DONE. **/