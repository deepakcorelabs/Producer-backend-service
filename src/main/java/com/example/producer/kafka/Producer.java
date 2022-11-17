package com.example.producer.kafka;

import com.example.producer.DTO.DeviceMasterDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer
{
    @Value("${spring.kafka.topic.name}")
    private String BOOKING_KAFKA_TOPIC;
    @Autowired
    private KafkaTemplate<String,String>kafkaTemplate;

    @Autowired
    ObjectMapper objectMapper;

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    public void sendMessage(String BOOKING_KAFKA_TOPIC, DeviceMasterDTO deviceMasterDTO) throws JsonProcessingException {
        logger.info(String.format("#### -> Producing notification message -> %s", deviceMasterDTO.toString()));

        kafkaTemplate.send(BOOKING_KAFKA_TOPIC,objectMapper.writeValueAsString(deviceMasterDTO));

    }
}
