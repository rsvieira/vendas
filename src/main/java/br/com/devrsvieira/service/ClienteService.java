package br.com.devrsvieira.service;

import br.com.devrsvieira.model.Cliente;
import br.com.devrsvieira.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author devrsvieira
 */

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        clienteRepository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        System.out.println("Validando cliente");
    }

}
