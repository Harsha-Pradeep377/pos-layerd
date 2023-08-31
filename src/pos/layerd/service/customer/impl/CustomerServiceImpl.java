/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.service.customer.impl;

import pos.layerd.dao.DaoFactory;
import pos.layerd.dao.customer.CustomerDao;
import pos.layerd.dto.CustomerDto;
import pos.layerd.entity.CustomerEntity;
import pos.layerd.service.customer.CustomerService;

/**
 *
 * @author Harsha
 */
public class CustomerServiceImpl implements CustomerService{
    
    CustomerDao customerDao = (CustomerDao) DaoFactory.getinstance().getDao(DaoFactory.DaoType.CUSTOMER);

    public String addCustomer(CustomerDto dto) throws Exception {
        CustomerEntity ce = new CustomerEntity(dto.getId(), dto.getTitle(), dto.getName(), dto.getDob(), dto.getSalary(), dto.getAddress(), dto.getCity(), dto.getProvince(), dto.getZip());
        
        if(customerDao.addCustomer(ce)){
            return "Successfully Added";
        }else{
            return "Fail";
        }
       
    }
    
}
