package com.backendguru.OrderManagementToolService.service;

import com.backendguru.OrderManagementToolService.clients.OrderClient;
import com.backendguru.OrderManagementToolService.dto.ReturnOrderProcessResponseDto;
import com.backendguru.OrderManagementToolService.dto.ReturnOrderRequestDto;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessTool {

    private final OrderClient orderClient;

    public OrderProcessTool(OrderClient orderClient) {
        this.orderClient = orderClient;
    }

    @Tool(name = "orderReturnProcess", description = "initiates the order return process", returnDirect = true)
    public ReturnOrderProcessResponseDto orderReturnProcess(String orderNo, String productName, String reason){
        ReturnOrderRequestDto orderRequestDto = new ReturnOrderRequestDto();
        orderRequestDto.setOrderNo(orderNo);
        orderRequestDto.setReason(reason);
        orderRequestDto.setProductName(productName);
        return orderClient.orderReturnProcess(orderRequestDto);

    }

    @Tool(name = "orderCancelProcess", description = "initiates the order cancel process")
    public ReturnOrderProcessResponseDto orderCancelProcess(String orderNo, String productName, String reason){
        ReturnOrderRequestDto orderRequestDto = new ReturnOrderRequestDto();
        orderRequestDto.setOrderNo(orderNo);
        orderRequestDto.setReason(reason);
        orderRequestDto.setProductName(productName);
        return null;

    }
}
