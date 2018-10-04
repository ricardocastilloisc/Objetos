
public class Cubo extends Cuadrado{

	public Cubo(double lado) {
		// TODO Auto-generated constructor stub
		//ser inicializa el lado
		super(lado);
	}
	//calcular volumen
	public double VolumenCubo() {
		//retornar con el calculo
		return Math.pow(getLado(), 3.0);
	}
	//calcular perimetro
	public double PerimetroCuboCubo() {
		//retornar con el calculo
		return getLado()*12;
	}
	//poner el lado
	public void ponerLado(double parametroLado) {
		setLado(parametroLado);
	}

}
