import Entities.*;
import Abstract.*;
import Concrete.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        
        BaseCustomerManager customerManager = new NeroCustomerManager();
        
        customerManager.save(new Customer(1,"Görkem","Blim",LocalDate.of(1998,4,15),"dsds"));
        
        
        
    
    }
}
