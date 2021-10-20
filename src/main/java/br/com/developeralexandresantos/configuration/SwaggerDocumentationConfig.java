package br.com.developeralexandresantos.configuration;

import br.com.developeralexandresantos.rest.v1.DefaultApiDelegate;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerDocumentationConfig {

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("weatherSoap")
				.description("API para converter números")
				.license("")
				.contact(new Contact("", "", "gp-alexandresantos@uol.com.br"))
				.build();
	}
	
	@Bean
	public Docket customImplementation() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage(DefaultApiDelegate.class.getPackage().getName()))
				.paths(Predicates.not(PathSelectors.ant("/")))
				.build()
				.apiInfo(apiInfo());
	}
}
