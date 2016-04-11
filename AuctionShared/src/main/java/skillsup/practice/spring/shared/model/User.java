package skillsup.practice.spring.shared.model;

import java.util.Objects;

public class User implements HasId {

	private long id;
	private String name;
	private String lastName;
	private String deliveryAddress;
	private String contactPhone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return id == user.id &&
				Objects.equals(name, user.name) &&
				Objects.equals(lastName, user.lastName) &&
				Objects.equals(deliveryAddress, user.deliveryAddress) &&
				Objects.equals(contactPhone, user.contactPhone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, lastName);
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				", deliveryAddress='" + deliveryAddress + '\'' +
				", contactPhone='" + contactPhone + '\'' +
				'}';
	}
}