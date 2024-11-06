package com.example.demo.config;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student mariam = new Student(

                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.MAY, 5),
                    21
            );


            Student alex = new Student(

                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5),
                    18
            );


            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
