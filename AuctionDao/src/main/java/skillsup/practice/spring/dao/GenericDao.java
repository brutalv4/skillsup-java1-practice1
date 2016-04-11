package skillsup.practice.spring.dao;

import java.util.List;

public interface GenericDao<E> {

	E save(E entity);
	void update(E entity);
	void delete(E entity);
	E findById(long id);
	List<E> findAll();

}