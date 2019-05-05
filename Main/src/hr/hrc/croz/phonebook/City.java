/** 
 * @author Ivan Simurina 
 * @version 0.0.1-05.05.19
 */
package hr.hrc.croz.phonebook;

public class City {
	private Integer ID;
	private String name;
	private String zip;
	private Integer countryID;
	private Country country;	
	
	/**
	 * @return the iD City's ID 
	 */
	public Integer getID() {
		return ID;
	}
	
	/**
	 * @return the name City's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the zip City's ZIP code.
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @return the countryID City's country ID
	 */
	public Integer getCountryID() {
		return countryID;
	}
	
	/**
	 * @return country Country class that belong to this city.
	 */	
	public Country getCountry() {
		return this.country;
	}	
	
	/**
	 * @param iD City ID to set  
	 */
	public void setID(Integer iD) {
		ID = iD;
		if(ID.equals(10000)) {
			this.setName("Zagreb");
			this.setZip("10000");
			this.setCountryID(385);
			this.country = new Country(385, "Croatia", "HR", "CRO");
		} else {
			this.setName("NoTown");
			this.setZip("99999");
			this.setCountryID(999);
			this.country = new Country(385);
		}
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @param countryID the countryID to set
	 */
	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}
	
	/**
	 * Default constructor. Sets default values.
	 */
	public City() {
		super();
		this.setID(10000);
	}
	
	/**
	 * Constructor. Creates info from city's ID.
	 * 
	 * @param iD City ID.
	 */
	public City(Integer iD) {
		super();
		this.setID(10000);		
	}
	
	/**
	 * @param iD City's ID.
	 * @param name City's name.
	 * @param zip City's ZIP code.
	 * @param countryID City's country's ID.
	 */
	public City(Integer iD, String name, String zip, Integer countryID) {
		super();
		this.setID(iD);
		this.name = name;
		this.zip = zip;
		this.countryID = countryID;
		this.country = new Country(this.countryID);
	}
	
	@Override
	public String toString() {
		String output = new String(
				"City ID: " + this.getID() + "\n" + 
				"City name: " + this.getName() + "\n" + 
				"ZIP code: " + this.getZip() + "\n" + 
				"Country ID: " + this.getCountryID() + "\n" + 
				"---------------------- \n" + 
				"|   Country info:    | \n" +
				"---------------------- \n" +
				this.country
			);
		return output;
	}
	
	public static void main(String[] args) {
		City city = new City(10000);
		System.out.println(city);
		
	}
}
