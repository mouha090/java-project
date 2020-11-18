public class exo2{
    static void histog (int v[], int nb){
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
    static void histog (int v[], int nb, int H){
        for(int i=0; i<=H; i++){
            for(int j=0; j<nb; j++){
                if((H-i)<=v[j])
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        //int v[]= new int[30];
        int v[]={2,3,7,6,9,11,12,15,18,17,14,13,12,7,8,7,5,3,2,1,1,0,2,8,11,13,12,11,6,3};
        histog(v, v.length);
        //histog(v, v.length, 25);
    }
}