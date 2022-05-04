package Com.dio.santander.banklineapi.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.dio.santander.banklineapi.dto.NovoCorrentista;
import Com.dio.santander.banklineapi.model.Conta;
import Com.dio.santander.banklineapi.model.Correntista;
import Com.dio.santander.banklineapi.repository.CorrentistaRepository;

@Service
public class CorrentistaService {

	@Autowired
	private CorrentistaRepository repository;
	
	public void safe(NovoCorrentista novoCorrentista) {
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(conta);
		 repository.save(correntista);
	}
}
