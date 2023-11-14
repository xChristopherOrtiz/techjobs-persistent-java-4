package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.JoinColumn;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany(mappedBy = "employer")
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();

    public List<Job> getJobs() {
        return jobs;
    }

    @NotBlank(message = "Location cannot be blank")
    @Size(max = 100, message = "Location cannot be longer than 100 characters")
    private String location;

    // Constructor
    public Employer(String location) {
        this.location = location;
    }

    // Default constructor for JPA
    public Employer() {
    }

    // Getter and setter for location
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;


    }
}
