package com.merlin.app.rest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
  @GetMapping(value = "/")
  public String getPage() {
    return "Hallo und Willkommen";
  }

}
