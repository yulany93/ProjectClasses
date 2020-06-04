package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner teclado;
	private String[][] estudiante;
	int cantidad;
	String tipoDocumento;
	String numeroDocumento;
	String nombre;
	int idNivel;
	String[][] nivel = { { "1", "BASICO" }, { "2", "INTERMEDIO" }, { "3", "AVANZADO" } };

	/**
	 * 
	 */
	public Ejercicio1() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de estudiantes a registrar: ");
		cantidad = teclado.nextInt();
		estudiante = new String[cantidad][4];

		for (int i = 0; i < cantidad; i++) {
			System.out.println("Por favor digite el tipo de documento del estudiante: ");
			tipoDocumento = teclado.next();
			estudiante[i][0] = tipoDocumento;
			System.out.println("Por favor digite el numero de documento del estudiante: ");
			numeroDocumento = teclado.next();
			estudiante[i][1] = numeroDocumento;
			System.out.println("Por favor digite el nombre del estudiante: ");
			nombre = teclado.next();
			estudiante[i][2] = nombre;
			System.out.println("Por favor digite el nivel del estudiante (1)BASICO - (2)INTERMEDIO - (3)AVANZADO: ");
			idNivel = teclado.nextInt();
			while (idNivel <=0 || idNivel >3) {
				System.out.println("El digito ingresado no corresponde a un nivel permitido.");
				System.out.println("Por favor digite el nivel del estudiante (1)BASICO - (2)INTERMEDIO - (3)AVANZADO: ");
				idNivel = teclado.nextInt();				
			}

			for (int j = 0; j < 3; j++) {
				String idnivel = String.valueOf(idNivel);
				if (idnivel.equals(nivel[j][0])) {
					estudiante[i][3] = nivel[j][1];
				}
			}
		}

	}

	public void imprimir() {
		for (int i = 0; i < cantidad; i++) {
			System.out.print("Estudiante " + (i + 1) + " : ");
			for (int j = 0; j < 4; j++) {
				System.out.print(estudiante[i][j] + " - ");
			}
			System.out.println();
		}
	}
	
	public void imprimirUnEstudiante(int pos) {
		System.out.print ("Información del estudiante: ");
		for (int i = 0; i < 4; i++) {
			System.out.print(estudiante[pos][i] + " - ");
		}
		System.out.println();
	}
	public void buscarNombre(String nombre) {
		for (int i = 0; i < cantidad; i++) {
			if (estudiante[i][2].equals(nombre)) {
				imprimirUnEstudiante(i);
			}
		}
	}

	public void buscarNumeroIdentificacion(String numero) {
		System.out.println(numero);
		for (int i = 0; i < cantidad; i++) {
			if (estudiante[i][1].equals(numero)) {
				imprimirUnEstudiante(i);
			}
		}
	}
	public static void main(String[] args) {
		Ejercicio1 e = new Ejercicio1();
		e.imprimir();
		System.out.println("Digite el nombre del estudiante que desea buscar: ");
		String nombreBuscar = teclado.next();
		e.buscarNombre(nombreBuscar);
		System.out.println("Digite el numero de identificacion del estudiante que desea buscar: ");
		String numeroBuscar = teclado.next();
		e.buscarNumeroIdentificacion(numeroBuscar);

	}

}
