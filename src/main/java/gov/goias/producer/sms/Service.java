package gov.goias.producer.sms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

@org.springframework.stereotype.Service
public class Service {
	
	 private final String topic;
	
	 private final KafkaTemplate<String, SmsDto> kafkaTemplate;
	 
	 public Service(@Value("${spring.kafka.template.default-topic}") String topic, 
			 KafkaTemplate<String, SmsDto> kafkaTemplate) {		 
		 this.topic = topic;
		 this.kafkaTemplate = kafkaTemplate;		 
	 }
	 

	public void enviar(SmsDto smsDto) {
		
		kafkaTemplate.send(topic, smsDto);
	}

}
