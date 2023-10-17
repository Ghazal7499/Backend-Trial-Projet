package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 25;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";

	// Constructor to receive the first Name and last Name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email created:" +this.firstName + " " + this.lastName + " ");
	
	
	//Call a method asking for the department - return the department
	this.department = setDepartment();
	//System.out.println("Department:" + this.department);
	
	//Call a method that returns a random password
	this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is:" + this.password);
		
		//Combine elements to generate Email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is: " +email);
	}
	
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("New worker: " + firstName + ". Department Codes: \n1 for sales \n2 for developement \n3 for Accounting \n0 for none\n Enter the department:");
		Scanner scan = new Scanner(System.in);
		int departmentChoice = scan.nextInt();
		if(departmentChoice == 1) { return "sales";}
			else if(departmentChoice == 2) { return "developement";}
			else if(departmentChoice == 3) { return "Accounting";}	
			else { return " "; }
		}
	
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
		int random = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassowrd(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getalternateEmail() { return alternateEmail; }
	public String getpassword() { return password; }
	
	public String showInfo() {
		return "DISPLAY NAME:" + firstName + " " + lastName + "\nCOMPANY MAIL:" + email + "\nMAILBOX CAPACITY: " + 
	mailboxCapacity + "MB";
	}
}

