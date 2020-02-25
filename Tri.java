package Seance1;

import java.util.Random;
import java.util.Arrays;

public class Tri {

	
	
	/***
	 * Fonction de tri par sélection : 
	 * Sur un tableau de n éléments, le principe du tri par sélection est le suivant :
	 ***	rechercher le plus petit élément du tableau, et l'échanger avec le premier élément ;
	 ***	rechercher le second plus petit élément du tableau, et l'échanger avec le deuxième élément ;
	 ***	continuer de cette façon jusqu'à ce que le tableau soit entièrement trié.
	 */
	
	public static int[] triSelection(int[] tab){
		int[] tabRes;
	
		return tabRes;
	}
		

	
	/***
	 * Fonction de tri par fusion: 
	 * L'algorithme est naturellement décrit de façon récursive.
	 ***	Si le tableau n'a qu'un élément, il est déjà trié.
	 ***	Sinon, on sépare le tableau en deux parties à peu près égales.
	 ***	On trie récursivement les deux parties avec l'algorithme du tri fusion.
	 ***	On fusionne les deux tableaux triés en un tableau trié.
	 */
	
	public static int[] triFusion(int tab[]){
		int[] tabRes = triFusionIndices(tab,0,tab.length -1);
		return tabRes;
	}	
	
	private static int[] triFusionIndices(int tab[],int deb,int fin)
    {
		/*****
		 * 
		 * Code A Completer
		 * ****/
    }

	private static int[] fusion(int tab[],int deb1,int fin1,int fin2){
		/*****
		 * 
		 * Code A Completer
		 * ****/
		
   }
}
