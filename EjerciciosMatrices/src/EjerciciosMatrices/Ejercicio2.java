package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio2 {

	static Scanner teclado;
	static int[][] numeros;
	static int n;
	static int m;

	/**
	 * 
	 */
	public Ejercicio2() {
		teclado = new Scanner(System.in);
		System.out.println("Por favor digite el numero de filas de la matriz: ");
		n = teclado.nextInt();
		System.out.println("Por favor digite el numero de columnas de la matriz: ");
		m = teclado.nextInt();
		numeros = new int[n][m];
	}

	public void cargarDatos() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println("Digite un numero entero para la fila " + (i + 1));
				numeros[i][j] = teclado.nextInt();
			}
		}
	}

	public void imprimir() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("[" + numeros[i][j] + "]");
			}
			System.out.println();
		}
	}

	public void intercambiarFilas(int pos1, int pos2) {
		int comodin;
		for (int j = 0; j < m; j++) {
			comodin = numeros[pos1][j];
			numeros[pos1][j] = numeros[pos2][j];
			numeros[pos2][j]=comodin;
		}
		System.out.println("Se realizo el intercambio entre las filas " + pos1 +" y "+ pos2 + " satisfactoriamente");
	}

	public static void main(String[] args) {
		int pos1,pos2;
		Ejercicio2 e = new Ejercicio2();
		e.cargarDatos();
		e.imprimir();
		System.out.println("Ingrese el numero de la primera fila para el intercambio de digitos: ");
		pos1 = teclado.nextInt();
		System.out.println("Ingrese el numero de la segunda fila para el intercambio de digitos: ");
		pos2 = teclado.nextInt();
		while (pos1 >= n || pos1 < 0 || pos2 >= n || pos2 < 0) {
			System.out.println("Las filas ingresadas no exiten para la matriz creada");
			System.out.println("Ingrese el numero de la primera fila para el intercambio de digitos: ");
			pos1 = teclado.nextInt();
			System.out.println("Ingrese el numero de la segunda fila para el intercambio de digitos: ");
			pos2 = teclado.nextInt();
		}
		e.intercambiarFilas(pos1, pos2);
		e.imprimir();

	}

}
