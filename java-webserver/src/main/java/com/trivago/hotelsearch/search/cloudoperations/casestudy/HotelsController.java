package com.trivago.hotelsearch.search.cloudoperations.casestudy;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

@RestController
public class HotelsController {

  public Counter hotelCounter;

  public HotelsController(MeterRegistry registry) {
    hotelCounter = registry.counter("hotels_requests");
  }

  @RequestMapping(value = "/hotels", produces = MediaType.APPLICATION_JSON_VALUE)
  public String hotelsList() {
    Resource resource = new ClassPathResource("static/hotels.json");
    String json = "";
    try (InputStream stream = resource.getInputStream()) {
      json = StreamUtils.copyToString(stream, Charset.forName("UTF-8"));
      hotelCounter.increment();
    } catch (IOException ioe) {
      System.out.println("Exception thrown: " + ioe);
    }
    return json;
  }

  @RequestMapping("/requests")
  public String requestVisualizer() {
    return String.valueOf(hotelCounter.count());
  }
}
