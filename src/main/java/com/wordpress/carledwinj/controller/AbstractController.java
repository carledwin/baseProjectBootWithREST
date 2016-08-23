package com.wordpress.carledwinj.controller;

import com.wordpress.carledwinj.model.AbstractModel;
import com.wordpress.carledwinj.service.AbstractService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cedwin on 23/08/2016.
 */
public abstract class AbstractController<T extends AbstractModel<Long>, Long extends Serializable> {

protected abstract AbstractService<T, Long> getService();


    @RequestMapping(method= RequestMethod.GET)
    public List<T> list(){return getService().listar();}

    @RequestMapping(value="/post", method=RequestMethod.POST)
    public T post(T entity){return getService().save(entity);}

    @RequestMapping(value="/put/{id}", method=RequestMethod.PUT)
    public HttpStatus put(@PathVariable java.lang.Long id, T entity){
        try{
            entity.setId(id);
            getService().save(entity);
            return HttpStatus.OK;
        }catch(Exception e){
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }

    @RequestMapping(value="/get/{id}", method=RequestMethod.GET)
    public T get(@PathVariable Long id){
        T entity = getService().get(id);
        return entity;
    }

    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public HttpStatus delete(@PathVariable Long id){
        try{
            getService().delete(id);
            return HttpStatus.OK;
        }catch(Exception e){
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }
    
    
}
