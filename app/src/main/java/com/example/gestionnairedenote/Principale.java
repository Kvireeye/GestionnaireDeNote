package com.example.gestionnairedenote;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


class Principal {
    public static void main(String[] args) {

        List<Etudiant> list_etu = new ArrayList<>();
        List<Enseignant> list_esg = new ArrayList<>();
        List<Devoir> list_dvs = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Boolean boucle = true;

        while (boucle) {
            System.out.println("Que souhaitez vous faire?");
            System.out.println("1 - Créer un nouvel étudiant");
            System.out.println("2 - Lister les étudiants");
            System.out.println("3 - Supprimer un étudiant");
            System.out.println("4 - Créer un nouvel enseignant");
            System.out.println("5 - Lister les enseignants");
            System.out.println("6 - Supprimer un enseignant");
            System.out.println("7 - Saisir une note");
            System.out.println("8 - Modifier une note");
            System.out.println("9 - Consulter les notes attribué par un enseignant");
            System.out.println("10 - Consulter les notes de l'étudiant");
            System.out.println("11 - Supprimez une note de l'étudiant");
            System.out.println("12 - Quitter");
            System.out.print("> ");

            String lecture = scanner.next();

            switch (lecture) {
                case "1":
                    creerEtudiants(list_etu, scanner);
                    break;
                case "2":
                    listerEtudiants(list_etu);
                    break;
                case "3":
                    supprimerEtudiant(list_etu, scanner);
                    break;
                case "4":
                    creerEnseignant(list_esg, scanner);
                    break;
                case "5":
                    listerEnseigant(list_esg);
                    break;
                case "6":
                    supprimerEnseignant(list_esg, scanner);
                    break;
                case "7":
                    saisirNote(list_dvs, scanner);
                    break;
                case "8":
                    modifierNote(list_dvs, scanner);
                    break;
                case "9":
                    consulterNoteEnseignant(list_dvs, scanner);
                    break;
                case "10":
                    consulterNoteEtudiant(list_dvs, scanner);
                    break;
                case "11":
                    supprimerUneNote(list_dvs, scanner, scanner);
                    break;
                case "12":
                    boucle = false;
            }
        }
    }

    private static void modifierNote(List<Devoir> list_dvs, Scanner scanner) {
        System.out.println("Entrer le numéro étudiant");
        int idInsert = scanner.nextInt();

        for (Devoir devoir : list_dvs) {
            if (idInsert == devoir.getIdEtudiant()) {
                System.out.println("ID Devoir: " + devoir.getIdDevoir() + " -Note: " + devoir.getNote() + " -Matière: " + devoir.getMatiere() + " -Evaluation: " + devoir.getTypeControle());
            } else System.out.println("Numéro étudiant inconnu");
        }


        System.out.println("Quel est l'ID du Devoir à modifier?");
        int idNote = scanner.nextInt();
        System.out.println("Entrer la nouvelle note");
        double newNote = scanner.nextDouble();

        for (Devoir devoir : list_dvs) {
            if (idNote == devoir.getIdDevoir())
                devoir.setNote(newNote);
            System.out.println("ID Devoir: " + devoir.getIdDevoir() + " -Note : " + devoir.getNote() + " -Matière: " + devoir.getMatiere() + " -Evaluation: " + devoir.getTypeControle());
        }
    }


    private static void supprimerUneNote(List<Devoir> list_dvs, Scanner scanner, Iterator interator) {
        System.out.println("Quel est l'identifiant de l'étudiant");
        int idInsert = scanner.nextInt();
        for (Devoir devoir : list_dvs) {
            if (idInsert == devoir.getIdEtudiant())
                System.out.println("ID devoir: " + devoir.getIdDevoir() + " -Matière: " + devoir.getMatiere() + " -Note " + devoir.getNote() + " -Type de contrôle " + devoir.getTypeControle());
        }

        System.out.println("Indiquez l'ID du devoir correspondant: ");
        int idInsertD = scanner.nextInt();

        //Iterator<Devoir> iterator = list_dvs.iterator();
        //while (iterator.hasNext()) {
        //Devoir = iterator.next(); // On récupère l'élément courant

        //iterator.remove(); // On supprime l'élément courant
        //}

        for (Devoir devoir : list_dvs) {
            if (idInsertD == devoir.getIdDevoir())
                list_dvs.remove(devoir);
            break;
        }

        for (Devoir devoir : list_dvs) {
            System.out.println("ID devoir: " + devoir.getIdDevoir() + " -Matière: " + devoir.getMatiere() + " -Note " + devoir.getNote() + " -Type de contrôle " + devoir.getTypeControle());
        }
    }


