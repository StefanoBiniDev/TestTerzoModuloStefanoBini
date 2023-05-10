package it.stefano.project.model;

import java.io.Serializable;

import jakarta.persistence.*;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "Passeggeri")
@NamedQuery(name="elencoPasseggeri", query ="select p from Passeggeri p")
public class Passeggero implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_passeggero")
	private Integer id_passeggero;
	@Column(name="nome")
	private String nome;
	@Column(name="cognome")
	private String cognome;
	@Column(name="data_prenot")
	private String data_prenot;

	public Passeggero() {}

	public int getIDPasseggero() {
		return id_passeggero;
	}

	public void setIDPasseggero(Integer id_passeggero) {
		this.id_passeggero = id_passeggero;
	}
	
	public String getData() {
		return data_prenot;
	}

	public void setData(String data) {
		this.data_prenot = data;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
}
