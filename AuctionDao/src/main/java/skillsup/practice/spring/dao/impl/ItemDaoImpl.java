package skillsup.practice.spring.dao.impl;

import org.springframework.stereotype.Repository;
import skillsup.practice.spring.dao.ItemDao;
import skillsup.practice.spring.shared.model.Item;

import javax.annotation.PostConstruct;

@Repository("itemDao")
public class ItemDaoImpl extends GenericDaoImpl<Item> implements ItemDao {

    @PostConstruct
    public void init() {
        Item first = new Item();
        first.setTitle("A table");
        first.setDescription("Nice table");
        first.setHeight(4.5d);
        first.setWeight(1.2);
        first.setWidth(0.9);

        save(first);
    }
}
