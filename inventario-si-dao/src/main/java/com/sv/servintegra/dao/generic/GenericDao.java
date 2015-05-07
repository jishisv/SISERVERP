//package com.sv.servintegra.dao.generic;
//
//import java.io.Serializable;
//import java.lang.reflect.ParameterizedType;
//import java.util.List;
//import org.hibernate.Criteria;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class GenericDao<T, ID extends Serializable> {
//
//    private Class myclass;
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    public GenericDao() {
//        myclass = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//    }
//
//    public List<T> findAll() {
//        Criteria c = sessionFactory.getCurrentSession().createCriteria(myclass);
//        return c.list();
//    }
//
//    public T findById(Serializable id) {
//        return (T) sessionFactory.getCurrentSession().get(myclass, id);
//    }
//
//    public SessionFactory getSessionFactory() {
//        return sessionFactory = this.sessionFactory;
//    }
//
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    public Serializable save(T entity) {
//        return sessionFactory.getCurrentSession().save(entity);
//    }
//
//    public T update(T entity) {
//        return (T) sessionFactory.getCurrentSession().merge(entity);
//    }
//
//    public void delete(T entity) {
//        sessionFactory.getCurrentSession().delete(entity);
//    }
//}
