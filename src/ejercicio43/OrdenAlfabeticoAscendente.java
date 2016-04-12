package ejercicio43;

import java.util.Scanner;

public class OrdenAlfabeticoAscendente
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] cadenas = new String[3];
		String aux;
		boolean ordenado = false;
		// Se piden las cadenas
		for (int i = 0; i < cadenas.length; i++)
		{
			System.out.print("Introduce palabra: ");
			cadenas[i] = sc.nextLine();
		}
		sc.close();
		// Se ordena con el método de la burbuja
		for (int i = 0; i < cadenas.length - 1 && !ordenado; i++)
		{
			ordenado = true;
			for (int j = 0; j < cadenas.length - 1 - i; j++)
			{
				if(cadenas[j].compareToIgnoreCase(cadenas[j + 1]) > 0)
				{
					aux = cadenas[j];
					cadenas[j] = cadenas[j + 1];
					cadenas[j + 1] = aux;
					ordenado = false;
				}
			}
		}
		System.out.println("Palabras ordenadas:\n----------------");
		// Se muestra el array
		for (int i = 0; i < cadenas.length; i++)
		{
			System.out.print(cadenas[i] + "\t");
		}
	}
}
