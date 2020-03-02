package com.example.gestionnairedenote;

public class Enseignant extends Personne{

    static int compteur= 1;
    int idEnseingnant;
    String matiereEnseigne;

    public Enseignant() {idEnseingnant= Integer.valueOf("419" + compteur++); }

    public String toString() { return idEnseingnant +"  Nom "+ nom + "  Prénom " + prenom + "  Genre " + gender;}

    public int getIdEnseignant() {return idEnseingnant;}


}