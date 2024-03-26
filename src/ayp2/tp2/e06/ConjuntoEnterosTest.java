package ayp2.tp2.e06;

public class ConjuntoEnterosTest {

	public static void main(String[] args) {

		// Instancia dos conjuntos
		ConjuntoEnteros conjunto1 = new ConjuntoEnteros();
		ConjuntoEnteros conjunto2 = new ConjuntoEnteros();

		try {

			// Inserta elementos en el conjunto 1
			conjunto1.insertarElemento(2);
			conjunto1.insertarElemento(8);
			conjunto1.insertarElemento(16);
			conjunto1.insertarElemento(32);

			// Imprime los elementos del conjunto 1
			System.out.printf("Elementos del conjunto 1: %s\n", conjunto1.aStringConjunto());

			// Inserta elementos en el conjunto 2
			conjunto2.insertarElemento(4);
			conjunto2.insertarElemento(8);
			conjunto2.insertarElemento(16);
			conjunto2.insertarElemento(64);

			// Imprime los elementos del conjunto 2
			System.out.printf("Elementos del conjunto 2: %s\n", conjunto2.aStringConjunto());

			// Nuevo conjunto de la union de conjunto1 y conjunto2
			ConjuntoEnteros conjuntoUnion = conjunto1.union(conjunto2);
			// Imprime los elementos de la unión
			System.out.printf("Elementos de la unión: %s\n", conjuntoUnion.aStringConjunto());

			// Nuevo conjunto de la intersección de conjunto1 y conjunto2
			ConjuntoEnteros conjuntoInterseccion = conjunto1.interseccion(conjunto2);
			// Imprime los elementos de la intersección
			System.out.printf("Elementos de la intersección: %s\n", conjuntoInterseccion.aStringConjunto());

			// Nuevo conjunto de la diferencia de conjunto1 con conjunto2
			ConjuntoEnteros conjuntoDiferencia1 = conjunto1.diferencia(conjunto2);
			// Imprime los elementos de la diferencia
			System.out.printf("Elementos de la diferencia conjunto1 △ conjunto2 : %s\n",
					conjuntoDiferencia1.aStringConjunto());

			// Nuevo conjunto de la diferencia de conjunto2 con conjunto1
			ConjuntoEnteros conjuntoDiferencia2 = conjunto2.diferencia(conjunto1);
			// Imprime los elementos de la diferencia
			System.out.printf("Elementos de la diferencia conjunto2 △ conjunto1: %s\n",
					conjuntoDiferencia2.aStringConjunto());

			// Compara los conjuntos
			if (conjunto1.esIgualA(conjunto2)) {
				System.out.print("Los conjuntos son iguales.\n");
			} else {
				System.out.print("Los conjuntos son diferentes.\n");
			}

			// Elimina elementos de ambos conjuntos para igualarlos
			conjunto1.eliminarElemento(2);
			conjunto1.eliminarElemento(32);
			conjunto2.eliminarElemento(4);
			conjunto2.eliminarElemento(64);

			// Vuelve a comparar los conjuntos
			if (conjunto1.esIgualA(conjunto2)) {
				System.out.print("Los conjuntos son iguales.\n");
			} else {
				System.out.print("Los conjuntos son diferentes.\n");
			}
			
			// Lanza una excepción al intentar agregar un elemento fuera de rango
			conjunto1.insertarElemento(101);

		} catch (Exception error) {
			System.out.printf("Ha ocurrido un error: %s", error.getMessage());
		}

	}

}
