package com.AcademiaRestJPA.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AcademiaRestJPA.Models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
