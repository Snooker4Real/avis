package fr.snooker4real.avis.business;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Jeu {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;

       private String nom;

       @Lob
       private String description;

       @Temporal(TemporalType.DATE)
       private Date dateSortie;

       @ManyToOne
       private Editeur editeur;

       @ManyToOne
       private Genre genre;

       @ManyToOne
       private ModeleEconomique modeleEconomique;

       @ManyToOne
       private Classification classification;

       @ManyToMany
       private List<Plateforme> plateformes;

       @OneToMany(mappedBy = "jeu")
       private List<Avis> avis;

       public Jeu() {
       }

       public Jeu(Long id, String nom, String description, Date dateSortie, Editeur editeur, Genre genre, ModeleEconomique modeleEconomique, Classification classification, List<Plateforme> plateformes, List<Avis> avis) {
              this.id = id;
              this.nom = nom;
              this.description = description;
              this.dateSortie = dateSortie;
              this.editeur = editeur;
              this.genre = genre;
              this.modeleEconomique = modeleEconomique;
              this.classification = classification;
              this.plateformes = plateformes;
              this.avis = avis;
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

       public String getDescription() {
              return description;
       }

       public void setDescription(String description) {
              this.description = description;
       }

       public Date getDateSortie() {
              return dateSortie;
       }

       public void setDateSortie(Date dateSortie) {
              this.dateSortie = dateSortie;
       }

       public Editeur getEditeur() {
              return editeur;
       }

       public void setEditeur(Editeur editeur) {
              this.editeur = editeur;
       }

       public Genre getGenre() {
              return genre;
       }

       public void setGenre(Genre genre) {
              this.genre = genre;
       }

       public ModeleEconomique getModeleEconomique() {
              return modeleEconomique;
       }

       public void setModeleEconomique(ModeleEconomique modeleEconomique) {
              this.modeleEconomique = modeleEconomique;
       }

       public Classification getClassification() {
              return classification;
       }

       public void setClassification(Classification classification) {
              this.classification = classification;
       }

       public List<Plateforme> getPlateformes() {
              return plateformes;
       }

       public void setPlateformes(List<Plateforme> plateformes) {
              this.plateformes = plateformes;
       }

       public List<Avis> getAvis() {
              return avis;
       }

       public void setAvis(List<Avis> avis) {
              this.avis = avis;
       }

       @Override
       public String toString() {
              return "Jeu{" +
                      "id=" + id +
                      ", nom='" + nom + '\'' +
                      ", description='" + description + '\'' +
                      ", dateSortie=" + dateSortie +
                      ", editeur=" + editeur +
                      ", genre=" + genre +
                      ", modeleEconomique=" + modeleEconomique +
                      ", classification=" + classification +
                      ", plateformes=" + plateformes +
                      ", avis=" + avis +
                      '}';
       }
}
