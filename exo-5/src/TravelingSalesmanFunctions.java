/*
    Classe  d'implementation  des fonctions permettant de resoudre le probleme du voyageur de commerce
    @Author : Mouhammad Sylla @mouha09
*/

package sn.ugb.sat.info.dic1.exercice5;

import java.util.Scanner;

public class TravelingSalesmanFunctions {
       /**
     * Fonction permettant de creer un set variable
     */
    public static int[][] setUp(){

        //variable representant le nombre de villes à parcourir
        int nombreVille;

        Scanner sc =  new Scanner(System.in);
        System.out.print("\nVeuillez entrer le nombre de villes à parcourir : ");
        nombreVille = sc.nextInt();

        //variable representant la matrice carte 
        int[][] card = new int[nombreVille][nombreVille];

        //Remplissage du tableau avec les distances 
        System.out.println("\n\n/*--------------- Remplissage du tableau avec les villes et les distances entre les villes 🀄 -------------------*/\n");

        for(int i=0; i<nombreVille; i++){
            for(int j=0; j<nombreVille; j++){
                if(i==j){
                    card[i][j] = 0;
                }
                else{
                    System.out.print(String.format("Veuillez entrer la distance separant la ville %d et la ville %d : ", i+1,j+1));
                    card[i][j] = sc.nextInt();
                }
               
            }
        }

        //On ferme le canal de l'instance de Scanner
        sc.close();
        return card;
    }

    /**
     * Fonction permettant de dessiner un set, representer le carte des villes avec les distances
     */
    public static void  drawSet(int[][] card){

        System.out.println("\n /*---------------- Matrice distance entres les differentes villes 🌏 ----------------*/\n");
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[0].length; j++) {
              System.out.print(card[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean contains(int[] p, int element){
        for(int i = 0; i<p.length; i++){
            if(p[i] == element){
                return true;
            }
        }
        return false;
    }

    /**
     * Fonction permettant de retourner la ville la plus proche parmi les villes restantes à parcourir
     */
    public static int plusCourt(int[][] card, int ville, int[] p ){
    
        int nearstTown = 0;

        int leastDistance;
        int k = 0;

        //On verifie si la ville n'est pas encore parcourue
        if(contains(p,ville) == false ){
            ville--;
            for(int i = 0; i<card.length; i++){
                
                if(i==ville){

                    //On initialise la plus petite distance à la premiere distance
                    leastDistance = card[i][0];

                    //Si la ville de depart est la premiere ville on initialise la plus petite distance à la distance suivante
                    if(i==0){
                        leastDistance = card[i][1];
                    }
                  
                    for(int j = 0; j<card.length; j++){
                       
                        if(contains(p,(j+1)) == false ){
                                 //S'il existe une distance plus petite entre la ville i est la ville j, on retourne cette ville
                            if(j != i){
                                if(leastDistance>card[i][j]){
                                    
                                    nearstTown = j;
                                    leastDistance = card[i][j];

                                    //On verifie si on est entré àl'interieur de ce bloc au moins une fois 
                                    k = 1;
                                }else{
                                    if(k==0){
                                        nearstTown = 1;
                                    }else;
                                }
                            }
                        }
                    }
                }
            }
        }
        if(k==1){
            nearstTown = nearstTown+1;
        }
        return nearstTown;
    }

    /**
     * Procedure donnant le parcours du voyageur ainsi que la distance totale parcourue
    */
    public static void salesmanRoute(int n, int[][] card, int villeDepart){

        System.out.println("Valeur de n  : "+n);
        //On initialise le tableau des villes déja parcourues
        int alreadyTraveled[] = new int[n];
        int nextTown;
        //alreadyTraveled[0] = villeDepart;
        int i =0;
        int distance = 0;
        int villeDepartInial = villeDepart;

        //On boucle sur l'ensemble des villes, pour pouvoir les parcourir toutes
        while(i<n){
            System.out.println("Ville de depart aactuel : "+villeDepart);
            nextTown = plusCourt(card,villeDepart,alreadyTraveled);
            System.out.println("La prochaine ville est : "+nextTown);
            //On ajoute cette ville aux villes deja traversees
            alreadyTraveled[i] = villeDepart;
            System.out.println("Ville deja parcourue : "+alreadyTraveled[i]);
            //On calcule la distance parcourue entre les deux villes
            distance = distance + card[villeDepart-1][nextTown-1];
            System.out.println("distance : "+distance);
            //la nouvelle ville de depart devient la ville actuelle ou on se trouve
            villeDepart = nextTown;
            
            i++;
        }
        distance += villeDepartInial;

        System.out.println("/*------------- Le parcours du voyageur est le suivant : -----------------*/ ");

        for(i = 0; i< alreadyTraveled.length; i++){
            System.out.print(alreadyTraveled[i]);

            if( i != alreadyTraveled.length-1){
                System.out.print("--->");
            }
        }
        System.out.println("\nLa distance parcourue est : "+distance+"\n");

    }
}

