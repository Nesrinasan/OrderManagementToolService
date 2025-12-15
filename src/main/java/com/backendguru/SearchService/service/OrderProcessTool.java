package com.backendguru.SearchService.service;

import com.backendguru.SearchService.clients.OrderClient;
import com.backendguru.SearchService.clients.OrderRestClient;
import com.backendguru.SearchService.dto.ReturnOrderProcessResponseDto;
import com.backendguru.SearchService.dto.ReturnOrderRequestDto;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessTool {

    private final OrderClient orderClient;

    public OrderProcessTool(OrderClient orderClient) {
        this.orderClient = orderClient;
    }

    public ReturnOrderProcessResponseDto orderReturnProcess(String orderNo, String productName, String reason){
        ReturnOrderRequestDto orderRequestDto = new ReturnOrderRequestDto();
        orderRequestDto.setOrderNo(orderNo);
        orderRequestDto.setReason(reason);
        orderRequestDto.setProductName(productName);
        return  null;

    }

}
