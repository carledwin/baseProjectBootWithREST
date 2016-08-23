package com.wordpress.carledwinj.service;

import com.wordpress.carledwinj.model.Despesa;
import com.wordpress.carledwinj.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created by carledwinj on 23/08/2016.
 */
@Service
public class DespesaService extends AbstractService<Despesa, Long>{

    @Autowired
    private DespesaRepository despesaRepository;

    @Override
    protected JpaRepository<Despesa, Long> getRepository() {
        return despesaRepository;
    }
}
