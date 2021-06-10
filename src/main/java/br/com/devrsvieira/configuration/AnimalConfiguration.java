package br.com.devrsvieira.configuration;

import br.com.devrsvieira.service.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author devrsvieira
 */

@Configuration
public class AnimalConfiguration {

   @Bean
   public Animal cachorro(){
       return new Animal() {
           @Override
           public void fazerBarulho() {
                System.out.println("Au au");
           }
       };
   }

    @Bean
    public Animal gato(){
        return new Animal() {
            @Override
            public void fazerBarulho() {
                System.out.println("Miau");
            }
        };
    }

}
