package ar.com.matiasgaleano.Portfolio.controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Message {
  private String Message;

  public Message() {
  }

  public Message(String Message) {
    this.Message = Message;
  }
  
  
}
