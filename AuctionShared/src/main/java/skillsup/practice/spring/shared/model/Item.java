package skillsup.practice.spring.shared.model;

import java.util.Objects;

public class Item implements HasId {

	private long id;
	private String title;
	private String description;
	private Double width;
	private Double height;
	private Double weight;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return id == item.id &&
				Objects.equals(title, item.title) &&
				Objects.equals(description, item.description) &&
				Objects.equals(width, item.width) &&
				Objects.equals(height, item.height) &&
				Objects.equals(weight, item.weight);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, description);
	}

	@Override
	public String toString() {
		return "Item{" +
				"id=" + id +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				", width=" + width +
				", height=" + height +
				", weight=" + weight +
				'}';
	}
}