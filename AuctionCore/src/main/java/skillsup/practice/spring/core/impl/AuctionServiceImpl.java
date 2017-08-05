package skillsup.practice.spring.core.impl;

import skillsup.practice.spring.core.AuctionService;
import skillsup.practice.spring.dao.ItemDao;
import skillsup.practice.spring.dao.LotDao;
import skillsup.practice.spring.dao.UserDao;
import skillsup.practice.spring.shared.model.Item;
import skillsup.practice.spring.shared.model.Lot;
import skillsup.practice.spring.shared.model.LotHistory;
import skillsup.practice.spring.shared.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class AuctionServiceImpl implements AuctionService {
    private final ItemDao itemDao;
    private final UserDao userDao;
    private final LotDao lotDao;

    private final int auctionDurationDays;
    private final int minBidStep;

    public AuctionServiceImpl(ItemDao itemDao, UserDao userDao, LotDao lotDao, int auctionDurationDays, int minBidStep) {
        this.itemDao = itemDao;
        this.userDao = userDao;
        this.lotDao = lotDao;
        this.auctionDurationDays = auctionDurationDays;
        this.minBidStep = minBidStep;
    }

    @Override
    public Lot createLot(Item item, User owner) {
        boolean itemExists =
                itemDao.findAll().stream().anyMatch(item::equals);

        boolean userExists =
                userDao.findAll().stream().anyMatch(owner::equals);

        if (!itemExists || !userExists) {
            throw new IllegalArgumentException("Either item or user not exists!");
        }

        Lot lot = new Lot();
        lot.setOwner(owner);
        lot.setItem(item);

        LocalDateTime now = LocalDateTime.now();
        lot.setDatePlaced(now);
        lot.setDateEnd(now.plusDays(minBidStep));
        lot.setCurrentPrice(BigDecimal.valueOf(1_000));

        lotDao.save(lot);

        return lot;
    }

    @Override
    public List<Lot> getAllActiveLots() {
        return lotDao.findAll();
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
}

