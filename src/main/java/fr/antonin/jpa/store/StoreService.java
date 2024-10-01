package fr.antonin.jpa.store;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.antonin.jpa.store.surf.Surf;

@Service
public class StoreService {
    
    private StoreRepository storeRepository;

    StoreService(StoreRepository storeRepository){
        this.storeRepository = storeRepository;
    }

    public Store openStore(String name, List<Surf> surfs){
        if(name.isEmpty())
            new Exception("Error: The name of the store can't be empty.");
        return storeRepository.save(new Store(null, name, surfs));
    }

    public Store findStore(String name){
        return storeRepository.findByName(name);
    }
}
