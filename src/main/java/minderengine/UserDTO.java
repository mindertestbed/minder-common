package minderengine;

/**
 * 
 * A data transfer object that wraps information about the minder server user.
 * 
 * @author yerlibilgin
 */
public class UserDTO {
	private String userName;
	private String name;
	private String surname;
	private String eMail;

	/**
	 * Constructor of UserTDO object
	 * 
	 * @param userName
	 * @param name
	 * @param surname
	 * @param eMail
	 */
	public UserDTO(String userName, String name, String surname, String eMail) {
		this.userName = userName;
		this.name = name;
		this.surname = surname;
		this.eMail = eMail;
	}

	/**
 * 
 */
	public UserDTO() {
	}

	/**
	 * etter method of username variable
	 * 
	 * @return the userName of the user
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * etter method of name variable
	 * 
	 * @return the first name of the user if it exists
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter method of surname variable
	 *
	 * @return the family name of the user if it exists
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * getter method of email variable
	 * 
	 * @return the email of the user
	 */
	public String geteMail() {
		return eMail;
	}

	/**
	 * Setter method of username variable
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Setter method of name variable
	 * 
	 * @param name the new first name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter method of surname variable
	 * 
	 * @param surname the new surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Setter method of email variable
	 * 
	 * @param eMail the new email
	 */
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}
