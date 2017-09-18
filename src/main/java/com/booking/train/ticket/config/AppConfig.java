package com.booking.train.ticket.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Brad on 16.09.2017.
 */

@Configuration
@EnableTransactionManagement
@EnableJpaAuditing
@ComponentScan("com.booking.train.ticket")
public class AppConfig {

}
