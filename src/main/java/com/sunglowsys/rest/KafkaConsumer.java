package com.sunglowsys.rest;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {


    @KafkaListener(topics = "my-topic")
    public void recevedMassage(String massage) {

        System.out.println("Receved massages : " + massage);
    }
}
