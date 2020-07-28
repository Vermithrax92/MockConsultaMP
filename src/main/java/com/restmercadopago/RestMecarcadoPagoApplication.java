package com.restmercadopago;

import com.mercadopago.exceptions.MPConfException;
import com.restmercadopago.services.ConsultaPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RestMecarcadoPagoApplication {



    public static void main(String[] args) throws MPConfException {

        SpringApplication.run(RestMecarcadoPagoApplication.class, args);

        //ConsultaPagoService consultaPagoService = new ConsultaPagoService();
        //System.out.println(consultaPagoService.findPaymentById(27965090).getJsonElementResponse());
    }
}
