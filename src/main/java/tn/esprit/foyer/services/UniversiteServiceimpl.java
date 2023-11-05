package tn.esprit.foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.entities.Universite;
import tn.esprit.foyer.repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceimpl implements IUniversiteService{
    UniversiteRepository universiteRepository;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversity(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversity(long idUniversity){
        return universiteRepository.findById(idUniversity).orElse(null);
    }

    @Override
    public void removeUniversity(long idUniversity) {
        universiteRepository.deleteById(idUniversity);
    }
}


