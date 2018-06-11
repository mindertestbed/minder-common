package minderengine;

/**
 *
 * A gitb endpoint configuration parameter that is owned one or more by adapter.
 * Detailed explanations is defined in gitb specification.
 *
 * @author yerlibilgin
 */
public class GitbParameter{

	private String name;
	private String value;
	private GitbUsageEnumeration use;
	private GitbConfigurationType kind;
	private String description;

	/**
	 * Constructor of GitbParameter object
	 *
	 * @param name
	 * @param value
	 * @param use
	 * @param kind
	 * @param description
	 */
	public GitbParameter(String name, String value, GitbUsageEnumeration use,
			GitbConfigurationType kind, String description) {
		super();
		this.name = name;
		this.value = value;
		this.use = use;
		this.kind = kind;
		this.description = description;
	}

	public GitbParameter() {
		super();
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
	 * Getter method of value variable
	 *
	 * @return value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Setter method of value variable
	 *
	 * @param value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Getter method of use variable
	 *
	 * @return use
	 */
	public GitbUsageEnumeration getUse() {
		return use;
	}

	/**
	 * Setter method of use variable
	 *
	 * @param use
	 */
	public void setUse(GitbUsageEnumeration use) {
		this.use = use;
	}

	/**
	 * Getter method of kind variable
	 *
	 * @return kind
	 */
	public GitbConfigurationType getKind() {
		return kind;
	}

	/**
	 * Setter method of kind variable
	 *
	 * @param kind
	 */
	public void setKind(GitbConfigurationType kind) {
		this.kind = kind;
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



}
