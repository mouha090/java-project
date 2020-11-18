class Piles {
    private int tailleTab;
    private int[] tableau;
    private int sommet = 0;        // Sommet du tableau
    public Piles(int n) {
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
         System.out.println("La pile est pleine! impossible d'empiler");
      else{
            tableau[sommet] = element;
            sommet++;
          }
    }
    public int Depile(){
          sommet--; 
          return tableau[sommet];
    }
     
    
}