package com.restmercadopago.controllers;

import com.restmercadopago.dto.mercadopago.infopago.MPResponseDTO;
import com.restmercadopago.services.ConsultaPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConsultaPagoController {

    @Autowired
    private ConsultaPagoService consultaPagoService;

    @RequestMapping(value = "consultapago/{idPago}", method = RequestMethod.GET)
    public MPResponseDTO consultaPagoId(@PathVariable String idPago) {
        return consultaPagoService.buscarPagoById(idPago);
    }

    @RequestMapping(value = "errorgeneral/{idPago}", method = RequestMethod.PUT)
    public MPResponseDTO errorGeneralPagoId(@PathVariable String idPago) {
        return consultaPagoService.pagoErrorGeneralById(idPago);
    }

    @RequestMapping(value = "aprobado/{idPago}", method = RequestMethod.PUT)
    public MPResponseDTO aprobadoPagoId(@PathVariable String idPago) {
        return consultaPagoService.pagoAprobadoById(idPago);
    }

    @RequestMapping(value = "pendiente/{idPago}", method = RequestMethod.PUT)
    public MPResponseDTO pendientePagoId(@PathVariable String idPago) {
        return consultaPagoService.pagoPendienteById(idPago);
    }

    @RequestMapping(value = "rechazoautorizacion/{idPago}", method = RequestMethod.PUT)
    public MPResponseDTO rechazoAutorizacionPagoId(@PathVariable String idPago) {
        return consultaPagoService.pagoRechazadoParaAutorizarById(idPago);
    }

    @RequestMapping(value = "montoinsuficiente/{idPago}", method = RequestMethod.PUT)
    public MPResponseDTO rechazoMontoInsuficientePagoId(@PathVariable String idPago) {
        return consultaPagoService.pagoRechazadoMontoInsuficienteById(idPago);
    }

    @RequestMapping(value = "codigoinvalido/{idPago}", method = RequestMethod.PUT)
    public MPResponseDTO rechazoCodigoInvalidoPagoId(@PathVariable String idPago) {
        return consultaPagoService.pagoRechazadoCodigoSeguridadById(idPago);
    }

    @RequestMapping(value = "fechaexpiracion/{idPago}", method = RequestMethod.PUT)
    public MPResponseDTO rechazoFechaExpiracionPagoId(@PathVariable String idPago) {
        return consultaPagoService.pagoRechazadoFechaExpiracionById(idPago);
    }
}
