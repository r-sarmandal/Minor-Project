package com.safe_and_found;

import com.safe_and_found.repository.FoundPostRepository;
import com.safe_and_found.services.FoundPostService;
import com.safe_and_found.services.IdFoundPostService;
import com.safe_and_found.services.KeyFoundPostService;
import com.safe_and_found.services.LostPostService;
import com.safe_and_found.services.implementations.LostPostServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SafeandfoundApplication implements CommandLineRunner {

	@Autowired
	private FoundPostService foundPostService;

	@Autowired
	private IdFoundPostService idFoundPostService;

	@Autowired
	KeyFoundPostService keyFoundPostService;

	@Autowired
	LostPostService lostPostService;

	public static void main(String[] args) {
		SpringApplication.run(SafeandfoundApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("STARTING WOOHOO");

	}
}
