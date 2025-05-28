package com.example.c3p0_demo;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.postgresql.Driver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

import java.beans.PropertyVetoException;

@SpringBootApplication
public class C3p0DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(C3p0DemoApplication.class, args);
	}

	@Bean
	public DataSource dataSource() throws PropertyVetoException {

		ComboPooledDataSource pooledDataSource = new ComboPooledDataSource();
		
		pooledDataSource.setDriverClass(Driver.class.getName());
		pooledDataSource.setUser("user");
		pooledDataSource.setPassword("password");
		pooledDataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/mydatabase");

		return pooledDataSource;
	}

}
