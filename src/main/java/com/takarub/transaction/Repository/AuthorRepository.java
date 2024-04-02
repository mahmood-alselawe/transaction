package com.takarub.transaction.Repository;

import com.takarub.transaction.entity.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author , Integer> {

    List<Author> findByEmailQuery(@Param("email") String email);

    @Modifying
    @Transactional
    void updateByNameQuery(@Param("lastName") String lastName);


//    @Modifying
//    @Transactional
//    @Query("update Author a set.firstName = :firstName where a.id = :id")
//    public Integer updateAuthor(Integer id,String firstName);

    @Modifying
    @Transactional
    @Query("update Author a set a.firstName = :firstName where a.id = :id")
    public Integer updateAuthor(Integer id, String firstName);

    @Modifying
    @Transactional
    @Query("update Author a set a.firstName = :firstName")
    public void updateAllNameAuthor(String firstName);

    List<Author> findAllByFirstName(String fn);

    List<Author> findAllByFirstNameIgnoreCase(String fn);


    // select * from Author where firstName like '%fn%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);


    // select * from Author where firstName like 'fn%'
    List<Author> findAllByFirstNameStartingWithIgnoreCase(String fn);


    // select * from Author where firstName like '%fn'
    List<Author> findAllByFirstNameEndingWithIgnoreCase(String fn);

    // select * from Author where firstName in ('fn','fn','fn')
    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstName);









}
