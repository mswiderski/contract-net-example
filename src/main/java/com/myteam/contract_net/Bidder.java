package com.myteam.contract_net;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Bidder implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String id;
	private java.lang.String name;
	private java.lang.String email;

	public Bidder() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public Bidder(java.lang.String id, java.lang.String name,
			java.lang.String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	@Override
    public String toString() {
        return "Bidder{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}