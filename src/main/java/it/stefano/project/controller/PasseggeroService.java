package it.stefano.project.controller;

import java.util.List;

import it.stefano.project.model.Passeggero;

public interface PasseggeroService {
	
	public void inserisci(Passeggero pass);
	public void aggiorna(Passeggero pass);
    public void cancella(Passeggero pass);  
	public Passeggero getPasseggeroById(Integer id);
	public List<Passeggero> getAllPasseggeri();
}
