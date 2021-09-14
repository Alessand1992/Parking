package kg.Alessand.DBcontrollers.h2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@PropertySource({"classpath:application.properties"})
@EnableJpaRepositories(
        basePackages = "kg.Alessand.Task.dao.ParkHistoryRepo",
        entityManagerFactoryRef = "parkHistoryEntityManager",
        transactionManagerRef = "parkHistoryTransactionManager")
public class DbConfigsParkHistory {

    @Bean
    @ConfigurationProperties(prefix="spring.second-datasource")
    public DataSource parkHistoryDataSource() {
        return DataSourceBuilder.create().build();
    }

}