package com.tienda.dao;

import com.tienda.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long>{   //Hereda del crud repository y hay que poner el tipo de la llabve primaria "long"
    
}
