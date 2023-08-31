/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.controller;

import pos.layerd.dto.CustomerDto;
import pos.layerd.service.ServiceFactory;
import static pos.layerd.service.ServiceFactory.ServiceType.CUSTOMER;
import pos.layerd.service.customer.CustomerService;

/**
 *
 * @author Harsha
 */
public class CustomerController {
    CustomerService customerService = (CustomerService) ServiceFactory.getinstance().getService(CUSTOMER);
    public String addCustomer(CustomerDto customerDto) throws Exception {
       return customerService.addCustomer(customerDto);
    }
    
}
