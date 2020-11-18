package sn.ugb.sat.info.licence3.exercice4;
public class Exo4 {
    private int tailleTab;
    private int[] tableau;
    private int sommet = 0;        // Sommet du tableau
    public Exo4(int n) {
        tailleTab=n;
        //sommet = -1;
        tableau = new int [tailleTab];
    }
     public boolean PileVide(){
        if(sommet > 0)
          return false;
        else
          return true;
     }
     public boolean PilePleine(){
        if(sommet == tailleTab)
          return true;
        else
          return false;
    }
    public void Empile(int element){
      if (PilePleine())
      
         System.out.println("\nLa pile est pleine! impossible d'empiler\n");
      else{
            tableau[sommet] = element;
            sommet++;
          }
    }
    public int Depile(){
          sommet--; 
          return tableau[sommet];
    }
    public void Affichepile(){
      System.out.println("\n");
      for (int i=0; i<sommet; i++)
        System.out.print(tableau[i]+"  ");
      System.out.println("\n");
    }
     
    
}