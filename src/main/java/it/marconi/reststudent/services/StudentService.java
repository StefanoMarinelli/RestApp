package it.marconi.reststudent.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marconi.reststudent.domains.Student;
import it.marconi.reststudent.repositories.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepo;

    public Student save(Student s){
        return studentRepo.save(s);
    }
}
