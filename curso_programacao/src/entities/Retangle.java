package entities;

public class Retangle {

	 public double width; 
	 public double height;
	 

	public double area() {
		return width * height;
	}
		// Fun��o base * altura;
	public double perimeter() {
		return width * 2 + height * 2;
		
	}
		// Fun��o permeter=2piR
	public double diagonal() {
		double hp = width * width + height * height; 	
		return Math.sqrt(hp);
		// Fun��o Hipotenusa
	}
}