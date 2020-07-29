package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double miss;
	
	
	public double result() {
		return nota1 + nota2 + nota3;
	}
	
	public void condition () {
		if(result() > 60){
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			miss = 60 - result();
			System.out.println("MISSING " + miss + " POINTS");			
		}	
	}			
}
