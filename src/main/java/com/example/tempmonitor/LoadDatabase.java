package com.example.tempmonitor;

import com.example.tempmonitor.entity.Temperature;
import com.example.tempmonitor.repository.TemperatureRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(TemperatureRepository repository) {

        return args -> {
            repository.save(new Temperature(36.5, 1655048488, 2L));
            repository.save(new Temperature(36.2, 1655048588, 2L));
            repository.save(new Temperature(36.4, 1655048688, 2L));
            repository.save(new Temperature(36.1, 1655048788, 2L));
            repository.save(new Temperature(36.6, 1655048888, 2L));
            repository.save(new Temperature(36.9, 1655048988, 2L));
            repository.save(new Temperature(36.3, 1655058488, 2L));
            repository.save(new Temperature(36.2, 1655068488, 2L));
            repository.save(new Temperature(36.4, 1655078488, 2L));
            repository.save(new Temperature(36.5, 1655088488, 2L));
            repository.save(new Temperature(36.6, 1655098488, 2L));
            repository.save(new Temperature(39.0, 1655048416, 3L));
        };
    }
}
