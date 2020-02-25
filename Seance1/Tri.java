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
		int min;
		int temp;
		int indice = 0;

		for(int i = 0; i < tab.length; i ++)
		{
			min = tab[i];
			indice = i;
			for(int j = i + 1; j < tab.length; j ++)
			{
				if(min > tab[j])
				{
					min = tab[j];
					indice = j;
				}
			}
			temp = tab[indice];
			tab[indice] = tab[i];
			tab[i] = temp;
		}
		return tab;
	}
		

	
	/***
	 * Fonction de tri par fusion: 
	 * L'algorithme est naturellement d�crit de fa�on r�cursive.
	 ***	Si le tableau n'a qu'un �l�ment, il est d�j� tri�.
	 ***	Sinon, on s�pare le tableau en deux parties � peu pr�s �gales.
	 ***	On trie r�cursivement les deux parties avec l'algorithme du tri fusion.
	 ***	On fusionne les deux tableaux tri�s en un tableau tri�.
	 */
	
	public static int[] triFusion(int tab[])
	{
		int[] tabRes = triFusionIndices(tab,0,tab.length -1);
		return tabRes;
	}	
	
	private static int[] triFusionIndices(int tab[],int deb,int fin)
    {
		if(deb != fin)
		{
			int fin1;
			int deb2;

			if (fin % 2 != 0)
			{
				fin1 = (int) Math.floor(fin/2);
				deb2 = fin1 + 1;
				triFusionIndices(tab, deb, fin1);
				triFusionIndices(tab, deb2, fin);
			}
			else
			{
				fin1 = fin/2;
				deb2 = fin1 + 1;
				triFusionIndices(tab, deb, fin1);
				triFusionIndices(tab, deb2, fin);
			}
			fusion(tab, deb, fin1, fin);
			fusion(tab, deb2, fin1, fin)
		}

		return ;
    }

	private static int[] fusion(int tab[],int deb1,int fin1,int fin2)
	{

		return ;
   }
}
