package br.com.developeralexandresantos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"br.com.developeralexandresantos"})
public class WeatherSoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherSoapApplication.class, args);
	}

}
