package fr.snooker4real.avis.business;

import javax.persistence.*;
import java.util.List;

@Entity
public class Classification {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;

       private String nom;

       @OneToMany(mappedBy = "classification")
       private List<Jeu> jeu;

       public Classification() {
       }

       public Classification(Long id, String nom, List<Jeu> jeu) {
              this.id = id;
              this.nom = nom;
              this.jeu = jeu;
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

       public List<Jeu> getJeu() {
              return jeu;
       }

       public void setJeu(List<Jeu> jeu) {
              this.jeu = jeu;
       }

       @Override
       public String toString() {
              return "Classification{" +
                      "id=" + id +
                      ", nom='" + nom + '\'' +
                      ", jeu=" + jeu +
                      '}';
       }
}
