package com.takarub.transaction.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

@NamedQueries(
        {
                @NamedQuery(
                        name = "Author.findByEmailQuery",
                        query = "select a from Author a where a.email = :email"

                ),
                @NamedQuery(
                        name = "Author.updateByNameQuery",
                        query = "update Author a set a.lastName = :lastName  "
                )
        }

)

public class Author {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;
}
