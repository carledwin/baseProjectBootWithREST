package com.wordpress.carledwinj.service;

import com.wordpress.carledwinj.model.AbstractModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cedwinj on 23/08/2016.
 */
public abstract class AbstractService<T extends AbstractModel<Long>, Long extends Serializable> {

    protected abstract JpaRepository<T, Long> getRepository();

    public List<T> listar(){ return getRepository().findAll();}

    public T save (T entity){return getRepository().save(entity);}

    public T get(Long id){
        T entity = getRepository().findOne(id);
        return entity;
    }

    public void delete(Long id){
            getRepository().delete(id);
    }

    public void put(T entity){
        T getEntity = getRepository().findOne((Long) entity.getId());
        getRepository().save(getEntity);
    }
}
