package com.wordpress.carledwinj.com.wordpress.carledwinj.repository;

import com.wordpress.carledwinj.com.wordpress.carledwinj.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by carledwinj on 23/08/2016.
 */
@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {
}
