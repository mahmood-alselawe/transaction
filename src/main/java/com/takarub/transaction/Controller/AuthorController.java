package com.takarub.transaction.Controller;

import com.takarub.transaction.entity.Author;
import com.takarub.transaction.service.AuthorService;
import com.takarub.transaction.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService service;


    @PostMapping
    public void save(@RequestBody Author author){
        service.save(author);
    }


//    @GetMapping("{fn}")
//    public List<Author> findAllByFirstNameInIgnoreCase(List<String> fn){
//        return service.findAllByFirstNameInIgnoreCase(fn);
//    }

    @GetMapping("/{fn}")
    public List<Author> findAllByFirstNameInIgnoreCase(@RequestParam("fn") List<String> fn) {
        return service.findAllByFirstNameInIgnoreCase(fn);
    }


    @PutMapping
    public  Integer updateFirstName(@RequestParam String firstName , @RequestParam Integer id){
        return service.update(id,firstName);
    }

    @PutMapping("/updateAll/{firstName}")
    public void updateAlFirstName(@PathVariable String firstName){
        service.updateAllNameAuthor(firstName);
    }

    @GetMapping("/findByEmailQuery")
    public List<Author> findByEmailQuery(@RequestParam String email){
        return service.findByEmailQuery(email);
    }

    @PutMapping("/updateByNameQuery")
    public void updateByNameQuery(@RequestParam String lastName){
        service.updateByNameQuery(lastName);
    }







}
