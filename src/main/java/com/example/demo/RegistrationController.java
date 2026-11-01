package com.example.demo;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/registration")
public class RegistrationController{
           private final RegistrationService registrationService;
           public RegistrationController(RegistrationService registrationService){
                    this.registrationService=registrationService;
           }
           @GetMapping
           public List<Registration> getAllRegistrations(){
            return registrationService.getAllRegistrations();
           }
           @PostMapping
           public Registration addRegistration(@RequestBody Registration registration){
                return registrationService.addRegistration(registration);
           }
}


