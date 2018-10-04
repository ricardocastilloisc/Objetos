import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cadena inicial
		String Cadena;
		// escanea lo que teclemos en consola
		Scanner entrada = new Scanner(System.in);
		// pedimos al usuario que nos diga el caracter que quiera convertir
		System.out.print("Ingrese la medida del lado: ");
		// lo convierte a la variable principal
		Cadena = entrada.nextLine();
		
		

		Cubo cubo = new Cubo(5.0);

	}

}
