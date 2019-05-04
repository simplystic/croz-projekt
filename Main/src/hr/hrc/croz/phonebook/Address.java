package hr.hrc.croz.phonebook;
public class Address {
	private Integer ID;
	private String streetName;
	private String streetNumber;
	private Integer cityID;
	
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
	}
	
	/**
	 * @param iD Address ID
	 * @param streetName Contact's street address name
	 * @param streetNumber Contact's street's address number
	 * @param cityID City ID
	 */
	public Address(Integer iD, String streetName, String streetNumber, Integer cityID) {
		super();
		this.ID = iD;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.cityID = cityID;
	}
	
	public static void main(String[] args) {
		Address adr = new Address();
		System.out.println(adr.getStreetName());
	}
}
