package entities;

public class Students {

	public String name;
	public String email;
	
	public Students(String name, String email) {
		
		this.name = name;
		this.email = email;
	}

	
	public Students() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
