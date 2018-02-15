package edu.eci.arsw.myrestaurant.test;

import edu.eci.arsw.myrestaurant.beans.BillCalculator;
import edu.eci.arsw.myrestaurant.model.Order;
import edu.eci.arsw.myrestaurant.services.OrderServicesException;
import edu.eci.arsw.myrestaurant.services.RestaurantOrderServicesStub;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class ApplicationServicesTests {

    @Autowired
    RestaurantOrderServicesStub ros;

    
    @Test
    public void contextLoads() throws OrderServicesException{
    
    }
    
    
    @Test
    public void debeCalcularCorrectamente() throws OrderServicesException{
        int precio = ros.calculateTableBill(1);
        System.out.println(precio);
        int debeDar = (int) ((3*10000+3*10000*0.19)+(3000+3000*0.19)+(4*1300+4*1300*0.16));
        int precioEsp = debeDar;
        assertEquals(precioEsp, precio);
    }
    

}
