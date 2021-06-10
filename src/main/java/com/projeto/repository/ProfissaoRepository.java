package com.projeto.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projeto.model.Profissao;
@Repository
@Transactional
public interface ProfissaoRepository extends CrudRepository<Profissao, Long> {

}
