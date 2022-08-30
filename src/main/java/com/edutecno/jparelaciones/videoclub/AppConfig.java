package com.edutecno.jparelaciones.videoclub;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//1) SE COPIA EL AppConfig del proyecto anterior "jpacrud". Se cambia solo el ComponentScan por la ruta en la que esta. 
//LUEGO SE CREAN LAS ENTIDADES EN LA CAPA DE MODELO 

@Configuration
@ComponentScan("com.edutecno.jparelaciones.videoclub")
@PropertySource("classpath:database.properties")
public class AppConfig {

	@Autowired
	Environment environment;

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setUrl(environment.getProperty("url"));
		dmds.setUsername(environment.getProperty("dbuser"));
		dmds.setPassword(environment.getProperty("dbpassword"));
		dmds.setDriverClassName(environment.getProperty("driver"));
		return dmds;
	}

}
