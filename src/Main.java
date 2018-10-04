import java.util.Scanner;

import org.omg.CORBA.portable.IndirectionException;

public class Main {

	static Cubo cubo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// peticion incial
		inicio();
		// metodo donde pondremos el menu inicial que queramos
		menus();
	}

	// menus metodo donde se ejecutaran todos los menus
	private static void menus() {
		// TODO Auto-generated method stub
		int opcion = get_submenu();

	}

	// sub menu donde sera los primeros menus que hagamos
	private static int get_submenu() {
		// TODO Auto-generated method stub
		// escaneo del teclado
		Scanner scanner = new Scanner(System.in);
		// opciones a elegir
		System.out.println("Ingrese el calculo a realizar:");
		System.out.println("1.-Perimetro cuadrado");
		System.out.println("2.-Calcular area del cuadrado");
		System.out.println("3.-Calcular Volumen del cubo");
		System.out.println("4.-Calcular Perímetro cubo");
		System.out.println("5.-Volver a capturar el valor de la medida del lado");
		System.out.println("6.-Salir del programa");
		
		//tomar la opcion
		int opcionElegida = Integer.parseInt(scanner.nextLine());
		return opcionElegida;
	}

	// metodo de incio del menu
	private static void inicio() {
		// peticion incial
		// escaneo del teclado
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese la medida del lado:");
		try {
			// De lo ingresado pedimos lo que necesitamos
			double medicionDelLado = Double.parseDouble(scanner.nextLine());
			// creamos nueva clase
			// con el constructor
			// ya teniendo la medida de lo que necesitamos
			cubo = new Cubo(medicionDelLado);

		} catch (NumberFormatException nfe) {
			System.out.println("El valor debe de ser un entero");
			// vuelve a ejecutar la orden
			inicio();
		}
	}

}
