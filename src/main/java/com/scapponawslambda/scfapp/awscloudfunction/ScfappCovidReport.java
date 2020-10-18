package com.scapponawslambda.scfapp.awscloudfunction;

import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

@Component
public class ScfappCovidReport {

	@Bean
	public Supplier<APIGatewayProxyResponseEvent> getCovidStatus() {

		return () -> getCovidReport();
	}

	private APIGatewayProxyResponseEvent getCovidReport() {
		RestTemplate template = new RestTemplate();
		String url = "https://api.covid19api.com/world/total";
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		APIGatewayProxyResponseEvent gwResponse = new APIGatewayProxyResponseEvent();
		gwResponse.setBody(response.getBody());

		return gwResponse;
	}

}
