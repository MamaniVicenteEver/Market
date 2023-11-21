	package com.ever.market;

	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

	@SpringBootApplication
	@EnableJpaRepositories
	public class MarketApplication {
		public static void main(String[] args) {

			SpringApplication.run(MarketApplication.class, args);
		}
	}
