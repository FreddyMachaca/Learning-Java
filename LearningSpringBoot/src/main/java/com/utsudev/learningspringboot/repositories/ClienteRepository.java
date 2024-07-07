package com.utsudev.learningspringboot.repositories;

import com.utsudev.learningspringboot.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
