package com.backendguru.SearchService;

import com.backendguru.SearchService.service.OrderProcessTool;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class MailToolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailToolServiceApplication.class, args);
	}

	@Bean
	ToolCallbackProvider toolCallbacks(OrderProcessTool tools) {
		return MethodToolCallbackProvider.builder()
				.toolObjects(tools)
				.build();
	}
}
