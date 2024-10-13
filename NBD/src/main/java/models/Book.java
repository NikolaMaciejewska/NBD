package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Table
@Entity
public class Book extends Volume {

    private String author;

}
