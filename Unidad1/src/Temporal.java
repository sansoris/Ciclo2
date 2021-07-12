


public class Temporal {
    public static void main(String[] args) {
		int[] lista = new int[100]; // Lista de números enteros que supondremos llena.
		int maximo = lista[0]; // Declaramos e inicializamos el máximo.
		int minimo = lista[0]; // Declaramos e inicializamos el máximo.

		for (int i = 0; i < 100; i++){
			if (maximo < lista[i]) maximo = lista[i];
			if (minimo > lista[i]) minimo = lista[i];
		}

		// Al finalizar el bucle, las variables contienen los valores máximos y mínimos.
		System.out.println("La máximo de la lista es " + maximo);
		System.out.println("La mínimo de la lista es " + minimo);
	}
}


