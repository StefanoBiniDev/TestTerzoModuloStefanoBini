package it.stefano.project.controller;

import java.util.List;
import it.stefano.project.model.Passeggero;
import jakarta.ejb.Stateful;

import jakarta.persistence.*;

@Stateful
public class PasseggeroServiceBean implements PasseggeroServiceBeanLocal {
	@PersistenceContext(unitName="TestTerzoModuloStefanoBini")
	EntityManager manager;

    public PasseggeroServiceBean() {}
    
    public void inserisci(Passeggero pass) {
    	manager.persist(pass);	
    }
    
    public void aggiorna(Passeggero pass) {
    	manager.merge(pass);	
    }
    	
    public void cancella(Passeggero pass) {
    	manager.remove(pass);	
    }

	@Override
	public Passeggero getPasseggeroById(Integer id) {
	
		Query q = manager.createQuery("select p from Passeggeri p where id_passeggero = 'id'");
		q.setParameter("id", id).executeUpdate();
		@SuppressWarnings("unchecked")
		Passeggero pass = (Passeggero) q.getSingleResult();
		return pass;
	}
	
	@Override
	public List<Passeggero> getAllPasseggeri() {

		Query q = manager.createNamedQuery("elencoPasseggeri",Passeggero.class);
		//Query q = manager.createQuery("select p from Passeggeri p",Passeggero.class);
		int id = 1; 
        q.setParameter("id", id).executeUpdate();
		@SuppressWarnings("unchecked")
		List<Passeggero> listaPasseggeri = q.getResultList();
		return listaPasseggeri;
	}
}
