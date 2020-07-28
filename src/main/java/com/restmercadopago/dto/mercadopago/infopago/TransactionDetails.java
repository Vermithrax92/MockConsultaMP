package com.restmercadopago.dto.mercadopago.infopago;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDetails {

    @JsonProperty("acquirer_reference")
    private String acquirerReference;

    @JsonProperty("external_resource_url")
    private String externalResource_url;

    @JsonProperty("financial_institution")
    private String financialInstitution;

    @JsonProperty("installment_amount")
    private String installmentAmount;

    @JsonProperty("net_received_amount")
    private String net_receivedAmount;

    @JsonProperty("overpaid_amount")
    private String overpaidAmount;

    @JsonProperty("payable_deferral_period")
    private String payableDeferralPeriod;

    @JsonProperty("payment_method_reference_id")
    private String paymentMethodReferenceId;

    @JsonProperty("total_paid_amount")
    private String totalPaidAmount;

    public TransactionDetails(){
        }

    public String getAcquirerReference() {
        return acquirerReference;
    }

    public void setAcquirerReference(String acquirerReference) {
        this.acquirerReference = acquirerReference;
    }

    public String getExternalResource_url() {
        return externalResource_url;
    }

    public void setExternalResource_url(String externalResource_url) {
        this.externalResource_url = externalResource_url;
    }

    public String getFinancialInstitution() {
        return financialInstitution;
    }

    public void setFinancialInstitution(String financialInstitution) {
        this.financialInstitution = financialInstitution;
    }

    public String getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(String installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public String getNet_receivedAmount() {
        return net_receivedAmount;
    }

    public void setNet_receivedAmount(String net_receivedAmount) {
        this.net_receivedAmount = net_receivedAmount;
    }

    public String getOverpaidAmount() {
        return overpaidAmount;
    }

    public void setOverpaidAmount(String overpaidAmount) {
        this.overpaidAmount = overpaidAmount;
    }

    public String getPayableDeferralPeriod() {
        return payableDeferralPeriod;
    }

    public void setPayableDeferralPeriod(String payableDeferralPeriod) {
        this.payableDeferralPeriod = payableDeferralPeriod;
    }

    public String getPaymentMethodReferenceId() {
        return paymentMethodReferenceId;
    }

    public void setPaymentMethodReferenceId(String paymentMethodReferenceId) {
        this.paymentMethodReferenceId = paymentMethodReferenceId;
    }

    public String getTotalPaidAmount() {
        return totalPaidAmount;
    }

    public void setTotalPaidAmount(String totalPaidAmount) {
        this.totalPaidAmount = totalPaidAmount;
    }
}
