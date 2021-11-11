package com.spring.eventsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventsController {

  @RequestMapping(value = "/newevent")
  public String newEventForm(){
    return "/event/formEvent";
  }
}
