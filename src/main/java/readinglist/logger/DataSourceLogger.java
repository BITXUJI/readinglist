package readinglist.logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DataSourceLogger {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void logDataSource() {
        System.out.println("DataSource class: " + dataSource.getClass().getName());
    }
}
