/** 
 * @author Ivan Simurina 
 * @version 0.0.1-05.05.19
 */
package hr.hrc.croz.phonebook;

public class Country {
	private Integer ID;
	private String name;
	private String alpha2;
	private String alpha3;
			
	/**
	 * @return the iD
	 */
	public Integer getID() {
		return ID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the alpha2
	 */
	public String getAlpha2() {
		return alpha2;
	}

	/**
	 * @return the alpha3
	 */
	public String getAlpha3() {
		return alpha3;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(Integer iD) {
		ID = iD;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param alpha2 the alpha2 to set
	 * TODO exception
	 */
	public void setAlpha2(String alpha2)  {
		if(alpha2.length() != 2) {
			System.err.println("Wrong country's alpha 2 length: " + alpha2.length());
			System.exit(92);
		}
		this.alpha2 = alpha2;
		
	}

	/**
	 * @param alpha3 the alpha3 to set
	 * 
	 * TODO exception
	 */
	public void setAlpha3(String alpha3) {
		if(alpha3.length() != 3) {
			System.err.println("Wrong country's alpha 3 length: " + alpha3.length());
			System.exit(93);
		}
		this.alpha3 = alpha3;
	}
	
	/**
	 * Default constructor. Sets default values.
	 */
	public Country() {
		super();
		this.ID = new Integer(385);
		this.name = new String("Croatia");
		this.setAlpha2("HR");
		this.setAlpha3("CRO");
	}
	
	/**
	 * @param iD Country's ID 
	 */
	public Country(Integer ID) {
		super();
		this.ID = ID;
		if(this.ID.equals(385)) { // 385 == Croatia
			this.name = new String("Croatia");
			this.setAlpha2("HR");
			this.setAlpha3("CRO");
		} else {
			this.name = new String("Neverland");
			this.setAlpha2("NV");
			this.setAlpha3("NVL");
		}
	}

	/**
	 * @param ID Country's ID 
	 * @param name Country name
	 * @param alpha2 Alpha 2
	 * @param alpha3 Alpha 3
	 */
	public Country(Integer ID, String name, String alpha2, String alpha3) {
		super();
		this.ID = ID;
		this.name = name;
		this.setAlpha2(alpha2);
		this.setAlpha3(alpha3);
	}
		
	@Override
	public String toString() {
		String output = new String(
		    	"Country ID: " + this.getID() + "\n" +
		    	"Country name: " + this.getName() + "\n" + 
		    	"Alpha 2: " + this.getAlpha2() + "\n" + 
		    	"Alpha 3: " + this.getAlpha3() 
		    );					
		return output;
	}
	
	public static void main(String[] args) {
		Country country = new Country(385);
		System.out.println(country);
	}
}
