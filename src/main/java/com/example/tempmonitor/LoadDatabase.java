package com.example.tempmonitor;

import com.example.tempmonitor.entity.Measurement;
import com.example.tempmonitor.repository.MeasurementRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(MeasurementRepository repository) {

        return args -> {
            log.info("preload dummy data here");
//            repository.save(new Measurement(36.5, 1655048488, 2));
//            repository.save(new Measurement(36.2, 1655048588, 2));
//            repository.save(new Measurement(36.4, 1655048688, 2));
//            repository.save(new Measurement(36.1, 1655048788, 2));
//            repository.save(new Measurement(36.6, 1655048888, 2));
//            repository.save(new Measurement(36.9, 1655048988, 2));
//            repository.save(new Measurement(36.3, 1655058488, 2));
//            repository.save(new Measurement(36.2, 1655068488, 2));
//            repository.save(new Measurement(36.4, 1655078488, 2));
//            repository.save(new Measurement(36.5, 1655088488, 2));
//            repository.save(new Measurement(36.6, 1655098488, 2));
//            repository.save(new Measurement(39.0, 1655048416, 3));
        };
    }
}
