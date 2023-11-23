package com.example.amigosfullstack.student;

import java.util.UUID;

public class Student {
    private final UUID id;
    private final String first_name;
    private final String last_name;
    private final String email;

    private final Gender gender;

    public enum Gender {
        MALE, FEMALE
    }
    
    public Student(UUID id, String firstName, String lastName, String email, Gender gender) {
        this.id = id;
        first_name = firstName;
        last_name = lastName;
        this.email = email;
        this.gender = gender;
    }

    public UUID getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }
}
