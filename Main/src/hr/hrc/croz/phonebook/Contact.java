/** 
 * @author Ivan Simurina 
 * 
 * @version 0.0.1-05.05.19
 */
package hr.hrc.croz.phonebook;

import java.util.Iterator;
import java.util.Scanner;

public class Contact {
    private Integer ID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Integer sexID;
    private Sex sex;
    private Integer addressID;
    private Address address;    
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
		this.address.setID(addressID);
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
		this.sex = new Sex(this.getSexID());
		this.addressID = new Integer(0);
		this.address = new Address(addressID);
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
		this.address = new Address();
		this.sex = new Sex(this.getSexID());
	}

	/**
	 * Prints whole contact's info to string.
	 */
	@Override
	public String toString() {
		String output = new String(
		    	"Contact ID: " + this.getID() + "\n" +
		    	"Contact's first name: " + this.getFirstName() + "\n" + 
		    	"Contact's last name: " + this.getLastName() + "\n" + 
		    	"Contact's phone number: " + this.getPhone() + "\n" +
		    	"Contact's e-mail: " + this.getEmail() + "\n" +
		    	"Contact's sex: " + this.sex.getSexName() + "\n" +
		    	"--------------------------- \n" +
		    	"| Contact's ADDRESS info: | \n" +
		    	"--------------------------- \n" +
		    	this.address + "\n" +
		    	"------------------------ \n" + 
		    	"| Contact's CITY info: | \n" +
		    	"------------------------ \n" + 
		    	this.address.getCity()
			);		
		return output;
	}
	
	public static void main(String[] args) {
		Contact contact = new Contact();		
		
		boolean doLoop = true; // Infinite loop flag, false when user ends input 
		while (doLoop) {
			
			// Contact's ID
			System.out.print("Enter contact ID: ");
	    	scanner = new Scanner(System.in);
	    	contact.setID(Integer.parseInt(scanner.nextLine()));	    	
	    		    	
	    	// Contact's first name
	    	System.out.print("Enter contact's first name: ");
	    	contact.setFirstName(scanner.nextLine());	    	
	    		    	
	    	// Contact's last name
	    	System.out.print("Enter contact's last name: ");
	    	contact.setLastName(scanner.nextLine());	    	
	    		    	
	    	// Contact's phone number
	    	System.out.print("Enter contact's phone number: ");
	    	contact.setPhone(scanner.nextLine());
	    	
	    	// Contact's e-mail
	    	System.out.print("Enter contact's e-mail: ");
	    	contact.setEmail(scanner.nextLine());
	    	
	    	// Contact's sex ID
	    	System.out.print("Enter contact's sex ID (1 for male, 2 for female): ");
	    	contact.setSexID(Integer.parseInt(scanner.nextLine()));	    	
	    	
	    	// Contact's address ID
	    	System.out.print("Enter contact's address ID: ");
	    	contact.setAddressID(Integer.parseInt(scanner.nextLine()));	
	    	
	    	// Contact's address street name
	    	System.out.print("Enter contact's street name: ");	    	
	    	contact.address.setStreetName(scanner.nextLine());
	    	
	    	// Contact's address street number
	    	System.out.print("Enter contact's street number: ");
	    	contact.address.setStreetNumber(scanner.nextLine());
	    	
	    	// Contact's address city ID
	    	System.out.print("Enter contact's city ID: ");
	    	contact.address.setCityID(Integer.parseInt(scanner.nextLine()));
	    	
	    	
	    	
	    	
	    	// ****************************************************************** //
	    	// *           Print contact's info to screen:						* //
	    	// ****************************************************************** //
	    	System.out.println("-------------------------------------------------");
	    	System.out.println("|           CONTACT'S INFO                      |");
	    	System.out.println("-------------------------------------------------");
	    	System.out.println(contact);
	    	
	    	doLoop = false;
		}	
	}
}