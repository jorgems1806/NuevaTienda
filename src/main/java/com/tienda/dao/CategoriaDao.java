package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.repository.CrudRepository;


public interface CategoriaDao extends CrudRepository<Categoria, Long>{   //Hereda del crud repository y hay que poner el tipo de la llabve primaria "long"
    
}
