package br.com.devrsvieira.configuration;

import br.com.devrsvieira.annotation.Dev;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

/**
 * @author devrsvieira
 */

@Dev
public class VendasDevConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO...");
    }

}
