package skillsup.practice.spring.core.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import skillsup.practice.spring.core.AuctionService;
import skillsup.practice.spring.core.impl.AuctionServiceImpl;
import skillsup.practice.spring.dao.ItemDao;
import skillsup.practice.spring.dao.LotDao;
import skillsup.practice.spring.dao.UserDao;

@Configuration
@ComponentScan(basePackages = "skillsup.practice.spring.*")
@ImportResource(locations = "classpath:/dao/dao-context.xml")
@PropertySource("classpath:auction.properties")
public class SpringConfig {

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private LotDao lotDao;

    @Value("${auction.duration.days}")
    private int auctionDurationDays;

    @Value("${min.bid.step}")
    private int minBidStep;

    @Bean
    public AuctionService auctionService() {
        return new AuctionServiceImpl(
                itemDao,
                userDao,
                lotDao,
                auctionDurationDays,
                minBidStep
        );
    }


    @Bean("gson")
    public Gson gson() {
        return new GsonBuilder().create();
    }
}
