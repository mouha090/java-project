package sn.ugb.sat.info.licence3.exercice2;

public class Exo2{
    public static void histog(int v[], int nb){
        int max=0;
       // if(nb >= 0)
        //    max=v[0];
        for(int i=0; i<nb; i++){
            if(max< v[i])
                max=v[i];
        }
        for(int i=0; i<=max; i++){
            for(int j=0; j<nb; j++){
                if((max-i)<=v[j])
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void histog(int v[], int nb, int H){
        for(int i=0; i<=H; i++){
            for(int j=0; j<nb; j++){
                if((H-i)<=v[j])
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}