package gov.goias.producer.sms;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", path = "/")
public class Controller {
	
	private final Service service;
	
	public Controller(Service service) {
		this.service = service;
		
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public void post(@RequestBody SmsDto smsDto) {
		service.enviar(smsDto);	
		
		
	}

}
