package minderengine;

import java.util.List;


/**
 * 
 * A data transfer object that wraps endpoint information about the gitb compatible minder wrapper.
 * Detailed explanations is defined in gitb specification.
 * 
 * @author yerlibilgin
 */
public class GitbEndpointDTO {
	
	private String name;
	private String description;
	private List<GitbParameter> params;
	
	/**
	 * Constructor of GitbEndpointDTO object
	 * 
	 * @param name
	 * @param description
	 * @param params
	 */
	public GitbEndpointDTO(String name, String description,	List<GitbParameter> params) {
		this.name = name;
		this.description = description;
		this.params = params;
	}
	
	public GitbEndpointDTO() {
		
	}
	
	/**
	 * Getter method of name variable
	 *
	 * @return name
	 */
	public String getName() {
		return name;
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
	 * Getter method of description variable
	 *
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter method of description variable
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter method of key-value parameter list variable
	 *
	 * @return params
	 */
	public List<GitbParameter> getParams() {
		return params;
	}

	/**
	 * Setter method of key-value parameter list variable
	 * 
	 * @param params
	 */
	public void setParams(List<GitbParameter> params) {
		this.params = params;
	}

	
	
}
