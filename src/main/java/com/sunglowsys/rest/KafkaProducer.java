//package com.sunglowsys.rest;
//
//
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class KafkaProducer {
//
//    private final KafkaTemplate<String , String> kafkaTemplate;
//    private final String topic = "my_topic";
//
//    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendMessage(String message) {
//        kafkaTemplate.send(topic, message);
//        System.out.println("Sent message: " + message);
//    }
//}
