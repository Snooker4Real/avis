package fr.snooker4real.avis.business;

import javax.persistence.*;
import java.util.List;

@Entity
public class Plateforme {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;

       private String nom;

       @ManyToMany
       private List<Jeu> jeux;

       public Plateforme() {
       }

       public Plateforme(Long id, String nom, List<Jeu> jeux) {
              this.id = id;
              this.nom = nom;
              this.jeux = jeux;
       }

       public Long getId() {
              return id;
       }

       public void setId(Long id) {
              this.id = id;
       }

       public String getNom() {
              return nom;
       }

       public void setNom(String nom) {
              this.nom = nom;
       }

       public List<Jeu> getJeux() {
              return jeux;
       }

       public void setJeux(List<Jeu> jeux) {
              this.jeux = jeux;
       }

       @Override
       public String toString() {
              return "Plateforme{" +
                      "id=" + id +
                      ", nom='" + nom + '\'' +
                      ", jeux=" + jeux +
                      '}';
       }
}
