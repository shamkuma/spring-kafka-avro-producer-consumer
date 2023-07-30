package com.example.spring.kafka.avro.consumer;

import com.example.spring.kafka.avro.schema.User;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserConsumer {
    @KafkaListener(topics="${avro.publisher.topicName}",containerFactory = "kafkaListenerContainerFactory")
    public void readUser(ConsumerRecord<String, User> record){
        String key=record.key();
        User user=record.value();
        System.out.println("Avro Message received for Key :"+key+" Value:"+user.toString());
    }
}
