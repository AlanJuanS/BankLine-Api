package Com.dio.santander.banklineapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.dio.santander.banklineapi.dto.NovaMovimentacao;


import Com.dio.santander.banklineapi.model.Movimentacao;

import Com.dio.santander.banklineapi.repository.MovimentacaoRepository;

import Com.dio.santander.banklineapi.service.MovimentacaoService;

@RestController
@RequestMapping("/Movimentacoes")
public class MovimentacaoController {

		@Autowired
		private MovimentacaoRepository repository;
		
		@Autowired
		public MovimentacaoService service;
		
		
		@GetMapping
		public List<Movimentacao> findAll(){
			return repository.findAll();
		}
		
		@PostMapping
		public void save(@RequestBody NovaMovimentacao novaMovimentacao) {
			service.save(novaMovimentacao);
			
			
		}
}
