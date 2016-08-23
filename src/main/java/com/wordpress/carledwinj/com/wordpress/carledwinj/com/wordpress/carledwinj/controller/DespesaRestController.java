package com.wordpress.carledwinj.com.wordpress.carledwinj.com.wordpress.carledwinj.controller;

import com.wordpress.carledwinj.com.wordpress.carledwinj.model.Despesa;
import com.wordpress.carledwinj.com.wordpress.carledwinj.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by carledwinj on 23/08/2016.
 */
@RestController
@RequestMapping("api/despesa")
public class DespesaRestController {

    @Autowired
    private DespesaRepository despesaRepository;


    @RequestMapping(method= RequestMethod.GET)
    public List<Despesa> index(){
        return despesaRepository.findAll();
    }

    @RequestMapping(value="/get/{id}", method=RequestMethod.GET)
    public Despesa get(@PathVariable Long id){
        Despesa despesa = despesaRepository.findOne(id);
        return despesa;
    }

    @RequestMapping(value="/post", method=RequestMethod.POST)
    public Despesa post(Despesa despesa){
        return despesaRepository.save(despesa);
    }

    @RequestMapping(value="/put/{id}", method=RequestMethod.PUT)
    public HttpStatus put(@PathVariable Long id, Despesa despesa){
        try{
            despesa.setId(id);
            despesaRepository.save(despesa);
            return HttpStatus.OK;
        }catch(Exception e){
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }

    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public HttpStatus delete(@PathVariable Long id){
        try{
            despesaRepository.delete(id);
            return HttpStatus.OK;
        }catch(Exception e){
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }

    }
}
