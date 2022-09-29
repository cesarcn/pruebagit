package com.example.examenh93.interfa;

import com.example.examenh93.entity.AlumnosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnosInterface extends CrudRepository<AlumnosEntity, Integer> {
}
