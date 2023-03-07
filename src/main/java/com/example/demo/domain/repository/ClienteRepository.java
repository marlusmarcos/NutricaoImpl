package com.example.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
