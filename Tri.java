package Seance1;

import java.util.Random;
import java.util.Arrays;

public class Tri {

	
	
	/***
	 * Fonction de tri par s�lection : 
	 * Sur un tableau de n �l�ments, le principe du tri par s�lection est le suivant :
	 ***	rechercher le plus petit �l�ment du tableau, et l'�changer avec le premier �l�ment ;
	 ***	rechercher le second plus petit �l�ment du tableau, et l'�changer avec le deuxi�me �l�ment ;
	 ***	continuer de cette fa�on jusqu'� ce que le tableau soit enti�rement tri�.
	 */
	
	public static int[] triSelection(int[] tab){
		int[] tabRes;
	
		return tabRes;
	}
		

	
	/***
	 * Fonction de tri par fusion: 
	 * L'algorithme est naturellement d�crit de fa�on r�cursive.
	 ***	Si le tableau n'a qu'un �l�ment, il est d�j� tri�.
	 ***	Sinon, on s�pare le tableau en deux parties � peu pr�s �gales.
	 ***	On trie r�cursivement les deux parties avec l'algorithme du tri fusion.
	 ***	On fusionne les deux tableaux tri�s en un tableau tri�.
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
