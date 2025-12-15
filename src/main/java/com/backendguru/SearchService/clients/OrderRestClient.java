package com.backendguru.SearchService.clients;

import com.backendguru.SearchService.dto.ReturnOrderProcessResponseDto;
import com.backendguru.SearchService.dto.ReturnOrderRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
@Service
public class OrderRestClient {

    RestClient restClient = RestClient.create();

    public ReturnOrderProcessResponseDto returnOrder(ReturnOrderRequestDto orderRequestDto){
        String uriBase = "http://127.0.0.1:8082";
        return restClient.post()
                .uri(uriBase + "/order/orderReturnProcess")
                .body(orderRequestDto)
                .retrieve()
                .body(ReturnOrderProcessResponseDto.class);
    }

}
