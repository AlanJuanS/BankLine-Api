package Com.dio.santander.banklineapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.dio.santander.banklineapi.dto.NovoCorrentista;
import Com.dio.santander.banklineapi.model.Correntista;
import Com.dio.santander.banklineapi.repository.CorrentistaRepository;
import Com.dio.santander.banklineapi.service.CorrentistaService;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

		@Autowired
		private CorrentistaRepository repository;
		
		@Autowired
		public CorrentistaService service;
		
		
		@GetMapping
		public List<Correntista> findAll(){
			return repository.findAll();
		}
		
		@PostMapping
		public void save(@RequestBody NovoCorrentista correntista) {
			service.safe(correntista);
			
			
		}
}
