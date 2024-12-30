package org.jsp.ums;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = { "org.jsp.ums" })
public class Config {

	@Bean
	public Scanner scanner() {
		System.out.println("Scanner Bean Method");
		return new Scanner(System.in);
	}

	@Bean
	public EntityManager entityManager() {
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}

}
