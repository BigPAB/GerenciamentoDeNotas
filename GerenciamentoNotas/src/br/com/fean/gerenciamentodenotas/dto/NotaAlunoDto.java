package br.com.fean.gerenciamentodenotas.dto;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class NotaAlunoDto {
	
	@NonNull
	private String matriculaAluno;
	@NonNull
	private String idMateria;
	
	private double notaAv1 = 0.0;
	
	private double notaAv2 = 0.0;
	private double notaAv3 = 0.0;
	public String getMatriculaAluno() {
		return matriculaAluno;
	}
	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
	public String getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}
	public double getNotaAv1() {
		return notaAv1;
	}
	public void setNotaAv1(double notaAv1) {
		this.notaAv1 = notaAv1;
	}
	public double getNotaAv2() {
		return notaAv2;
	}
	public void setNotaAv2(double notaAv2) {
		this.notaAv2 = notaAv2;
	}
	public double getNotaAv3() {
		return notaAv3;
	}
	public void setNotaAv3(double notaAv3) {
		this.notaAv3 = notaAv3;
	}
	
	

}
