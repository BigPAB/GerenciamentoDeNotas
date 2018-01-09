package br.com.fean.gerenciamentodenotas.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fean.gerenciamentodenotas.dao.NotaDao;
import br.com.fean.gerenciamentodenotas.model.Nota;

@Service
public class NotaServiceImpl implements NotaService {
	
	@Autowired
	NotaDao notaDao;

	@Override
	public String salvarNota( Nota nota) {
		
		return notaDao.salvarNota(nota);
	}

	@Override
	public String excluirNota(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alterarNota(String id, Nota nota) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List< Nota> listarNota() {
		
		return notaDao.listarNota();
	}

}
