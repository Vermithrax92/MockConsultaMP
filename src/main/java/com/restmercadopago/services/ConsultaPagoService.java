package com.restmercadopago.services;

import com.mercadopago.core.MPApiResponse;
import com.mercadopago.exceptions.MPConfException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mercadopago.*;
import org.springframework.stereotype.Service;

@Service
public class ConsultaPagoService {



    static final Logger LOG = LoggerFactory.getLogger(ConsultaPagoService.class);


    public MPApiResponse findPaymentById(Integer id) throws MPConfException {

        LOG.info("Llama a MP para buscar un pago por id");

        MPApiResponse paymentInfo;

        MercadoPago.SDK.setAccessToken("TEST-5804797682678094-020110-29f047dd342f605f6808e313c877bc9d__LC_LA__-299457414");

        try {
            paymentInfo = MercadoPago.SDK.Get("https://api.mercadopago.com/v1/payments/search?id=27965090&access_token=TEST-5804797682678094-020110-29f047dd342f605f6808e313c877bc9d__LC_LA__-299457414");


        } catch (Exception e){
            paymentInfo = null;
            LOG.error(e.getMessage());
        }

        return paymentInfo;

    }


}
