package com.restmercadopago;

import com.mercadopago.exceptions.MPConfException;
import com.restmercadopago.services.ConsultaPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestMecarcadoPagoApplication {

    @Autowired
    ConsultaPagoService consultaPagoService;

    public static void main(String[] args) throws MPConfException {

        SpringApplication.run(RestMecarcadoPagoApplication.class, args);

        //consultaPagoService.findPaymentById(27965090);
    }
}
