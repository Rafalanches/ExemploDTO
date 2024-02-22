package com.exemploDTO.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemploDTO.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro,Long>{

}
