package fr;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Surf {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String name;
    private Double initialPrice;
}
