package com.restmercadopago.dto.mercadopago.infopago;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalInfo {

    @JsonProperty("available_balance")
    private String availableBalance;

    @JsonProperty("nsu_processadora")
    private String nsuProcessadora;

    public AdditionalInfo(){

    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getNsuProcessadora() {
        return nsuProcessadora;
    }

    public void setNsuProcessadora(String nsuProcessadora) {
        this.nsuProcessadora = nsuProcessadora;
    }
}
