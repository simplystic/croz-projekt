/** 
 * @author Ivan Simurina 
 * 
 * @version 0.0.1-05.05.19
 */
package hr.hrc.croz.phonebook;

public class Sex {
	/**
	 * 1 == Male
	 * 2 == Female (can also be any other number excluding 1)
	 */
	private Integer ID; 
	
	/**
	 * "Male" or "Female"
	 */
	private String sexName;
	
	/**
	 * @return the iD
	 */
	public Integer getID() {
		return ID;
	}
	
	/**
	 * @return the sexName
	 */
	public String getSexName() {
		return sexName;
	}

	/**
	 * @param iD 
	 */
	public void setID(Integer iD) {
		ID = iD;
		if (ID.equals(1)) {
			this.sexName = new String("Male");
		} else {
			this.sexName = new String("Female");
		}
	}
			
	/**
	 * @param iD sex ID, 1 for male, >=2 for female
	 */
	public Sex(Integer iD) {
		super();
		ID = iD;
		this.setID(ID);
	}

	/**
	 * Prints male or female based on sex ID.
	 */
	@Override
	public String toString() {
		String output = new String("Female");
		if (ID.equals(1)) {
			output = new String("Male");
		}		
		return output;
	}
	
	public static void main(String[] args) {
		Sex sex = new Sex(2);
		System.out.println(sex);
	}
}
