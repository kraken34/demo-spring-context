package dev;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import dev.ihm.Ecran2;
import dev.service.AppServiceMemoire;
import dev.service.AppServiceSQL;

@Configuration
// @ComponentScan({"dev.ihm", "dev.service"})
// @Import({ Ecran2.class, AppServiceMemoire.class })
@ImportResource("demo.xml")
public class SpringConfig {
	
	
	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}

}
