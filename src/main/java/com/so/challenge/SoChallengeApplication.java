package com.so.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger.web.ModelRendering;
import springfox.documentation.swagger.web.DocExpansion;
import springfox.documentation.swagger.web.OperationsSorter;
import springfox.documentation.swagger.web.TagsSorter;

@SpringBootApplication
@EnableSwagger2
public class SoChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoChallengeApplication.class, args);
	}

	@Bean
	UiConfiguration uiConfig() {
	  return UiConfigurationBuilder.builder()
		  .deepLinking(true)
		  .displayOperationId(false)
		  .defaultModelsExpandDepth(1)
		  .defaultModelExpandDepth(1)
		  .defaultModelRendering(ModelRendering.EXAMPLE)
		  .displayRequestDuration(false)
		  .docExpansion(DocExpansion.NONE)
		  .filter(false)
		  .maxDisplayedTags(null)
		  .operationsSorter(OperationsSorter.ALPHA)
		  .showExtensions(false)
		  .tagsSorter(TagsSorter.ALPHA)
		  .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
		  .validatorUrl(null)
		  .build();
	}
}
