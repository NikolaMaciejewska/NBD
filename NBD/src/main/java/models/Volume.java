package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
@Entity
public class Volume {
    @Id
    private Long id;
    private String title;
    private String genre;
}
