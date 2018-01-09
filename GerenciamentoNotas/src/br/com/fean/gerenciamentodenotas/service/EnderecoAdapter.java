/*package br.com.fean.gerenciamentodenotas.service;

import org.springframework.stereotype.Service;

import br.com.fean.gerenciamentodenotas.model.Aluno;

@Service
public class EnderecoAdapter extends EnderecoServiceImpl implements EnderecoService {

	@Override
	public void setarEndereco(Aluno aluno, String endereco) {
		
		String[] enderecoAntigo = endereco.split(",");
		
		String estado = enderecoAntigo[0];
		String cidade = enderecoAntigo[1];
		String bairro = enderecoAntigo[2];
		String rua = enderecoAntigo[3];
		String numero = enderecoAntigo[4];
		String cep = enderecoAntigo[5];
		
		setarEnderecoAtualizado(aluno, estado, cidade, bairro, rua, numero, cep);
	}

}*/
