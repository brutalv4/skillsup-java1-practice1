package skillsup.practice.spring.core;

import com.google.gson.Gson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import skillsup.practice.spring.core.config.SpringConfig;
import skillsup.practice.spring.dao.ItemDao;
import skillsup.practice.spring.dao.UserDao;
import skillsup.practice.spring.shared.model.Item;
import skillsup.practice.spring.shared.model.User;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        AuctionService auctionService = context.getBean(AuctionService.class);
        ItemDao itemDao = context.getBean(ItemDao.class);
        Item item = itemDao.findAll().get(0);

        UserDao userDao = context.getBean(UserDao.class);
        User user = userDao.findAll().get(0);

        auctionService.createLot(item, user);
        auctionService.getAllActiveLots().forEach(System.out::println);

        Gson gson = (Gson) context.getBean("gson");
        System.out.println(gson.toJson(auctionService));
    }
}