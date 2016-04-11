package skillsup.practice.spring.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import skillsup.practice.spring.dao.GenericDao;
import skillsup.practice.spring.shared.model.HasId;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public abstract class GenericDaoImpl<E extends HasId> implements GenericDao<E> {

	private final Logger logger = LoggerFactory.getLogger("DAO");

	private final AtomicLong counter = new AtomicLong(0);
	private final Map<Long, E> dataBase = new HashMap<>();

	@Override
	public E save(E entity) {
		long id = counter.getAndIncrement();
		entity.setId(id);
		dataBase.put(id, entity);
		logger.info("Stored new entity: {}", entity);
		return entity;
	}

	@Override
	public void update(E entity) {
		E original = dataBase.get(entity.getId());
		if (original == null) {
			logger.info("Nothing to update. Entity with id {} was not found!", entity.getId());
			return;
		}
		dataBase.put(entity.getId(), entity);
		logger.info("Entity was updated from {} to {}", original, entity);
	}

	@Override
	public void delete(E entity) {
		E deleted = dataBase.remove(entity.getId());
		if (deleted == null) {
			logger.info("Can't find entity to delete!");
		} else {
			logger.info("Entity {} deleted successfully!", entity);
		}
	}

	@Override
	public E findById(long id) {
		return dataBase.get(id);
	}

	@Override
	public List<E> findAll() {
		return new ArrayList<>(dataBase.values());
	}

	protected Map<Long, E> getDataBase() {
		return dataBase;
	}

	protected Logger getLogger() {
		return logger;
	}
}
