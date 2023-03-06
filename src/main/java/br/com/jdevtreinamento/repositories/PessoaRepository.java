package br.com.jdevtreinamento.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.jdevtreinamento.model.Pessoa;

@Transactional
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
    
}
