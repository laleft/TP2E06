package ayp2.tp2.e06;

/**
 * Clase para manejar un conjunto de números enteros
 * de 0 a 100 utilizando el índice del arreglo
 * 
 * @author sdebernardez
 * @version 1.0
 * 
 */
public class ConjuntoEnteros {
	
	// Declara un array de tipo boolean de 100 elementos [0-101]
	// Valor por defecto: false (https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
	private boolean[] conjunto = new boolean[101];

	/**
	 * Constructor
	 */
	public ConjuntoEnteros() {
		
	}

	/**
	 * Método para insertar un elemento en el conjunto
	 * 
	 * @param elemento
	 * @throws Exception: fuera de rango
	 * @return void
	 */
	public void insertarElemento(int elemento) throws Exception {
		
		// Si está fuera de rango lanza una excepción
		if (elemento >= 0 && elemento <= 100) {
			conjunto[elemento] = true;
		} else {
			throw new Exception("El número debe estar en el rango de 0 a 100.");
		}
	}

	/**
	 * Método para eliminar un elemento del conjunto
	 * 
	 * @param elemento
	 * @throws Exception: fuera de rango
	 * @return void
	 */
	public void eliminarElemento(int elemento) throws Exception {
		
		// Si está fuera de rango lanza una excepción
		if (elemento >= 0 && elemento <= 100) {
			conjunto[elemento] = false;
		} else {
			throw new Exception("El número debe estar en el rango de 0 a 100.");
		}
	}

	/**
	 * Método para obtener una representación 
	 * del conjuntocomo cadena
	 * 
	 * @param
	 * @return String
	 */
	public String aStringConjunto() {
		
		// StringBuilder para crear cadenas dinámicas
		StringBuilder sb = new StringBuilder();
		
		// Si el índice que representa el entero es true
		// lo añade a la cadena más un espacio en blanco
		for (int i = 0; i < conjunto.length; i++) {
			if (conjunto[i]) {
				sb.append(i).append(" ");
			}
		}
		// Retorna el objeto StringBuilder como cadena
		// y elimina el último espacio en blanco
		return sb.toString().trim();
	}

	/**
	 * Método para determinar si dos conjuntos 
	 * son iguales
	 * 
	 * @param otroConjunto
	 * @return boolean
	 */
	public boolean esIgualA(ConjuntoEnteros otroConjunto) {
		
		for (int i = 0; i < conjunto.length; i++) {
			// Compara los índices. Retorna false ante el primer
			// índice que no coincida
			if (conjunto[i] != otroConjunto.conjunto[i]) {
				return false;
			}
		}
		
		// Si no encontró diferencias retorna true
		return true;
	}

	/**
	 * Método para crear un tercer conjunto 
	 * con la unión de dos conjuntos
	 * 
	 * @param otroConjunto
	 * @return ConjuntoEnteros
	 */
	public ConjuntoEnteros union(ConjuntoEnteros otroConjunto) {
		
		// Intancia un nuevo objeto ConjuntoEnteros que será la unión.
		ConjuntoEnteros conjuntoUnion = new ConjuntoEnteros();
		
		// Operación OR entre los índices de ambos conjuntos. Si uno de ellos es true
		// se almacenará true, en caso contrario no se modifica el valor (false)
		for (int i = 0; i < conjunto.length; i++) {
			conjuntoUnion.conjunto[i] = conjunto[i] || otroConjunto.conjunto[i];
		}
		
		// Retorna la unión entre los dos conjuntos
		return conjuntoUnion;
	}

	/**
	 * Método para crear un tercer conjunto con 
	 * la intersección de dos conjuntos
	 * 
	 * @param otroConjunto
	 * @return ConjuntoElementos
	 */
	public ConjuntoEnteros interseccion(ConjuntoEnteros otroConjunto) {
		
		// Intancia un nuevo objeto ConjuntoEnteros que será la intersección
		ConjuntoEnteros conjuntoInterseccion = new ConjuntoEnteros();
		
		// Operación AND entre los índices de ambos conjuntos. Si ambos son true
		// se almacenará true, en caso contrario no se modifica el valor (false)
		for (int i = 0; i < conjunto.length; i++) {
			conjuntoInterseccion.conjunto[i] = conjunto[i] && otroConjunto.conjunto[i];
		}
		
		// Retorna la intersección de los dos conjuntos
		return conjuntoInterseccion;
	}

	/**
	 * Método para crear un tercer conjunto con 
	 * la diferencia entre dos conjuntos
	 * 
	 * @param otroConjunto
	 * @return ConjuntoEnteros
	 */
	public ConjuntoEnteros diferencia(ConjuntoEnteros otroConjunto) {
		
		// Intancia un nuevo objeto ConjuntoEnteros que será la diferencia
		ConjuntoEnteros diferenciaConjunto = new ConjuntoEnteros();
		
		// Operación AND entre los índices de ambos conjuntos. Se almacena true
		// cuando el valor está en uno de los conjuntos pero no en ambos
		for (int i = 0; i < conjunto.length; i++) {
			diferenciaConjunto.conjunto[i] = conjunto[i] && !otroConjunto.conjunto[i];
		}
		
		// Retorna la diferencia de los dos conjuntos
		return diferenciaConjunto;
	}
}
