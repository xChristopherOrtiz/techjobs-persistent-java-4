package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description cannot be blank")
    @Size(max = 1000, message = "Description cannot be longer than 1000 characters")
    private String description;

    // Constructor
    public Skill(String description) {
        this.description = description;
    }

    // Default constructor for JPA
    public Skill() {
    }

    // Getter and setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
