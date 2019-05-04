/** 
 * @author Ivan Simurina 
 * 
 * @version 0.0.1-04.05.29
 * 
 */
package hr.hrc.croz.phonebook;

import java.util.Scanner;

public class Contact {
    private Integer ID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Integer sexID;
    private Integer addressID;
    private Sex sex;
    
	private static Scanner scanner;
	/**
	 * @return the iD
	 */
	public Integer getID() {
		return ID;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the sexID
	 */
	public Integer getSexID() {
		return sexID;
	}
	/**
	 * @return the addressID
	 */
	public Integer getAddressID() {
		return addressID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(Integer iD) {
		ID = iD;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param sexID the sexID to set
	 */
	public void setSexID(Integer sexID) {
		this.sexID = sexID;
		this.sex.setID(sexID);
	}
	/**
	 * @param addressID the addressID to set
	 */
	public void setAddressID(Integer addressID) {
		this.addressID = addressID;
	}

	
	/**
	 * Contact class constructor
	 * 
	 * @param iD
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param email
	 * @param sexID
	 * @param addressID
	 */
	public Contact(Integer iD, String firstName, String lastName, String phone, String email, Integer sexID,
			Integer addressID) {
		super();
		this.ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.sexID = sexID;
		this.addressID = addressID;
		this.sex = new Sex(this.getSexID());
	}
	
	/**
	 * Default Contact class constructor
	 */
	public Contact() {
		super();
		this.ID = 0;
		this.firstName = new String("John");
		this.lastName = new String("Doe");
		this.phone = new String("0987654321");
		this.email = new String("john.doe@protonmail.com");
		this.sexID = new Integer(1); // default male
		this.addressID = new Integer(0);
		this.sex = new Sex(this.getSexID());
	}
	
	
	public static void main(String[] args) {
		Contact contact = new Contact();		
		
		boolean doLoop = true; // Infinite loop flag, false when user ends input 
		while (doLoop) {
			
			// Contact's ID
			System.out.print("Enter contact ID: ");
	    	scanner = new Scanner(System.in);
			int contactID = scanner.nextInt();
	    	contact.setID(contactID);	    	
	    		    	
	    	// Contact's first name
	    	System.out.print("Enter contact's first name: ");
	    	String firstName = scanner.next();
	    	contact.setFirstName(firstName);	    	
	    		    	
	    	// Contact's last name
	    	System.out.print("Enter contact's last name: ");
	    	String lastName = scanner.next();
	    	contact.setLastName(lastName);	    	
	    		    	
	    	// Contact's phone number
	    	System.out.print("Enter contact's phone number: ");
	    	String phone = scanner.next();
	    	contact.setPhone(phone);
	    	
	    	// Contact's e-mail
	    	System.out.print("Enter contact's e-mail: ");
	    	String email = scanner.next();
	    	contact.setEmail(email);
	    	
	    	// Contact's sex ID
	    	System.out.print("Enter contact's sex ID (1 for male, 2 for female): ");
	    	Integer sexID = scanner.nextInt();
	    	contact.setSexID(sexID);
	    	
	    	
	    	// Contact's address ID
	    	System.out.print("Enter contact's address ID: ");
	    	Integer addressID = scanner.nextInt();
	    	contact.setAddressID(addressID);	    	
	    	

	    	
	    	
	    	// Print contact's info to screen:
	    	System.out.println("-------------------------------------------------");
	    	System.out.println("Contact ID: " + contact.getID());
	    	System.out.println("Contact's first name: " + contact.getFirstName());
	    	System.out.println("Contact's last name: " + contact.getLastName());
	    	System.out.println("Contact's phone number: " + contact.getPhone());
	    	System.out.println("Contact's e-mail: " + contact.getEmail());
	    	System.out.println("Contact's address ID: " + contact.getAddressID());
	    	System.out.println("Contact's sex: " + contact.sex.getSexName());
	    	
	    	doLoop = false;
		}
		
	
	}
}