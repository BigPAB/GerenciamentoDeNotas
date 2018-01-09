package br.com.fean.gerenciamentodenotas.service;

import org.springframework.stereotype.Service;

import br.com.fean.gerenciamentodenotas.model.Aluno;
//import br.com.fean.gerenciamentodenotas.model.Endereco;

@Service
public class EnderecoServiceImpl implements EnderecoService {

	@Override
	public void setarEndereco(Aluno aluno, String endereco) {
		aluno.setEndereco(endereco);
		
		System.out.println(endereco);
		
	}
	
	/*public void setarEnderecoAtualizado(Aluno aluno, String estado, String cidade, String bairro, String rua, String numero, String cep) {
		
		Endereco enderecoAtualizado = new Endereco(estado, cidade, bairro, rua, numero, cep);
		
		aluno.setEnderecoAtualizado(enderecoAtualizado);
		
		System.out.println(estado + cidade + bairro + rua + numero + cep);
	}*/

}
