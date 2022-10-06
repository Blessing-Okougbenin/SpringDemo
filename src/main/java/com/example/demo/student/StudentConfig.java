package com.example.demo.student;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
@Slf4j
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner
            (StudentRepository studentRepository){
        return args -> {
            Student blessing = new Student(
                    "Blessing",
                    "blessing@gmail.com",
                    LocalDate.of(2000,Month.APRIL,7));
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000,Month.APRIL,7));
            studentRepository.saveAll(
                    List.of(blessing, alex));
//            log.info("Created Students --> {}", blessing);
//            log.info("Created Students --> {}", alex);

        };


    }
}
