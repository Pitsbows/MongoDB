package com.ironhack.EnterpriseJavaDevelopment78.services.impl;

import com.ironhack.EnterpriseJavaDevelopment78.model.Football;
import com.ironhack.EnterpriseJavaDevelopment78.repository.FootballRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootballService {

    @Autowired
    private FootballRepository footballRepository;


    public void addFootball(Football football){
        footballRepository.save(football);
    }


    public List<Football> getAllFootball(){
        return footballRepository.findAll();
    }
}
