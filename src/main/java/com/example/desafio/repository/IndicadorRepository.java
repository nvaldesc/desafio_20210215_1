package com.example.desafio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.desafio.models.entity.IndicadorEntity;



/**
 * Indicador Repository
 *
 * @author Néstor Valdés
 * @version 1.0
 * @since 2020-11-17
 */
@Repository
public interface IndicadorRepository extends CrudRepository<IndicadorEntity, String>{

}
