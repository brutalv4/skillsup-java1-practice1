package skillsup.practice.spring.shared.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class LotHistory implements HasId {

	private long id;
	private Lot lot;
	private User buyer;
	private BigDecimal price;
	private LocalDateTime changeTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Lot getLot() {
		return lot;
	}

	public void setLot(Lot lot) {
		this.lot = lot;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDateTime getChangeTime() {
		return changeTime;
	}

	public void setChangeTime(LocalDateTime changeTime) {
		this.changeTime = changeTime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LotHistory that = (LotHistory) o;
		return id == that.id &&
				Objects.equals(lot, that.lot) &&
				Objects.equals(buyer, that.buyer) &&
				Objects.equals(price, that.price) &&
				Objects.equals(changeTime, that.changeTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, lot, buyer, price, changeTime);
	}

	@Override
	public String toString() {
		return "LotHistory{" +
				"id=" + id +
				", lot=" + lot +
				", buyer=" + buyer +
				", price=" + price +
				", changeTime=" + changeTime +
				'}';
	}
}