package com.tienda.dao;

import com.tienda.domain.Credito;
import org.springframework.data.repository.CrudRepository;


public interface CreditoDao extends CrudRepository<Credito, Long>{   //Hereda del crud repository y hay que poner el tipo de la llabve primaria "long"
    
}


