package fr.antonin.jpa.store;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, UUID>{
    Store findByName(String name);
}
