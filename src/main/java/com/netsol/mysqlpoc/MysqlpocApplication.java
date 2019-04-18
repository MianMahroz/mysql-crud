package com.netsol.mysqlpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.netsol" })
@EntityScan("com.netsol")
@PropertySource(value = { "classpath:application.properties" })
@EnableJpaRepositories(basePackages = "com.netsol")
public class MysqlpocApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlpocApplication.class, args);
	}
	

}
