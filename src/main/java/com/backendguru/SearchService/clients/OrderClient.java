package com.backendguru.SearchService.clients;

import com.backendguru.SearchService.dto.CancelOrderProcessResponseDto;
import com.backendguru.SearchService.dto.ReturnOrderProcessResponseDto;
import com.backendguru.SearchService.dto.ReturnOrderRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "OrderService")
public interface OrderClient {

    @PostMapping("/order/orderReturnProcess")
    ReturnOrderProcessResponseDto orderReturnProcess(@RequestBody ReturnOrderRequestDto orderRequestDto);



}