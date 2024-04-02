package com.takarub.transaction.service;

import com.takarub.transaction.Repository.AuthorRepository;
import com.takarub.transaction.Repository.EmployeeRepository;
import com.takarub.transaction.entity.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository repository;


    public void save(Author author){
        repository.save(author);
    }

    public List<Author> findAllByFirstNameInIgnoreCase(List<String> fn){
        return repository.findAllByFirstNameInIgnoreCase(fn);
    }

    public Integer update(Integer id , String firstName){
        return repository.updateAuthor(id,firstName);
    }

    public void  updateAllNameAuthor(String firstName){
        repository.updateAllNameAuthor(firstName);
    }

    public List<Author> findByEmailQuery(String email){
        return repository.findByEmailQuery(email);
    }

    public void updateByNameQuery(String lastName){
        repository.updateByNameQuery(lastName);
    }




}
