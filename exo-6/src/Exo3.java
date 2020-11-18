package sn.ugb.sat.info.licence3.exercice3;
import java.util.Arrays;

public class Exo3{
	public static void tri_insertion_seq(int[]tab){
		for (int i = 1; i < tab.length; i++) {
        int key = tab[i];
        int j = i - 1;
        while (j >= 0 && tab[j]> key) {
            tab[j + 1]= tab[j];
            j = j - 1;
        }
        tab[j + 1]= key;

	}
	System.out.println(Arrays.toString(tab));
	}
}
