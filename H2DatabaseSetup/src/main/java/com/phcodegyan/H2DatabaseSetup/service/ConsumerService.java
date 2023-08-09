package com.phcodegyan.H2DatabaseSetup.service;

import com.phcodegyan.H2DatabaseSetup.models.Consumer;
import com.phcodegyan.H2DatabaseSetup.repositories.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ConsumerService {
  @Autowired
  ConsumerRepository consumerRepository;

  public void saveConsumer(Consumer consumer) {
     consumerRepository.save(consumer);
  }
  public List<Consumer> getAllConsumers(){
    return consumerRepository.findAll();

  }
  public Optional<Consumer> getConsumerById(Long id){
    return consumerRepository.findById(id);
  }
  public void deleteConsumer(Long id){
    consumerRepository.deleteById(id);
  }

  }
