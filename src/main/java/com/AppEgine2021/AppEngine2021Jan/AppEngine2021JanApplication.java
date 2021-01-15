package com.AppEgine2021.AppEngine2021Jan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AppEngine2021JanApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppEngine2021JanApplication.class, args);
	}

}

@RestController
class AppEngineContoller{

	Logger logger = LoggerFactory.getLogger(AppEngineContoller.class);

	@GetMapping("/")
	public String hello(){
		logger.info("Hello all");
		return "hello all";
	}

	@GetMapping("/info")
	public String helloInfo(){
		logger.info("Hello info");
		return "hello Info";
	}

	@GetMapping("/warn")
	public String helloWarn(){
		logger.warn("Hello warning message");
		return "hello Warning";
	}

	@GetMapping("/errorMessage")
	public String helloError(){
		logger.error("Hello error Message");
		return "hello Error";
	}
}
