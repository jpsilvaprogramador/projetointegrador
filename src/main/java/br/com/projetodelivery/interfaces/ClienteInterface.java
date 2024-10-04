package br.com.projetodelivery.interfaces;

import java.util.List;
import br.com.projetodelivery.model.Clientes;

public interface ClienteInterface {

    void inserir(Clientes cliente) throws ClassNotFoundException;
    List<Clientes>lista();
    
}
