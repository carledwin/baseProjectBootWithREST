package com.wordpress.carledwinj.controller;

import com.wordpress.carledwinj.model.AbstractModel;
import com.wordpress.carledwinj.model.Despesa;
import com.wordpress.carledwinj.repository.DespesaRepository;
import com.wordpress.carledwinj.service.AbstractService;
import com.wordpress.carledwinj.service.DespesaService;
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
public class DespesaRestController extends AbstractController<Despesa, Long>{

    @Autowired
    private DespesaService despesaService;

    @Override
    protected AbstractService<Despesa, Long> getService() {
        return despesaService;
    }
}
