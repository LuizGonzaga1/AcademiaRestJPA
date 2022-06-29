package com.AcademiaRestJPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.AcademiaRestJPA.Models.Produto;
import com.AcademiaRestJPA.Repositories.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping
	public List<Produto> getProduto() {
		return produtoRepository.findAll();
	}
	
	@PostMapping("/cadastrar")
	@ResponseStatus(HttpStatus.CREATED)
	public Produto adicionar(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}

	@GetMapping("/{id}")
	Produto getProduto(@PathVariable Long id) {

		return produtoRepository.findById(id).get();

	}
	
	@DeleteMapping ("/excluir/{id}")
	void deleteProduto(@PathVariable Long id) {
		produtoRepository.deleteById(id);
	}
	
	@PutMapping("/alterar/{id}")
	Produto updateProduto(@RequestBody Produto novaProduto, @PathVariable Long id) {
		Produto p = produtoRepository.findById(id).get();
		p.setNome(novaProduto.getNome());
		return produtoRepository.save(p);
		
	}


}
