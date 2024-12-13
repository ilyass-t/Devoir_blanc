package org.example.controlle_blanc;

import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
public class Membre {
    private int identifiant;
    private String nom;
    private String prenom;
    private String email;
    private String phone;
    private List<Incident> incidents;

    public Membre() {
    }

    public Membre(String nom, String prenom, String email, String phone) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Membre membre)) return false;
        return identifiant == membre.identifiant && Objects.equals(nom, membre.nom) && Objects.equals(prenom, membre.prenom) && Objects.equals(email, membre.email) && Objects.equals(phone, membre.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiant, nom, prenom, email, phone);
    }
    public Membre parseLine(String line) {
        String[] split = line.split(",");
        if(split.length == 4) {
            String nom=split[0].trim();
            String prenom=split[1].trim();
            String email=split[2].trim();
            String phone=split[3].trim();
            return new Membre(nom, prenom, email, phone);
        }
        return null;
    }
    public Set<Membre> chargerListeMembre(String nomFichier){
        Set<Membre> membreSet = new HashSet<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomFichier));
            String line;
            while((line= String.valueOf(br.readLine()))!=""){
                membreSet.add(parseLine(line));


            }
            br.close();
            return membreSet;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    }




