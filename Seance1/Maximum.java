package Seance1;


import java.util.Arrays;
import java.util.Random;

public class Maximum
{
		

	
	
	/*****
	 * Cette fonction parcourt toutes les cases du tableau et 
	 * compare leur valeur avec une variable max qui sera renvoy�e � la fin du parcours. 
	 * ****/
	
	
	public static int maxLin(int tab[])
	{
		int max;
		max = tab[0];

		for(int i = 1; i < tab.length; i ++)
		{
			if (max < tab[i])
			{
				max = tab[i];
			}
		}

		return max;
	}
	
	

	public static int maxTriSelection(int tab[]){
		int max;

		tab = Tri.triSelection(tab);

		max = tab[tab.length - 1];

		return max;
	}


	
	
	
	
	/**
	 * Triez le tableau de fa�on croissante par un algorithme de tri par fusion et renvoyez la derni�re case. 
	 */
	/*
	public static int maxTriFusion(int tab[]){
		int max;

		return max;
	}

	 */
	
		
	
	/**
	 * 
	 * L�id�e de l�algorithme est de regrouper les �l�ments � comparer par paires, i.e. de comparer � chaque 
	 * tour de boucle deux �l�ments cons�cutifs et ensuite comparer un seul des deux � max 
	 * (le plus grand des deux bien s�r). 
	 * La boucle for s�incr�mente de 2 � chaque tour.
	 */
	/*
	public static int maxPaires(int tab[]){
		int max;


		return max;
	}

	 */
	
	public static void main(String[] args)
	{
		int[] tableauInt;
		int[] testCloneTrie;
		int max;
		String afficheTab;

		tableauInt = Tableau.creeTableauAleatoire(10);
		testCloneTrie = tableauInt;
		afficheTab = Tableau.toStringTab(tableauInt);
		System.out.println(afficheTab);

		System.out.println("maxLin");
		max = Maximum.maxLin(tableauInt);
		System.out.println(max);
		System.out.println();

		System.out.println("triSelection");
		testCloneTrie = Tri.triSelection(testCloneTrie);
		System.out.println(Tableau.toStringTab(testCloneTrie));
		System.out.println();

		System.out.println("maxTriSelection");
		max = Maximum.maxTriSelection(tableauInt);
		System.out.println(max);
		System.out.println();



	}
	
	
	
	
}
