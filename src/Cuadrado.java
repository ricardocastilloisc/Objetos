import org.omg.CORBA.PRIVATE_MEMBER;

public class Cuadrado {
	//atributo
	private double lado;
	//constructor
	public Cuadrado(double parametrolado) {
		// TODO Auto-generated constructor stub
		
		this.lado = parametrolado;
	}
	//acceder a lado
	public double getLado() {
		return lado;
	}
	//modificar lado
	public void setLado(double lado) {
		this.lado = lado;
	}
	//calcular area
	public double Area() 
	{
		//retorna ya con el calculo
		return Math.pow(this.lado, 2.0);
	}
	public double Perimetro() 
	{
		return this.lado*4;
	}

}