    private static void supprimerEnseignant(List<Enseignant> list_esg, Scanner scanner) {
        System.out.println("Entrer l'identifiant de l'enseignant");
        int idInsert = scanner.nextInt();
        for (Enseignant esg : list_esg) {
            if (idInsert == esg.getIdEnseignant())
                list_esg.remove(esg);
        }
        System.out.println("Enseignant(e) supprimé(e)");
    }


    private static void supprimerEtudiant(List<Etudiant> list_etu, Scanner scanner) {
        System.out.println("Entrez le numéro de l'étudiant à supprimer");
        int idInsert = scanner.nextInt();
        for (Etudiant etu : list_etu) {
            if (idInsert == etu.getIdetudiant())
                list_etu.remove(etu);
            System.out.println("Etudiant(e) supprimé(e)");
        }
    }

    private static void listerEnseigant(List<Enseignant> list_esg) {
        for (Enseignant esg : list_esg)
            System.out.println(esg);
    }

    private static void listerEtudiants(List<Etudiant> list_etu) {
        for (Etudiant etu : list_etu)
            System.out.println(etu);

    }

    private static void creerEnseignant(List<Enseignant> list, Scanner scanner) {
        Enseignant esg = new Enseignant();
        System.out.println("Nom de l'enseignant: ");
        esg.nom = scanner.next();
        System.out.println("Prénom de l'enseignant: ");
        esg.prenom = scanner.next();

        list.add(esg);
    }

    public static void creerEtudiants(List<Etudiant> list, Scanner scanner) {
        Etudiant etu = new Etudiant();
        System.out.print("Nom de l'étudiant : ");
        etu.nom = scanner.next();
        System.out.print("Prénom de l'étudiant : ");
        etu.prenom = scanner.next();

        do {
            System.out.println("Genre de l'étudiant? ( H pour home ou F pour femme) ");
            etu.gender = scanner.next();
        }
        while (!(etu.gender.equals("H") || etu.gender.equals("F")));

        System.out.println("Entrez l'année de naissance en 4 chiffres (ex : 1990) : ");
        etu.annee = scanner.nextInt();


        list.add(etu);
    }

    public static void saisirNote(List<Devoir> list, Scanner scanner) {

        Devoir dvs = new Devoir(null, null, 0, 0, 0, 0);
        System.out.println("Entrez le numéro identifiant l'étudiant: ");
        dvs.idEtudiant = scanner.nextInt();

        System.out.println("Entrez le numéro identifiant l'enseignant: ");
        dvs.idEnseignant = scanner.nextInt();

        System.out.println("Entrez la matière du devoir");
        dvs.matiere = scanner.next();

        do {
            System.out.println("Entrez cc pour une note en contrôle continu ou ct pour une note en contrôle terminale");

            dvs.typeControle = scanner.next();
        } while (!(dvs.typeControle.equals("cc") || dvs.typeControle.equals("ct")));

        System.out.println("Entrez la note");
        dvs.note = scanner.nextDouble();

        dvs.idDevoir = Integer.valueOf("2020" + Devoir.compteur++);

        list.add(dvs);
    }

    private static void consulterNoteEnseignant(List<Devoir> list_dvs, Scanner scanner) {

        System.out.println(" Entrez le numero Enseignant");
        int idInsertEsg = scanner.nextInt();
        for (Devoir devoir : list_dvs) {
            if (idInsertEsg == devoir.getIdEnseignant())
                System.out.println("Numéro Etudiant: " + devoir.getIdEtudiant() + " -Note: " + devoir.getNote() +
                        " -Type de contrôle" + devoir.getTypeControle() + " -ID Devoir " + devoir.getIdDevoir());
        }


    }

    private static void consulterNoteEtudiant(List<Devoir> list_dvs, Scanner scanner) {
        System.out.println(" Entrez le numéro étudiant");
        int idInsert = scanner.nextInt();
        for (Devoir devoir : list_dvs) {
            if (idInsert == devoir.getIdEtudiant())
                System.out.println("ID: " + devoir.idDevoir + " -Matière " + devoir.getMatiere() + " -Note " + devoir.getNote() + " -Type de contrôle " + devoir.getTypeControle());
        }
    }
}

