package com.example.springboot.linter;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface linterRepository extends CrudRepository<Linter, Long> {}

