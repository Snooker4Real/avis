package fr.snooker4real.avis.business;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Avis {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;

       @Temporal(TemporalType.DATE)
       private Date dateEnvoi;

       private float note;

       @Lob
       private String description;

       @ManyToOne
       private Joueur joueur;

       @ManyToOne
       private Jeu jeu;

       public Avis() {
       }

       public Avis(Long id, Date dateEnvoi, float note, String description, Joueur joueur, Jeu jeu) {
              this.id = id;
              this.dateEnvoi = dateEnvoi;
              this.note = note;
              this.description = description;
              this.joueur = joueur;
              this.jeu = jeu;
       }

       public Long getId() {
              return id;
       }

       public void setId(Long id) {
              this.id = id;
       }

       public Date getDateEnvoi() {
              return dateEnvoi;
       }

       public void setDateEnvoi(Date dateEnvoi) {
              this.dateEnvoi = dateEnvoi;
       }

       public float getNote() {
              return note;
       }

       public void setNote(float note) {
              this.note = note;
       }

       public String getDescription() {
              return description;
       }

       public void setDescription(String description) {
              this.description = description;
       }

       public Joueur getJoueur() {
              return joueur;
       }

       public void setJoueur(Joueur joueur) {
              this.joueur = joueur;
       }

       public Jeu getJeu() {
              return jeu;
       }

       public void setJeu(Jeu jeu) {
              this.jeu = jeu;
       }

       @Override
       public String toString() {
              return "Avis{" +
                      "id=" + id +
                      ", dateEnvoi=" + dateEnvoi +
                      ", note=" + note +
                      ", description='" + description + '\'' +
                      ", joueur=" + joueur +
                      ", jeu=" + jeu +
                      '}';
       }
}
