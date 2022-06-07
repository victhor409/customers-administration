package com.jv.soap.webservice.customersadministration.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.jv.CustomerDetail;
import br.com.jv.GetCustomerDetailRequest;
import br.com.jv.GetCustomerDetailResponse;

@Endpoint
public class CustomerDetailEndpoint {
	
	@PayloadRoot(namespace="http://jv.com.br", localPart="GetCustomerDetailRequest")
	@ResponsePayload
	public GetCustomerDetailResponse processCustomerDetailRequest(@RequestPayload GetCustomerDetailRequest req) {
		
		GetCustomerDetailResponse response = new GetCustomerDetailResponse();
		CustomerDetail customerDetail = new CustomerDetail();
		
		customerDetail.setId(1);
		customerDetail.setName("Bob");
		customerDetail.setPhone("9999999");
		customerDetail.setEmail("bob@gmail.com");
		
		
		
		response.setCustomerDetail(customerDetail);
		
		
		return response;
	}

}
