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
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * etter method of name variable
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter method of surname variable
	 * 
	 * @return
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * getter method of email variable
	 * 
	 * @return
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
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter method of surname variable
	 * 
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Setter method of email variable
	 * 
	 * @param eMail
	 */
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}
