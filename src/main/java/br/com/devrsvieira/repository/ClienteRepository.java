package br.com.devrsvieira.repository;

import br.com.devrsvieira.model.Cliente;
import org.springframework.stereotype.Repository;

/**
 * @author devrsvieira
 */

@Repository
public class ClienteRepository {

    public void persistir(Cliente cliente) {
        System.out.println("Persistindo cliente");
    }

}
