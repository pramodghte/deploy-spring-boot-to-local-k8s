package de.rieckpil.blog;

import org.springframework.boot.actuate.redis.RedisHealthIndicator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
	 RedisHealthIndicator f;
  @GetMapping
  public List<String> getMessage() {
	  List<String> list = new ArrayList<String>();
	  list.add("Hello");
	  list.add("from");
	  list.add("kub");
    return list;
  }
}
