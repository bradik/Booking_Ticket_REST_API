package com.booking.train.ticket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Brad on 16.09.2017.
 */

@Configuration
@EnableTransactionManagement
@EnableJpaAuditing
public class AppConfig {

}
