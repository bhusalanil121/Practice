package com.dockerPractice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpa2OracleApplication  implements CommandLineRunner{
	
	@Autowired
	private CustomerRepo cusRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpa2OracleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Customer> listOfCustomer = cusRepo.findAll();
		listOfCustomer.forEach(System.out :: println);
//		System.out.println("Hi");
		
	}

}
