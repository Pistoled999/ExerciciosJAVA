package exercicio152.entites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;

   public Client () {
	   
   }
   
   
    public Client(String name, String email) {
	
	this.name = name;
	this.email = email;
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


	public LocalDate getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	public void readBirthDate() {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String dateString = sc.nextLine();
        birthDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }


	@Override
	public String toString() {
		return name + " (" + birthDate + ") - " + email;
 	}
	
	
}

