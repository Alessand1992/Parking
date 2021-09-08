package kg.Alessand.Task.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    public static final String PARK = "ПАРКОВКА";
    public static final String CAR = "МАШИНЫ";
    public static final String PARKHISTORY = "ИСТОРИЯ ПАРКОВОЧНЫХ МЕСТ";


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .tags(new Tag(PARK, ""))
                .tags(new Tag(CAR, ""))
                .tags(new Tag(PARKHISTORY, ""));
    }
}
