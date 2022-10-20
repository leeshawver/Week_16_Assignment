/**
 * 
 */
package com.promineotech.jeep.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import com.promineotech.jeep.entity.Order;
import com.promineotech.jeep.entity.OrderRequest;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultJeepOrderController implements JeepOrderController {

	@Override
	public Order createOrder(@Valid OrderRequest orderRequest) {
		log.info(orderRequest.toString());
		return null;
	}

}
