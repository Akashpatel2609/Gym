package com.superb.EcomStore.service;


import com.superb.EcomStore.model.Trainer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public List<Trainer> getTrainers(){
        List<Trainer> trainers = new ArrayList<>();

        Trainer trainer1 = new Trainer(1,"https://www.beachfitbondi.com.au/wp-content/uploads/2019/07/Sean-Syd1-min-768x862.png", "Mr X1", "test description 1");

        Trainer trainer2 = new Trainer(2,"https://www.beachfitbondi.com.au/wp-content/uploads/2019/08/Abstacker1-min-768x862.png", "Mr X2", "test description 2");

        trainers.add(trainer1);
        trainers.add(trainer2);
        return trainers;


    }
    public List<Trainer> searchedTrainers(String trainerName){
        List<Trainer> trainers = new ArrayList<>();

        Trainer trainer1 = new Trainer(1,"https://www.beachfitbondi.com.au/wp-content/uploads/2019/07/Sean-Syd1-min-768x862.png", trainerName, "test description 1");

        trainers.add(trainer1);
        return trainers;


    }




}
