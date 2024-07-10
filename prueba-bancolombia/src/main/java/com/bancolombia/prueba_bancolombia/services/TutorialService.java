package com.bancolombia.prueba_bancolombia.services;

import com.bancolombia.prueba_bancolombia.models.Tutorial;
import com.bancolombia.prueba_bancolombia.repositories.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TutorialService {

    @Autowired
    private TutorialRepository tutorialRepository;

    public List<Tutorial> findAll() {
       return tutorialRepository.findAll();
    }

    public List<Tutorial> findByTitleContaining(String title) {
        return tutorialRepository.findByTitleContaining(title);

    }

    public Optional<Tutorial> findById(long id){
        return tutorialRepository.findById(id);

    }

    public Tutorial save(Tutorial tutorial){
        return tutorialRepository.save(tutorial);

    }

    public void deleteById(long id){
        tutorialRepository.deleteById(id);
    }






}