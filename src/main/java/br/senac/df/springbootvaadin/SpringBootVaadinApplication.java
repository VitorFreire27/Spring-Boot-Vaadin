package br.senac.df.springbootvaadin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.senac.df.springbootvaadin.dao.PessoaRepository;
import br.senac.df.springbootvaadin.model.Pessoa;

@SpringBootApplication
public class SpringBootVaadinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootVaadinApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(PessoaRepository repository) {
		return (args) -> {
			repository.save(new Pessoa(1,"Michel","Ivan","Michael.Ivan@gmail.com"));
			repository.save(new Pessoa(2,"Taissa","Klein","Taissa.Klein@gmail.com"));
		};
	}
}
