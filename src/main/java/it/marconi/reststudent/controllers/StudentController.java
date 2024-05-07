package it.marconi.reststudent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.marconi.reststudent.domains.Student;
import it.marconi.reststudent.services.StudentService;

@RestController
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    //Aggiungiamo uno student al servizio
    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student s){
        return studentService.save(s);
    }

    /*
    @GetMapping("getstudent")
    public Student getsStudent(){
        return null;
    }*/

}
