package com.skill.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerPatternController {
	
	Logger logger=LoggerFactory.getLogger(CircuitBreakerPatternController.class);
	@GetMapping("/dummy")
	@Retry(name="dummy-api",fallbackMethod="serviceNotFound")
	@CircuitBreaker(name="default",fallbackMethod="serviceNotFound")
	public String dummyMethodApiEndpoint()
	{
		logger.info("----------->trying for reponse---------->");
		RestTemplate template=new RestTemplate();
		ResponseEntity<String> reposnseEntity = template.getForEntity("http://localhost:8888/MovieApp/dummy", String.class);
		return reposnseEntity.getBody();
	}
	
	public String serviceNotFound(Exception ex)
	{
		return "Dummy Method API"+ex.getMessage();
	}
}