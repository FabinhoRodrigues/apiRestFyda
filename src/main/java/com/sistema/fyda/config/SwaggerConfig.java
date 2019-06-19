package com.sistema.fyda.config;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wordnik.swagger.models.Contact;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sistema.fyda"))
                .paths(PathSelectors.ant("/api/*"))
                .build()
                .apiInfo(apiInfo());
    }

	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "API REST SISTEMA FYDA", 
	      "API Desenvolvida para projeto do curso de Desenvolvimento de Aplicações Corporativas.", 
	      "", 
	      "Uso exclusivo como estudo.", 
	      " - Alunos: Alisson Medeiros, Diego Duarte, Fabio Rodrigues, Ygor Rolim | Professor: José Viterbo", 
	      "http://www.ic.uff.br/index.php/en-GB/", 
	     "Desenvolvimento de Aplicações Corporativas");
	    
	}

}
