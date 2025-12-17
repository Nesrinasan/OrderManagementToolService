package com.backendguru.OrderManagementToolService.clients;

import com.backendguru.OrderManagementToolService.dto.ReturnOrderProcessResponseDto;
import com.backendguru.OrderManagementToolService.dto.ReturnOrderRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "OrderService")
public interface OrderClient {

    @PostMapping("/order/orderReturnProcess")
    ReturnOrderProcessResponseDto orderReturnProcess(@RequestBody ReturnOrderRequestDto orderRequestDto);



}