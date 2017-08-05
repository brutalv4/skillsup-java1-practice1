package skillsup.practice.spring.core.impl;

import skillsup.practice.spring.core.AuctionService;
import skillsup.practice.spring.dao.ItemDao;
import skillsup.practice.spring.dao.UserDao;
import skillsup.practice.spring.shared.model.Item;
import skillsup.practice.spring.shared.model.Lot;
import skillsup.practice.spring.shared.model.LotHistory;
import skillsup.practice.spring.shared.model.User;

import java.math.BigDecimal;
import java.util.List;

public class AuctionServiceImpl implements AuctionService {
    private final ItemDao itemDao;
    private final UserDao userDao;

    @Override
    public Lot createLot(Item item, User owner) {
        boolean itemExists =
                itemDao.findAll().stream().anyMatch(item::equals);

        boolean userExists =
                userDao.findAll().stream().anyMatch(owner::equals);

        if (!itemExists || !userExists) {
            throw new IllegalArgumentException("Either item or user not exists!");
        }

        return null;
    }

    @Override
    public List<Lot> getAllActiveLots() {
        return null;
    }

    @Override
    public void vote(Lot lot, User buyer) {

    }

    @Override
    public void vote(Lot lot, User buyer, BigDecimal newPrice) {

    }

    @Override
    public List<LotHistory> getLotHistory(Lot lot) {
        return null;
    }

    public AuctionServiceImpl(ItemDao itemDao, UserDao userDao) {
        this.itemDao = itemDao;
        this.userDao = userDao;
    }
}

