package br.com.devrsvieira.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author devrsvieira
 */

@Configuration
public class VendasConfigutarion {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de Vendas";
    }

}
