package kg.Alessand.DBcontrollers;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@PropertySource({"classpath:application.properties"})
@EnableJpaRepositories(
        basePackages = "kg.Alessand.Task.dao.ParkRepo",
        entityManagerFactoryRef = "parkEntityManager",
        transactionManagerRef = "parkTransactionManager")
public class DbConfigPark {

    @Primary
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource parkDataSource() {
        return DataSourceBuilder.create().build();
    }

}