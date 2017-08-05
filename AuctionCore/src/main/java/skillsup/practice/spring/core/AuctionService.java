package skillsup.practice.spring.core;

import skillsup.practice.spring.dao.UserDao;
import skillsup.practice.spring.shared.model.Item;
import skillsup.practice.spring.shared.model.Lot;
import skillsup.practice.spring.shared.model.LotHistory;
import skillsup.practice.spring.shared.model.User;

import java.math.BigDecimal;
import java.util.List;

public interface AuctionService {

    Lot createLot(Item item, User owner);
    List<Lot> getAllActiveLots();
    void vote(Lot lot, User buyer);
    void vote(Lot lot, User buyer, BigDecimal newPrice);
    List<LotHistory> getLotHistory(Lot lot);
}
