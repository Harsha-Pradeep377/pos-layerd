/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layerd.dao.customer;

import pos.layerd.dao.SuperDao;
import pos.layerd.entity.CustomerEntity;

/**
 *
 * @author Harsha
 */
public interface CustomerDao extends SuperDao {
    String addCustomer(CustomerEntity customerEntity)throws Exception;
}
