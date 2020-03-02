package com.example.gestionnairedenote;


public class Etudiant extends Personne{


    static int compteur= 1;
    int idEtudiant;
    String formation;

    public Etudiant() { idEtudiant= Integer.valueOf("219" + compteur++);}

    public String toString() { return idEtudiant +"  Nom "+ nom + "  Prénom " + prenom + "  Genre " + gender;}

    public int getIdetudiant() {return idEtudiant;}
}

