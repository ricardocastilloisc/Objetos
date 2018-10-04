import java.util.Scanner;

import org.omg.CORBA.portable.IndirectionException;

public class Main {

	// la calse cubo donde sera usa dependiendo la necesidad
	static Cubo cubo;
	// este sera el resultado donde podremos visualizar el final
	static double resultado;

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
		// mientras la opcion que elijamos sea diferente a 5 el cual
		// ES volver a poner la medida
		// seguir normal
		while (opcion != 5) {
			//dependiendo a lo que elegimos va darnos el calculo
			resultado = calculos(opcion, cubo);
			//impresion del resultado
			System.out.println("El resultado es: " + resultado + "\n");

			// volver a ver nuestras opciones
			opcion = get_submenu();
		}
		// reiniciamos la peticion incial para poder volver a nuestras opciones
		inicio();
		// volvemos con nuestros menus
		menus();
	}

	// los calculos ya establecidos para poder retornarlos
	private static double calculos(int opcion, Cubo cubo2) {
		// TODO Auto-generated method stub
		// dependiendo la opcion sacara el returno
		//recordatorio de la medida que pusimos al principio de la 
		//ejecucion del programa
		System.out.println("Recuerde que la medida que usted puso fue");
		//le pedimos a la clase que nos indique que fue lo que pedimos
		System.out.println(cubo2.getLado());
		switch (opcion) {
		case 1:
			
			// returna el perimetro del cuadrado
			return cubo.PerimetroCuadrodo();

		case 2:
			// retorname el area del cuadrado
			return cubo.AreaCuadrado();

		case 3:
			// returname el volumen del cubo
			return cubo.VolumenCubo();

		case 4:
			// retorname el perimetro del cubo
			return cubo.PerimetroCubo();

		case 5:
			// vuleve a inicar
			// esto esta de mas
			// solo es por si las dudas
			inicio();
			break;
		case 6:
			// salir del programa
			System.out.println("Saliendo del programa");
			System.exit(0);
			break;

		}
		return opcion;
	}

	// sub menu donde sera los primeros menus que hagamos
	private static int get_submenu() {
		// TODO Auto-generated method stub
		// escaneo del teclado
		Scanner escaneoteclado = new Scanner(System.in);
		// opciones a elegir
		System.out.println("Ingrese el calculo a realizar:");
		System.out.println("1.-Perimetro cuadrado");
		System.out.println("2.-Calcular area del cuadrado");
		System.out.println("3.-Calcular Volumen del cubo");
		System.out.println("4.-Calcular Perímetro cubo");
		System.out.println("5.-Volver a capturar el valor de la medida del lado");
		System.out.println("6.-Salir del programa");

		// tomar la opcion
		int opcionElegida = Integer.parseInt(escaneoteclado.nextLine());
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
