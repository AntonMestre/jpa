package fr.antonin.jpa;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor
public class Store {
    @Id
    @GeneratedValue(generator = "UUID")
    @Setter(AccessLevel.PROTECTED)
    private UUID id;

    @OneToMany(mappedBy = "store")
    List<Surf> surfs;
}
