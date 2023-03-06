package br.com.jdevtreinamento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.jdevtreinamento.model.Pessoa;
import br.com.jdevtreinamento.repositories.PessoaRepository;

@Controller
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;
    
    @RequestMapping(method = RequestMethod.GET, value = "/cadastropessoa")
    public String inicio(){
        return "cadastro/cadastropessoa";
    }

    
    @RequestMapping(method = RequestMethod.POST, value = "/salvarpessoa")
    public ModelAndView salvar(Pessoa pessoa){
        pessoaRepository.save(pessoa);
        ModelAndView andView = new ModelAndView("cadastro/cadastropessoa");
        Iterable<Pessoa> pessoasIt = pessoaRepository.findAll();
        andView.addObject("pessoas", pessoasIt);
        return andView;
    }

    @RequestMapping(method = RequestMethod.GET, value="/listapessoas")
    public ModelAndView pessoas(){
        ModelAndView andView = new ModelAndView("cadastro/cadastropessoa");
        Iterable<Pessoa> pessoasIt = pessoaRepository.findAll();
        andView.addObject("pessoas", pessoasIt);
        return andView;
    }
}
