public class exo1{
    static void afficheCar(int n, char ch){
        for(int i=1; i<=n; i++)
            System.out.print(ch);
    }
    public static void main(String []args){
        afficheCar(5, 'c');
    }
}