package com.backendguru.SearchService.service;


import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessTool {

    @Tool(name = "sendMail", description = "mail sending process ")
    public void sendMail(String fromMail, String body, String address){
        System.out.println("send mail");

    }

}
