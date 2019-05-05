/** 
 * @author Ivan Simurina 
 * 
 * @version 0.0.1-05.05.19
 */
package hr.hrc.croz.phonebook;

public class Address {
	private Integer ID;
	private String streetName;
	private String streetNumber;
	private Integer cityID;
	private City city;
	
	/**
	 * @return the iD
	 */
	public Integer getID() {
		return ID;
	}
	
	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}
	
	/**
	 * @return the streetNumber
	 */
	public String getStreetNumber() {
		return streetNumber;
	}
	
	/**
	 * @return the cityID
	 */
	public Integer getCityID() {
		return cityID;
	}
		
	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(Integer iD) {
		ID = iD;
	}
	
	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	/**
	 * @param streetNumber the streetNumber to set
	 */
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	
	/**
	 * @param cityID the cityID to set
	 */
	public void setCityID(Integer cityID) {
		this.cityID = cityID;
		this.city = new City(cityID);
	}
	
	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}
	
	/**
	 * Default constructor. Sets default parameters.
	 */
	public Address() {
		super();
		this.ID = new Integer(0);
		this.streetName = new String("Noname street");
		this.streetNumber = new String("99");
		this.cityID = new Integer(9999);
		this.city = new City(9999);
	}
	
	/**
	 * Constructor.
	 * 
	 * @param iD Address ID
	 * @param streetName Contact's street address name
	 * @param streetNumber Contact's street's address number
	 * @param cityID City ID (example: Zagreb -> 10000)
	 */
	public Address(Integer iD, String streetName, String streetNumber, Integer cityID) {
		super();
		this.ID = iD;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.cityID = cityID;
		this.city = new City(cityID);
	}
	
	/**
	 * Constructor.
	 * 
	 * @param addressID Address ID
	 */
	public Address(Integer addressID) {
		super();
		this.ID = new Integer(addressID);
		this.streetName = new String("Noname street");
		this.streetNumber = new String("99");
		this.cityID = new Integer(9999);
		this.setCityID(9999);
	}
	
	/**
	 * Prints contact's address info (to string).
	 */
	@Override
	public String toString() {
		String output = new String(
		    	"Address ID: " + this.getID() + "\n" +
		    	"Street name: " + this.getStreetName() + "\n" + 
		    	"Street number: " + this.getStreetNumber() + "\n" + 
		    	"City ID: " + this.getCityID() 
		    );					
		return output;
	}
	
	public static void main(String[] args) {
		Address adr = new Address();
		System.out.println(adr);
	}
}
