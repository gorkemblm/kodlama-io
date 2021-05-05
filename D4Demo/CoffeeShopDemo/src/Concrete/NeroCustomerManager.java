
package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

    /*
    private CustomerCheckService customerCheckService;

    public NeroCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }
    */
    //İleride Nero da isterse bı şekilde yapıyoruz.
    
    @Override
    public  void save(Customer customer) {
        System.out.println(customer.getFirstName() + " save to db");
    } 
}
