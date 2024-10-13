package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table
@Entity
public class Book {
    @Id
    private Long id;


}
