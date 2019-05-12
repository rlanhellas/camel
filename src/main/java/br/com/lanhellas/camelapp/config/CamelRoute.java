package br.com.lanhellas.camelapp.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRoute extends RouteBuilder {
  @Override
  public void configure() throws Exception {
    from("activemq:queue:MyQueue").to("file:/tmp/restaurants.out");
  }
}
