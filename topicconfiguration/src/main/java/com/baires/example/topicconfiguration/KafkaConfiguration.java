package com.baires.example.topicconfiguration;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@EnableKafka
public class KafkaConfiguration {

    @Bean
    public NewTopic createUserTopic() {
        return TopicBuilder.name("users")
                .partitions(1)
                .replicas(1)
                .build();
    }




}
