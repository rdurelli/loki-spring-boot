package com.example.demolog;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path="rest")
public class RestApiController { 

	private static final Logger LOGGER = LoggerFactory.getLogger(RestApiController.class);
																																																																																																																																
	@Autowired
	Environment environment;
	
	@GetMapping
	public ResponseEntity<String> apiCheck() throws Exception {
		LOGGER.info("===================inside API check ===================");
		throw new Exception("Something went wrong");
	}

}
