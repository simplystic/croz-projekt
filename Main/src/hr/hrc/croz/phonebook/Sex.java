package hr.hrc.croz.phonebook;

public class Sex {
	/**
	 * 1 == Male
	 * 2 == Female (can also be any other number excluding 1)
	 */
	private Integer ID; // 
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
		if (ID.equals(1)) {
			System.out.print("Male");
		} else {
			System.out.print("Female");
		}
		System.out.println();
		return super.toString();
	}
}
