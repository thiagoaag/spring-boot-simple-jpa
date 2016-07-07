package br.com.zup.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"br.com.zup.domain"})
@EnableJpaRepositories(basePackages = {"br.com.zup.repository"})
@EnableTransactionManagement
public class RepositoryConfiguration {
    // only need this for configure the repository
}

