package com.restmercadopago.dto.mercadopago.infopago;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.restmercadopago.dto.mercadopago.infopago.payer.Payer;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MPResponseDTO {

    @JsonProperty("acquirer_reconciliation")
    private ArrayList<String> acquirerReconciliation;

    @JsonProperty("additional_info")
    private AdditionalInfo additionalInfo;

    @JsonProperty("authorization_code")
    private String authorizationCode;

    @JsonProperty("binary_mode")
    private String binaryMode;

    @JsonProperty("brand_id")
    private String brandId;

    @JsonProperty("call_for_authorize_id")
    private String callForAuthorizeId;

    @JsonProperty("captured")
    private String captured;

    @JsonProperty("card")
    private Card card;

    @JsonProperty("charges_details")
    private ArrayList<String> chargesDetails;

    @JsonProperty("collector_id")
    private String collectorId;

    @JsonProperty("corporation_id")
    private String corporationId;

    @JsonProperty("counter_currency")
    private String counterCurrency;

    @JsonProperty("coupon_amount")
    private String couponAmount;

    @JsonProperty("currency_id")
    private String currencyId;

    @JsonProperty("date_approved")
    private String dateApproved;

    @JsonProperty("date_created")
    private String dateCreated;

    @JsonProperty("date_last_updated")
    private String dateLastUpdated;

    @JsonProperty("date_of_expiration")
    private String dateOfExpiration;

    @JsonProperty("deduction_schema")
    private String deductionSchema;

    @JsonProperty("description")
    private String description;

    @JsonProperty("differentialPricingId")
    private String availableBalance;

    @JsonProperty("external_reference")
    private String externalReference;

    @JsonProperty("fee_details")
    private ArrayList<FeeDetails> feeDetails;

    @JsonProperty("id")
    private String id;

    @JsonProperty("installments")
    private String installments;

    @JsonProperty("integrator_id")
    private String integratorId;

    @JsonProperty("issuer_id")
    private String issuerId;

    @JsonProperty("live_mode")
    private String liveMode;

    @JsonProperty("marketplace_owner")
    private String marketplaceOwner;

    @JsonProperty("merchant_account_id")
    private String merchantAccountId;

    @JsonProperty("merchant_number")
    private String merchantNumber;

    @JsonProperty("metadata")
    private Metadata metadata;

    @JsonProperty("money_release_date")
    private String moneyReleaseDate;

    @JsonProperty("money_release_schema")
    private String moneyReleaseSchema;

    @JsonProperty("notification_url")
    private String notificationUrl;

    @JsonProperty("operation_type")
    private String operationType;

    @JsonProperty("order")
    private Order order;

    @JsonProperty("payer")
    private Payer payer;

    @JsonProperty("payment_method_id")
    private String paymentMethodId;

    @JsonProperty("payment_type_id")
    private String paymentTypeId;

    @JsonProperty("platform_id")
    private String platformId;

    @JsonProperty("pos_id")
    private String posId;

    @JsonProperty("processing_mode")
    private String processingMode;

    @JsonProperty("refunds")
    private ArrayList<String> refunds;

    @JsonProperty("shipping_amount")
    private String shippingAmount;

    @JsonProperty("sponsor_id")
    private String sponsorId;

    @JsonProperty("statement_descriptor")
    private String statementDescriptor;

    @JsonProperty("status")
    private String status;

    @JsonProperty("status_detail")
    private String statusDetail;

    @JsonProperty("store_id")
    private String storeId;

    @JsonProperty("taxes_amount")
    private String taxesAmount;

    @JsonProperty("transaction_amount")
    private String transactionAmount;

    @JsonProperty("transaction_amount_refunded")
    private String transactionAmountRefunded;

    @JsonProperty("transaction_details")
    private TransactionDetails transactionDetails;

    @JsonProperty("shipping_cost")
    private String shippingCost;

    public MPResponseDTO(){

    }

    public ArrayList<String> getAcquirerReconciliation() {
        return acquirerReconciliation;
    }

    public void setAcquirerReconciliation(ArrayList<String> acquirerReconciliation) {
        this.acquirerReconciliation = acquirerReconciliation;
    }

    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public String getBinaryMode() {
        return binaryMode;
    }

    public void setBinaryMode(String binaryMode) {
        this.binaryMode = binaryMode;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getCallForAuthorizeId() {
        return callForAuthorizeId;
    }

    public void setCallForAuthorizeId(String callForAuthorizeId) {
        this.callForAuthorizeId = callForAuthorizeId;
    }

    public String getCaptured() {
        return captured;
    }

    public void setCaptured(String captured) {
        this.captured = captured;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public ArrayList<String> getChargesDetails() {
        return chargesDetails;
    }

    public void setChargesDetails(ArrayList<String> chargesDetails) {
        this.chargesDetails = chargesDetails;
    }

    public String getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(String collectorId) {
        this.collectorId = collectorId;
    }

    public String getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(String corporationId) {
        this.corporationId = corporationId;
    }

    public String getCounterCurrency() {
        return counterCurrency;
    }

    public void setCounterCurrency(String counterCurrency) {
        this.counterCurrency = counterCurrency;
    }

    public String getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getDateApproved() {
        return dateApproved;
    }

    public void setDateApproved(String dateApproved) {
        this.dateApproved = dateApproved;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateLastUpdated() {
        return dateLastUpdated;
    }

    public void setDateLastUpdated(String dateLastUpdated) {
        this.dateLastUpdated = dateLastUpdated;
    }

    public String getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(String dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public String getDeductionSchema() {
        return deductionSchema;
    }

    public void setDeductionSchema(String deductionSchema) {
        this.deductionSchema = deductionSchema;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public ArrayList<FeeDetails> getFeeDetails() {
        return feeDetails;
    }

    public void setFeeDetails(ArrayList<FeeDetails> feeDetails) {
        this.feeDetails = feeDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstallments() {
        return installments;
    }

    public void setInstallments(String installments) {
        this.installments = installments;
    }

    public String getIntegratorId() {
        return integratorId;
    }

    public void setIntegratorId(String integratorId) {
        this.integratorId = integratorId;
    }

    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public String getLiveMode() {
        return liveMode;
    }

    public void setLiveMode(String liveMode) {
        this.liveMode = liveMode;
    }

    public String getMarketplaceOwner() {
        return marketplaceOwner;
    }

    public void setMarketplaceOwner(String marketplaceOwner) {
        this.marketplaceOwner = marketplaceOwner;
    }

    public String getMerchantAccountId() {
        return merchantAccountId;
    }

    public void setMerchantAccountId(String merchantAccountId) {
        this.merchantAccountId = merchantAccountId;
    }

    public String getMerchantNumber() {
        return merchantNumber;
    }

    public void setMerchantNumber(String merchantNumber) {
        this.merchantNumber = merchantNumber;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getMoneyReleaseDate() {
        return moneyReleaseDate;
    }

    public void setMoneyReleaseDate(String moneyReleaseDate) {
        this.moneyReleaseDate = moneyReleaseDate;
    }

    public String getMoneyReleaseSchema() {
        return moneyReleaseSchema;
    }

    public void setMoneyReleaseSchema(String moneyReleaseSchema) {
        this.moneyReleaseSchema = moneyReleaseSchema;
    }

    public String getNotificationUrl() {
        return notificationUrl;
    }

    public void setNotificationUrl(String notificationUrl) {
        this.notificationUrl = notificationUrl;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payer getPayer() {
        return payer;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public String getProcessingMode() {
        return processingMode;
    }

    public void setProcessingMode(String processingMode) {
        this.processingMode = processingMode;
    }

    public ArrayList<String> getRefunds() {
        return refunds;
    }

    public void setRefunds(ArrayList<String> refunds) {
        this.refunds = refunds;
    }

    public String getShippingAmount() {
        return shippingAmount;
    }

    public void setShippingAmount(String shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public String getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(String sponsorId) {
        this.sponsorId = sponsorId;
    }

    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getTaxesAmount() {
        return taxesAmount;
    }

    public void setTaxesAmount(String taxesAmount) {
        this.taxesAmount = taxesAmount;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionAmountRefunded() {
        return transactionAmountRefunded;
    }

    public void setTransactionAmountRefunded(String transactionAmountRefunded) {
        this.transactionAmountRefunded = transactionAmountRefunded;
    }

    public TransactionDetails getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public String getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(String shippingCost) {
        this.shippingCost = shippingCost;
    }


}