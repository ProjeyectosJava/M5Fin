package com.m5fin.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccidenteRepositorio extends CrudRepository<Accidentes, Integer>{

}
