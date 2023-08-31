/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.dao;

import pos.layerd.dao.customer.impl.CustomerDaoImpl;
/**
 *
 * @author Harsha
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    
    public static DaoFactory getinstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
            return daoFactory;
    }
    public SuperDao getDao(DaoType type){
        switch (type) {
            case CUSTOMER:
                return new CustomerDaoImpl();
            default:
                return null;
        }
    }
    public enum DaoType{
        CUSTOMER
    }
    
}
