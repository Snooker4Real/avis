package fr.snooker4real.avis.business;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Joueur {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;

       private String pseudo;

       private String motDePasse;

       @Temporal(TemporalType.TIMESTAMP)
       private Date dateInscription;

       private boolean estAdministrateur;

       @OneToMany(mappedBy = "joueur")
       private List<Avis> avis;

       public Joueur() {
       }

       public Joueur(Long id, String pseudo, String motDePasse, Date dateInscription, boolean estAdministrateur, List<Avis> avis) {
              this.id = id;
              this.pseudo = pseudo;
              this.motDePasse = motDePasse;
              this.dateInscription = dateInscription;
              this.estAdministrateur = estAdministrateur;
              this.avis = avis;
       }

       public Long getId() {
              return id;
       }

       public void setId(Long id) {
              this.id = id;
       }

       public String getPseudo() {
              return pseudo;
       }

       public void setPseudo(String pseudo) {
              this.pseudo = pseudo;
       }

       public String getMotDePasse() {
              return motDePasse;
       }

       public void setMotDePasse(String motDePasse) {
              this.motDePasse = motDePasse;
       }

       public Date getDateInscription() {
              return dateInscription;
       }

       public void setDateInscription(Date dateInscription) {
              this.dateInscription = dateInscription;
       }

       public boolean isEstAdministrateur() {
              return estAdministrateur;
       }

       public void setEstAdministrateur(boolean estAdministrateur) {
              this.estAdministrateur = estAdministrateur;
       }

       public List<Avis> getAvis() {
              return avis;
       }

       public void setAvis(List<Avis> avis) {
              this.avis = avis;
       }

       @Override
       public String toString() {
              return "Joueur{" +
                      "id=" + id +
                      ", pseudo='" + pseudo + '\'' +
                      ", motDePasse='" + motDePasse + '\'' +
                      ", dateInscription=" + dateInscription +
                      ", estAdministrateur=" + estAdministrateur +
                      ", avis=" + avis +
                      '}';
       }
}
