package skillsup.practice.spring.shared.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Lot implements HasId {

	private long id;
	private User owner;
	private Item item;
	private LocalDateTime datePlaced;
	private BigDecimal startPrice;
	private User buyer;
	private BigDecimal currentPrice;
	private LocalDateTime dateEnd;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public LocalDateTime getDatePlaced() {
		return datePlaced;
	}

	public void setDatePlaced(LocalDateTime datePlaced) {
		this.datePlaced = datePlaced;
	}

	public BigDecimal getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(BigDecimal startPrice) {
		this.startPrice = startPrice;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public BigDecimal getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
	}

	public LocalDateTime getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(LocalDateTime dateEnd) {
		this.dateEnd = dateEnd;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Lot lot = (Lot) o;
		return id == lot.id &&
				Objects.equals(owner, lot.owner) &&
				Objects.equals(item, lot.item) &&
				Objects.equals(datePlaced, lot.datePlaced) &&
				Objects.equals(startPrice, lot.startPrice) &&
				Objects.equals(buyer, lot.buyer) &&
				Objects.equals(currentPrice, lot.currentPrice) &&
				Objects.equals(dateEnd, lot.dateEnd);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, owner, item, datePlaced, startPrice);
	}

	@Override
	public String toString() {
		return "Lot{" +
				"id=" + id +
				", owner=" + owner +
				", item=" + item +
				", datePlaced=" + datePlaced +
				", startPrice=" + startPrice +
				", buyer=" + buyer +
				", currentPrice=" + currentPrice +
				", dateEnd=" + dateEnd +
				'}';
	}
}