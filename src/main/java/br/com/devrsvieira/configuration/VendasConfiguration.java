package br.com.devrsvieira.configuration;

import br.com.devrsvieira.service.Animal;
import br.com.devrsvieira.annotation.Cachorro;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author devrsvieira
 */

@Configuration
public class VendasConfiguration {

    @Cachorro
    private Animal animal;

    @Bean(name ="executarAnimal")
    public CommandLineRunner executar(){
        return args -> animal.fazerBarulho();
    }

}
