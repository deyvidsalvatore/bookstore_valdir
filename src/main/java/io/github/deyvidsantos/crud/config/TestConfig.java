package io.github.deyvidsantos.crud.config;

import io.github.deyvidsantos.crud.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;

    @Bean
    void instanciaBaseDeDados() {
        this.dbService.instanciaBaseDeDados();
    }

}
