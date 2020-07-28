package com.restmercadopago.dto.mercadopago;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.restmercadopago.dto.mercadopago.infopago.MPResponseDTO;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseMercadoPagoDTO {

    /*@JsonProperty("paging")
    private Paging paging;*/

    @JsonProperty("results")
    private ArrayList<MPResponseDTO> MPResponseDTOs;

    public ResponseMercadoPagoDTO(){

    }

   /* public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }*/

    public ArrayList<MPResponseDTO> getMPResponseDTO() {
        return MPResponseDTOs;
    }

    public void setMPResponseDTO(ArrayList<MPResponseDTO> MPResponseDTO) {
        this.MPResponseDTOs = MPResponseDTO;
    }
}
