/*
    Projet de fin de module Java-1
    Classe  principale de test de toutes les fonctions developpées tout au long des exercices
    @Authors : [
        Lamine Fall
        Nafissatou Dieng
        Rouguyatou Diallo
        Fatou Mbao
        Mouhammad Sylla @mouha09
    ]
*/

package sn.ucad.esp.dgi.dic1;

import java.util.Scanner;
import sn.ugb.sat.info.licence3.exercice1.Affiche;
import sn.ugb.sat.info.licence3.exercice2.Exo2;
import sn.ugb.sat.info.licence3.exercice5.Exo5;
// import sn.ugb.sat.info.licence3.exercice4.Exo4;
// import sn.ugb.sat.info.licence3.exercice3.Exo3;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n/*------------------ Affichage d'une pyramide 😎  -------------------*/");
        Scanner sc = new Scanner(System.in);
        int hauteur;
        System.out.print("Veuillez entrer une hauteur de la pyramide : ");
        hauteur = sc.nextInt();
        for (int noLigne = 1; noLigne <= hauteur; noLigne++) {
            // il faut afficher (hauteur - noLigne) espaces pour la ligne noLigne
            for (int i = hauteur - noLigne; i > 0; i--)
                System.out.print(" ");
            // il faut afficher (2 * noLigne - 1) '*' pour la ligne noLigne
           Affiche.afficheCar(2 * noLigne - 1,'*');
            // retour à la ligne suivante
            System.out.println();
        }

        System.out.println("\n/*------------------ Affichage d'un histogramme 😎  -------------------*/");

        System.out.print("Veuillez entrer une hauteur de l'histogramme : ");
        hauteur = sc.nextInt();

        int taille;

        //On entre la taille du vecteur
        System.out.print("Veuillez entrer la taille du vecteur : ");
        taille = sc.nextInt();
        int v[] = new int[taille];
        //On remplit le vecteur
        for(int i = 0; i<taille; i++){
            System.out.print("Veuillez ajouter une valeur au vecteur : ");
            v[i] = sc.nextInt(); 
        }
        System.out.println();
        
        //On affiche l'histogramme grace à la fonction histog
        Exo2.histog(v,taille,hauteur);

        System.out.println("\n/*------------------ Test des fonctions de l'exercice 5 -- PVC 😎 -------------------*/");

        int p[] = {};
        //Creation de la carte et l'ajout des distances
        int[][] dist = Exo5.setUp();
        
        //Affichage de la carte avec les distances
        Exo5.drawSet(dist);

        //Test de la fonction plusCourt en partant de la ville 3
        int plusCourt = Exo5.plusCourt(dist,3,p);
        if(plusCourt == 0){
            System.out.println("Cette ville est déja parcourue 😏 ");
        }else{
            System.out.println("\nLa ville la plus proche est : la ville  "+plusCourt+"\n");
        }
        //Exo5.salesmanRoute(dist.length,dist,2);
    }
}