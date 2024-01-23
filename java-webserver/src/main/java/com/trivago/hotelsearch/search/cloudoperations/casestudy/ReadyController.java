package com.trivago.hotelsearch.search.cloudoperations.casestudy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ReadyController {

  long startTime = System.currentTimeMillis();
  Random random = new Random();
  long readyTime = random.nextInt(12) * 1000;

  @RequestMapping("/ready")
  public String readyCheck() {

    if (System.currentTimeMillis() - startTime <= readyTime) {
      throw new UnreadyException();
    } else {
      return "ready";
    }
  }
}
