package kg.Alessand.DBcontrollers;

import org.springframework.beans.BeanUtils;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.source.ConfigurationPropertyNameAliases;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.source.MapConfigurationPropertySource;

import javax.sql.DataSource;

//public class DataSourseBuild {
//    public T build() {
//        Class<? extends DataSource> type = getType();
//        DataSource result = BeanUtils.instantiateClass(type);
//        maybeGetDriverClassName();
//        bind(result);
//        return (T) result;
//    }
//    private void bind(DataSource result) {
//        ConfigurationPropertySource source = new MapConfigurationPropertySource(this.properties);
//        ConfigurationPropertyNameAliases aliases = new ConfigurationPropertyNameAliases();
//        aliases.addAliases("url", "jdbc-url");
//        aliases.addAliases("username", "user");
//        Binder binder = new Binder(source.withAliases(aliases));
//        binder.bind(ConfigurationPropertyName.EMPTY, Bindable.ofInstance(result));
//    }
//}
