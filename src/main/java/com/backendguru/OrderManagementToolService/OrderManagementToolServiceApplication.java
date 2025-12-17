package com.backendguru.OrderManagementToolService;

import com.backendguru.OrderManagementToolService.service.OrderProcessTool;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class OrderManagementToolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementToolServiceApplication.class, args);
	}

	@Bean
	ToolCallbackProvider toolCallbacks(OrderProcessTool tools) {
		return MethodToolCallbackProvider.builder()
				.toolObjects(tools)
				.build();
	}
}
