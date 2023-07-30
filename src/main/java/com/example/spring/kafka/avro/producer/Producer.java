package com.example.spring.kafka.avro.producer;

import com.example.spring.kafka.avro.schema.User;
import com.google.common.util.concurrent.ListenableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.concurrent.CompletableFuture;

@Service
public class Producer {
    @Value("${avro.publisher.topicName}")
    private String topicName;

    @Autowired
    KafkaTemplate<String,User> kafkaTemplate;

    public void publishUser(User user){
        CompletableFuture<SendResult<String,User>> future=  kafkaTemplate.send(topicName,String.valueOf(user.getUserId()),user);

        future.whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("Sent message=[" + user +
                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
            } else {
                System.out.println("Unable to send message=[" +
                        user + "] due to : " + ex.getMessage());
            }
        });
    }
}
