package com.wangsd.droolsDemo;

public class Message {  
  
  
    //常量 HELLO 值0  
    public static final int HELLO = 0;  
    //常量 GOODBYE 值0  
    public static final int GOODBYE = 1;  
  
  
    //消息  
    private String message;  
    //状态  
    private int status;  
  
  
    public String getMessage() {  
        return this.message;  
    }  
  
  
    public void setMessage(String message) {  
        this.message = message;  
    }  
  
  
    public int getStatus() {  
        return this.status;  
    }  
  
  
    public void setStatus(int status) {  
        this.status = status;  
    }  
      
  
  
}  