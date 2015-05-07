//package com.sv.servintegra.service.generic;
//
//import java.io.Serializable;
//import java.util.List;
//import org.springframework.transaction.annotation.Transactional;
//import com.sv.servintegra.dao.generic.GenericDao;
//
//@Transactional
//public abstract class GenericService<T, ID extends Serializable> {
//
//    public abstract GenericDao<T, ID> getDao();
//
//    public List<T> findAll() {
//        return getDao().findAll();
//    }
//
//    public T findById(Serializable id) {
//        return getDao().findById(id);
//    }
//
//    public Serializable save(T entity) {
//        return getDao().save(entity);
//    }
//
//    public T update(T entity) {
//        return getDao().update(entity);
//    }
//
//    public void delete(T entity) {
//        getDao().delete(entity);
//    }
//}
