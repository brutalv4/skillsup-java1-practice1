package skillsup.practice.spring.core.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "skillsup.practice.spring.*")
@ImportResource(locations = "classpath:/dao/dao-context.xml")
@PropertySource("classpath:auction.properties")
public class SpringConfig {

    @Bean("gson")
    public Gson gson() {
        return new GsonBuilder().create();
    }
}
