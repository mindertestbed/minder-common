package minderengine;

/**
 * Created by yerlibilgin on 30/11/14.
 * <br>
 * A data transfer object that wraps information about the minder server user.
 */
public class UserDTO {
  private String userName;
  private String name;
  private String surname;
  private String eMail;

  public UserDTO(String userName, String name, String surname, String eMail) {
    this.userName = userName;
    this.name = name;
    this.surname = surname;
    this.eMail = eMail;
  }

  public UserDTO() {
  }

  public String getUserName() {
    return userName;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String geteMail() {
    return eMail;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void seteMail(String eMail) {
    this.eMail = eMail;
  }
}
