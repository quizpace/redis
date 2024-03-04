package com.example.demo;

import com.example.demo.repository.CacheRepositoryImpl;
import com.example.demo.services.RedisDetailsConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
@EnableConfigurationProperties(value = {RedisDetailsConfig.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(CacheRepositoryImpl cacheRepositoryImpl) {
		return args -> {
			// SHOW --> ResponseEntity!!


//			cacheRepositoryImpl.createCacheEntity("key1", "value1");

			String result = cacheRepositoryImpl.getCacheEntity("key1");
			System.out.println(result);
		};
	}
}
