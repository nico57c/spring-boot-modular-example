package io.reflectoring.booking;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "io.reflectoring.booking")
public class BookingModuleConfiguration {

  private static final Logger logger = LoggerFactory.getLogger(BookingModuleConfiguration.class);

  @PostConstruct
  public void postConstruct(){
    logger.info("BOOKING MODULE LOADED!");
  }

}
