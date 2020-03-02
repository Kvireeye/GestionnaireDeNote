package com.example.gestionnairedenote;
public class Devoir {

    public Devoir(String matiere, String typeControle, int idDevoir, double note, int idEnseignant, int idEtudiant) {
        super();
        this.matiere = matiere;
        this.typeControle = typeControle;
        this.idDevoir = idDevoir;
        this.note = note;
        this.idEnseignant = idEnseignant;
        this.idEtudiant = idEtudiant;
    }

    String matiere;
    String typeControle;
    int idDevoir ;
    double note;
    int idEnseignant;
    int idEtudiant;
    static int compteur = 1;




    public String getMatiere() {
        return matiere;
    }
    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
    public String getTypeControle() {
        return typeControle;
    }
    public void setTypeControle(String typeControle) {
        this.typeControle = typeControle;
    }
    public int getIdDevoir() {
        return idDevoir;
    }
    public void setIdDevoir(int idDevoir) {
        this.idDevoir = idDevoir;
    }
    public double getNote() {
        return note;
    }
    public void setNote(double note) {
        this.note = note;
    }
    public int getIdEnseignant() {
        return idEnseignant;
    }
    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }
    public int getIdEtudiant() {
        return idEtudiant;
    }
    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }



}