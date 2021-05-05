
package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer; 

public class StarbucksCustomerManager extends BaseCustomerManager{
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService CustomerCheckService) {
        this.customerCheckService = CustomerCheckService;
    }
    
    
    @Override
    //Starbucks kontrol sağlaması istediği için sadece buraya override ettim.
    public void save(Customer customer) {
        
        if (customerCheckService.CheckIfRealPerson(customer)) {
            super.save(customer);
        }else {
            try {
                throw new Exception("Not a valid person");
            }catch (Exception ex) {
                ex.printStackTrace();
             }
        }
        
    }

   
    
}
