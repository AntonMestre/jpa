package fr.antonin.jpa.surf;

import java.util.UUID;

import fr.antonin.jpa.store.Store;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/* @Table(name="STUDENT") */
@Entity
/* @NoArgsConstructor */
@Getter @Setter @AllArgsConstructor
public class Surf {
    
    /* When to use UUID: Distributed system or scaling systeme in general
     * Because 1: if we add from another database that used the incremental: problem
     * 2: When multiinstance, no need to wait to INSERT (1,2,3..) when can do in paralel 
     */
    @Id
    @GeneratedValue(generator = "UUID")
    @Setter(AccessLevel.PROTECTED)
    private UUID id;

    private String name;
    private Double initialPrice;

    @ManyToOne
    @JoinColumn(name = "store_id")
    /* fetch = FetchType.LAZY; fetch = FetchType.EAGER -> might impact performance 
     * 
     * Default:
     * @OneToMany @ManyToMany -> FetchType.LAZY
     * @ManyToOne @OneToOne -> FetchType.EAGER
    */
    private Store store;
}
