package com.calin.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Repository
@Transactional
public class GenericDao {

    @Autowired
    public SessionFactory sessionFactory;

    public <T> T save(final T o) {
        return (T) sessionFactory.getCurrentSession().save(o);
    }


    public void delete(final Object object) {
        sessionFactory.getCurrentSession().delete(object);
    }

    public <T> T get(final Class<T> type, final Integer id) {
        return (T) sessionFactory.getCurrentSession().get(type, id);
    }

    public <T> void saveOrUpdate(final T o) {
        sessionFactory.getCurrentSession().saveOrUpdate(o);
    }

    public <T> List<T> getAll(final Class<T> type) {
        final Session session = sessionFactory.getCurrentSession();
        final Criteria crit = session.createCriteria(type);
        return crit.list();
    }
}