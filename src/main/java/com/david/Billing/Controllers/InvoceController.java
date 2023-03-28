package com.david.Billing.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.Billing.Entity.Invoce;
import com.david.Billing.Repository.InvoceRepository;

@RestController
@RequestMapping("/invoce")
public class InvoceController {
	
	
    @Autowired
    private InvoceRepository customerRepository;

    @GetMapping
    public List<Invoce> findAll(){
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Invoce get(@PathVariable String id){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Invoce input){
        Invoce save = customerRepository.save(input);
        return ResponseEntity.ok(save);
    }

    @PostMapping("/{id}")
    public  ResponseEntity<?> post(@RequestBody Invoce input){
        Invoce save = customerRepository.save(input);
        return ResponseEntity.ok(save);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
        return null;
    }

}
