/*
    Classe de test  des fonctions permettant de resoudre le probleme du voyageur de commerce
    @Author : Mouhammad Sylla @mouha09
*/

import sn.ugb.sat.info.dic1.exercice5.TravelingSalesmanFunctions;

public class TestFunctions {
    public static void main(String[] args) {
        //dist = new int[0][0];
        int p[] = {};
        int[][] dist = TravelingSalesmanFunctions.setUp();
        // System.out.println("Taille de la carte : "+dist.length);
        // System.out.println("Taille d'un vecteur : "+dist[0]);
        TravelingSalesmanFunctions.drawSet(dist);
        int plusCourt = TravelingSalesmanFunctions.plusCourt(dist,3,p);
        if(plusCourt == 0){
            System.out.println("Cette ville est déja parcourue 😏 ");
        }else{
            System.out.println("\nLa ville la plus proche est : la ville  "+plusCourt+"\n");
        }
        TravelingSalesmanFunctions.salesmanRoute(dist.length,dist,2);
    }
}