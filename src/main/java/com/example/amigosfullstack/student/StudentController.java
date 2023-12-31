package com.example.amigosfullstack.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentController {
    @GetMapping
    public List<Student> getAllStudents(){
        List<Student> students = List.of(
                new Student(UUID.randomUUID(),
                        "James",
                        "Bond",
                        "jamesbond@gmail.com",
                        Student.Gender.MALE),
                new Student(UUID.randomUUID(),
                        "Elisa",
                        "Tamara",
                        "elisatamara@gmail.com",
                        Student.Gender.FEMALE
                )
        );
        System.out.println("getMapping");
        return students;
    }
}
