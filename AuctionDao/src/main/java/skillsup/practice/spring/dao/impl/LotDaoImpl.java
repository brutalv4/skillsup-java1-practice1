package skillsup.practice.spring.dao.impl;

import org.springframework.stereotype.Repository;
import skillsup.practice.spring.dao.LotDao;
import skillsup.practice.spring.shared.model.Lot;

@Repository("lotDao")
public class LotDaoImpl extends GenericDaoImpl<Lot> implements LotDao {

}
