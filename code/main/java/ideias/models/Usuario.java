package ideias.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {

	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String senha;
	private Integer matricula;
	private boolean aluno;

	@OneToMany(mappedBy="usuario")
	private List<Ideias> ideias = new ArrayList<>();

	public List<Ideias> getIdeias() {
		return ideias;
	}
	public void setIdeias(List<Ideias> ideias) {
		this.ideias = ideias;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public boolean isAluno() {
		return aluno;
	}
	public void setAluno(boolean aluno) {
		this.aluno = aluno;
	}
	
}
