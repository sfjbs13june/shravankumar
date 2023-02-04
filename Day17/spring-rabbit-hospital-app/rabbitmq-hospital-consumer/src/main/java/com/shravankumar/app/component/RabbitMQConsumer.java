package com.shravankumar.app.component;

import com.shravankumar.app.model.HospitalConsumer;
import com.shravankumar.app.model.PatientConsumer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {
  @Value("${rabbitmq.queue.name}")
  String queueName;

  @Value("${rabbitmq.exchange.name}")
  String exchange;

  @Value("${rabbitmq.routingkey.name}")
  private String routingkey;
  @Bean
  public Jackson2JsonMessageConverter converter() {
    return new Jackson2JsonMessageConverter();
  }

  @RabbitListener(queues = "${rabbitmq.queue.name}")
  public void recievedMessage(HospitalConsumer hospitalConsumer) {
    System.out.println("Received Message From RabbitMQ: " + hospitalConsumer);
  }

  @RabbitListener(queues = "${rabbitmq.queue.name}")
  public void recievedMessage1(PatientConsumer patientConsumer) {
    System.out.println("Received Message From RabbitMQ: " + patientConsumer);
  }
}
