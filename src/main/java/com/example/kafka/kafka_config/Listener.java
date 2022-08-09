package com.example.kafka.kafka_config;

import com.example.kafka.entity.ToDo;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @KafkaListener(topics = "test", groupId = "groupId", containerFactory = "myFactory")
    void listen(ToDo toDo){
        System.out.println(toDo);
    }
}
