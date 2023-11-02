package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Job extends AbstractEntity {

    private String employer;
    private String skills;


    public Job() {
    }

    // Initialize the id and value fields.
    public Job(String anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

}

/** Will persist this class in part 2. DONE **/

/** Will add ORM in parts 3 and 4 by refactoring employer and skills fields. **/