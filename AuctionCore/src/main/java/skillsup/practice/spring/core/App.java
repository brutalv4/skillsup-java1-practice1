package skillsup.practice.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import skillsup.practice.spring.dao.ItemDao;
import skillsup.practice.spring.dao.UserDao;
import skillsup.practice.spring.shared.model.Item;
import skillsup.practice.spring.shared.model.User;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/core/core-context.xml");

		AuctionService auctionService = context.getBean(AuctionService.class);
		ItemDao itemDao = context.getBean(ItemDao.class);
		Item item = itemDao.findAll().get(0);

		UserDao userDao = context.getBean(UserDao.class);
		User user = userDao.findAll().get(0);

		auctionService.createLot(item, user);
		auctionService.getAllActiveLots().forEach(System.out::println);

	}
}