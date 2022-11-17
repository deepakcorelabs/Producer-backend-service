package com.example.producer.controller;

import com.example.producer.DTO.DeviceMasterDTO;
import com.example.producer.kafka.Producer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("/producer")
public class ProducerController
{
   @Autowired
   Producer producer;

   @Value("${spring.kafka.topic.name}")
   private String BOOKING_KAFKA_TOPIC;


    @PostMapping()
    public String sendData(@RequestBody @Validated DeviceMasterDTO deviceMasterDTO) throws JsonProcessingException {
    producer.sendMessage(BOOKING_KAFKA_TOPIC, deviceMasterDTO);
    return "Success";
   }

}
