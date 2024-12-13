package org.example.controlle_blanc;

import java.util.List;

public interface MembreDao {
    public boolean inserer(Membre membre);
    public List<Incident> chargerListIncidents();
}
