package com.phcodegyan.H2DatabaseSetup.controller;

import com.phcodegyan.H2DatabaseSetup.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@RestController
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;
    @PostMapping("/Consumer")
    public String saveConsumer(@RequestBody Consumer consumer)
    {
     /* consumerService.save(consumer);*/
    /*consumerService.saveConsumer(consumer);*/
       /* consumerService.getAllConsumers();*/


        return "Consumer.getConsumerid()";
    }
    @GetMapping("/getAllConsumers")
    public List<com.phcodegyan.H2DatabaseSetup.models.Consumer>getAllConsumers(){
        return consumerService.getAllConsumers();
    }
    @GetMapping("/getConsumer/{id}")
    public Optional<com.phcodegyan.H2DatabaseSetup.models.Consumer> getConsumer(@PathVariable("id") Long id){
        return consumerService.getConsumerById(id);
    }
    @DeleteMapping("deleteConsumer/{id}")
    public void deleteConsumer(@PathVariable("id") Long id){
        consumerService.deleteConsumer(id);
    }
}
