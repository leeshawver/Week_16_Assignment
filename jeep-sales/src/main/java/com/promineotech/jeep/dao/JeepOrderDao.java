package com.promineotech.jeep.dao;

import java.util.List;
import java.util.NoSuchElementException;

import com.promineotech.jeep.entity.Color;
import com.promineotech.jeep.entity.Customer;
import com.promineotech.jeep.entity.Engine;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.Option;
import com.promineotech.jeep.entity.OrderRequest;
import com.promineotech.jeep.entity.Tire;

public interface JeepOrderDao {  

/**
   * 
   * @param orderRequest
   * @return
   */
  private List<Option> getOption(OrderRequest orderRequest) {
    return jeepOrderDao.fetchOptions(orderRequest.getOptions());
  }

  /**
   * 
   * @param orderRequest
   * @return
   */
  private Tire getTire(OrderRequest orderRequest) {
    return jeepOrderDao.fetchTire(orderRequest.getTire())
        .orElseThrow(() -> new NoSuchElementException(
            "Tire with ID=" + orderRequest.getTire() + " was not found"));
  }

  /**
   * 
   * @param orderRequest
   * @return
   */
  private Engine getEngine(OrderRequest orderRequest) {
    return jeepOrderDao.fetchEngine(orderRequest.getEngine())
        .orElseThrow(() -> new NoSuchElementException(
            "Engine with ID=" + orderRequest.getEngine() + " was not found"));
  }

  /**
   * 
   * @param orderRequest
   * @return
   */
  private Color getColor(OrderRequest orderRequest) {
    return jeepOrderDao.fetchColor(orderRequest.getColor())
        .orElseThrow(() -> new NoSuchElementException(
            "Color with ID=" + orderRequest.getColor() + " was not found"));
  }

  /**
   * 
   * @param orderRequest
   * @return
   */
  private Jeep getModel(OrderRequest orderRequest) {
    return jeepOrderDao
        .fetchModel(orderRequest.getModel(), orderRequest.getTrim(),
            orderRequest.getDoors())
        .orElseThrow(() -> new NoSuchElementException("Model with ID="
            + orderRequest.getModel() + ", trim=" + orderRequest.getTrim()
            + orderRequest.getDoors() + " was not found"));
  }

  /**
   * 
   * @param orderRequest
   * @return
   */
  private Customer getCustomer(OrderRequest orderRequest) {
    return jeepOrderDao.fetchCustomer(orderRequest.getCustomer())
        .orElseThrow(() -> new NoSuchElementException("Customer with ID="
            + orderRequest.getCustomer() + " was not found"));
  }
}
/**
 * 
 */
//package com.promineotech.jeep.dao;
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.Optional;
//
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;
//
//import org.hibernate.validator.constraints.Length;
//
//import com.promineotech.jeep.entity.Color;
//import com.promineotech.jeep.entity.Customer;
//import com.promineotech.jeep.entity.Engine;
//import com.promineotech.jeep.entity.Jeep;
//import com.promineotech.jeep.entity.JeepModel;
//import com.promineotech.jeep.entity.Option;
//import com.promineotech.jeep.entity.Order;
//import com.promineotech.jeep.entity.Tire;
//
//public interface JeepOrderDao {
//
//	/**
//	 * @param customer
//	 * @return
//	 */
//	Optional <Customer> fetchCustomer(@NotNull String customerId);
//	
//	Optional <Jeep> fetchModel(JeepModel model, String trim, int doors);
//	
//	Optional <Color> fetchColor(String colorId);
//	
//	Optional <Engine> fetchEngine(String engineId);
//	
//	Optional <Tire> fetchTire(String tireId);
//
//	Order saveOrder(Customer customer, Jeep jeep, Color color, Engine engine,
//		Tire tire, BigDecimal price, List<Option> options);
//
//	/**
//	 * @param options
//	 * @return
//	 */
//	List<Option> fetchOptions(List<String> optionIds);
//}
