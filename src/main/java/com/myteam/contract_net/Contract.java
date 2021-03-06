package com.myteam.contract_net;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Contract implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.lang.String description;
	private java.lang.Double price;
	private java.util.Date expectedDelivery;

	public Contract() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.Double getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.Double price) {
		this.price = price;
	}

	public java.util.Date getExpectedDelivery() {
		return this.expectedDelivery;
	}

	public void setExpectedDelivery(java.util.Date expectedDelivery) {
		this.expectedDelivery = expectedDelivery;
	}

	public Contract(java.lang.String name, java.lang.String description,
			java.lang.Double price, java.util.Date expectedDelivery) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.expectedDelivery = expectedDelivery;
	}

    @Override
    public String toString() {
        return "Contract{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", expectedDelivery='" + expectedDelivery + '\'' +
                '}';
    }
}