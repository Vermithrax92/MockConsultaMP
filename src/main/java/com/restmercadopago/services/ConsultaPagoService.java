package com.restmercadopago.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.restmercadopago.dto.mercadopago.ResponseMercadoPagoDTO;
import com.restmercadopago.dto.mercadopago.infopago.MPResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mercadopago.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConsultaPagoService {

    @Value("${acces.token}")
    private String ACCES_TOKEN;

    @Value("${endpoint.payment.search}")
    private String PAYMENT_SEARCH_MP;

    static final Logger LOG = LoggerFactory.getLogger(ConsultaPagoService.class);


    public MPResponseDTO buscarPagoById(String id) {

        LOG.info("Llamada a MP para buscar un pago por id");

        MPResponseDTO paymentInfo;
        JsonObject jsonPago;

        try {
            jsonPago = (JsonObject) MercadoPago.SDK.Get(PAYMENT_SEARCH_MP + id + "&" + ACCES_TOKEN).getJsonElementResponse();
            paymentInfo = convertirJsonResponseAResponseMercadoPagoDTO(jsonPago);

        } catch (Exception e){
            paymentInfo = null;
            LOG.error(e.getMessage());
        }

        return paymentInfo;

    }

    public MPResponseDTO pagoAprobadoById(String id){
        LOG.info("Cambiando estado de pago a aprobado");

        MPResponseDTO paymentInfo;

        try {
            paymentInfo = buscarPagoById(id);
            paymentInfo.setStatus("approved");
            paymentInfo.setStatusDetail("accredited");

        } catch (Exception e) {
            paymentInfo = null;
            LOG.error(e.getMessage());
        }

        return paymentInfo;

    }

    public MPResponseDTO pagoPendienteById(String id){
        LOG.info("Cambiando estado de pago a pendiente");

        MPResponseDTO paymentInfo;

        try {
            paymentInfo = buscarPagoById(id);
            paymentInfo.setStatus("in_process");
            paymentInfo.setStatusDetail("pending_contingency");

        } catch (Exception e) {
            paymentInfo = null;
            LOG.error(e.getMessage());
        }

        return paymentInfo;

    }

    public MPResponseDTO pagoRechazadoParaAutorizarById(String id){
        LOG.info("Cambiando estado de pago a Rechazado con validación para autorizar ");

        MPResponseDTO paymentInfo;

        try {
            paymentInfo = buscarPagoById(id);
            paymentInfo.setStatus("rejected");
            paymentInfo.setStatusDetail("cc_rejected_call_for_authorize");

        } catch (Exception e) {
            paymentInfo = null;
            LOG.error(e.getMessage());
        }

        return paymentInfo;

    }

    public MPResponseDTO pagoRechazadoMontoInsuficienteById(String id){
        LOG.info("Cambiando estado de pago a Rechazado por monto insuficiente");

        MPResponseDTO paymentInfo;

        try {
            paymentInfo = buscarPagoById(id);
            paymentInfo.setStatus("rejected");
            paymentInfo.setStatusDetail("cc_rejected_insufficient_amount");

        } catch (Exception e) {
            paymentInfo = null;
            LOG.error(e.getMessage());
        }

        return paymentInfo;

    }

    public MPResponseDTO pagoRechazadoCodigoSeguridadById(String id){
        LOG.info("Cambiando estado de pago a Rechazado por código de seguridad inválido");

        MPResponseDTO paymentInfo;

        try {
            paymentInfo = buscarPagoById(id);
            paymentInfo.setStatus("rejected");
            paymentInfo.setStatusDetail("cc_rejected_bad_filled_security_code");

        } catch (Exception e) {
            paymentInfo = null;
            LOG.error(e.getMessage());
        }

        return paymentInfo;

    }

    public MPResponseDTO pagoRechazadoFechaExpiracionById(String id){
        LOG.info("Cambiando estado de pago a Rechazado por problema con la fecha de expiración");

        MPResponseDTO paymentInfo;

        try {
            paymentInfo = buscarPagoById(id);
            paymentInfo.setStatus("rejected");
            paymentInfo.setStatusDetail("cc_rejected_bad_filled_date");

        } catch (Exception e) {
            paymentInfo = null;
            LOG.error(e.getMessage());
        }

        return paymentInfo;

    }


    public MPResponseDTO pagoErrorGeneralById(String id) {
        LOG.info("Cambiando estado de pago a rejected por error general");

        MPResponseDTO paymentInfo;

        try {
            paymentInfo = buscarPagoById(id);
            paymentInfo.setStatus("rejected");
            paymentInfo.setStatusDetail("cc_rejected_other_reason");

        } catch (Exception e) {
            paymentInfo = null;
            LOG.error(e.getMessage());
        }

        return paymentInfo;
    }

    public MPResponseDTO convertirJsonResponseAResponseMercadoPagoDTO(JsonObject jsonPago) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        jsonPago = jsonPago.getAsJsonObject();
        ResponseMercadoPagoDTO responseMercadoPago = objectMapper.reader().forType(ResponseMercadoPagoDTO.class)
                .readValue(jsonPago.toString());

        return responseMercadoPago.getMPResponseDTO().get(0);
    }


}
