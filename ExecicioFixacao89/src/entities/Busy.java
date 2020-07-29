package entities;

public class Busy {

	Students students = new Students();
	
	Pensionato pensionato = new Pensionato(); 
	
	public String toString() {	
		System.out.print(pensionato.getRoom()+": "+ students.getName()+", "+students.getEmail());
		return null;
	}
}
