package com.restmercadopago.dto;

import java.math.BigDecimal;
import java.util.Date;

public class DebitosAutomaticosEnviosDTO {

    private Long daeId;
    private Long daeDatCuota;
    private BigDecimal daeImporte;
    private Long daeDaoId;
    private Long daeDadId;
    private Long daeIdPagoMP;
    private String daeReferencia;
    private String daePrjId;
    private String daeToken;
    private String daeNuevoToken;
    private String daeEmail;
    private String daeDatPeriodo;
    private String daeNroComprobante;
    private String daeNroPlan;
    private String daeUsuarioAlta;
    private String daeUsuarioUltMod;
    private String daeUsuarioBaja;
    private Date daeFechaADebitar;
    private Date daeFechaAlta;
    private Date daeFechaBaja;
    private Date daeFechaUltMod;
    private String daeCustomerId;
    private String externalReference;
    private String daeEstadoEnvio;
    private String daeErrorEnvio;
    private Long daeIdPagoMp;

    public DebitosAutomaticosEnviosDTO() {
    }

    public DebitosAutomaticosEnviosDTO(Long daeId) {
        this.daeId = daeId;
    }

    public Long getDaeId() {
        return daeId;
    }

    public void setDaeId(Long daeId) {
        this.daeId = daeId;
    }

    public Long getDaeDatCuota() {
        return daeDatCuota;
    }

    public void setDaeDatCuota(Long daeDatCuota) {
        this.daeDatCuota = daeDatCuota;
    }

    public BigDecimal getDaeImporte() {
        return daeImporte;
    }

    public void setDaeImporte(BigDecimal daeImporte) {
        this.daeImporte = daeImporte;
    }

    public Long getDaeDaoId() {
        return daeDaoId;
    }

    public void setDaeDaoId(Long daeDaoId) {
        this.daeDaoId = daeDaoId;
    }

    public Long getDaeDadId() {
        return daeDadId;
    }

    public void setDaeDadId(Long daeDadId) {
        this.daeDadId = daeDadId;
    }

    public Long getDaeIdPagoMP() {
        return daeIdPagoMP;
    }

    public void setDaeIdPagoMP(Long daeIdPagoMP) {
        this.daeIdPagoMP = daeIdPagoMP;
    }

    public String getDaeReferencia() {
        return daeReferencia;
    }

    public void setDaeReferencia(String daeReferencia) {
        this.daeReferencia = daeReferencia;
    }

    public String getDaePrjId() {
        return daePrjId;
    }

    public void setDaePrjId(String daePrjId) {
        this.daePrjId = daePrjId;
    }

    public String getDaeToken() {
        return daeToken;
    }

    public void setDaeToken(String daeToken) {
        this.daeToken = daeToken;
    }

    public String getDaeNuevoToken() {
        return daeNuevoToken;
    }

    public void setDaeNuevoToken(String daeNuevoToken) {
        this.daeNuevoToken = daeNuevoToken;
    }

    public String getDaeEmail() {
        return daeEmail;
    }

    public void setDaeEmail(String daeEmail) {
        this.daeEmail = daeEmail;
    }

    public String getDaeDatPeriodo() {
        return daeDatPeriodo;
    }

    public void setDaeDatPeriodo(String daeDatPeriodo) {
        this.daeDatPeriodo = daeDatPeriodo;
    }

    public String getDaeNroComprobante() {
        return daeNroComprobante;
    }

    public void setDaeNroComprobante(String daeNroComprobante) {
        this.daeNroComprobante = daeNroComprobante;
    }

    public String getDaeNroPlan() {
        return daeNroPlan;
    }

    public void setDaeNroPlan(String daeNroPlan) {
        this.daeNroPlan = daeNroPlan;
    }

    public String getDaeUsuarioAlta() {
        return daeUsuarioAlta;
    }

    public void setDaeUsuarioAlta(String daeUsuarioAlta) {
        this.daeUsuarioAlta = daeUsuarioAlta;
    }

    public String getDaeUsuarioUltMod() {
        return daeUsuarioUltMod;
    }

    public void setDaeUsuarioUltMod(String daeUsuarioUltMod) {
        this.daeUsuarioUltMod = daeUsuarioUltMod;
    }

    public String getDaeUsuarioBaja() {
        return daeUsuarioBaja;
    }

    public void setDaeUsuarioBaja(String daeUsuarioBaja) {
        this.daeUsuarioBaja = daeUsuarioBaja;
    }

    public Date getDaeFechaADebitar() {
        return daeFechaADebitar;
    }

    public void setDaeFechaADebitar(Date daeFechaADebitar) {
        this.daeFechaADebitar = daeFechaADebitar;
    }

    public Date getDaeFechaAlta() {
        return daeFechaAlta;
    }

    public void setDaeFechaAlta(Date daeFechaAlta) {
        this.daeFechaAlta = daeFechaAlta;
    }

    public Date getDaeFechaBaja() {
        return daeFechaBaja;
    }

    public void setDaeFechaBaja(Date daeFechaBaja) {
        this.daeFechaBaja = daeFechaBaja;
    }

    public Date getDaeFechaUltMod() {
        return daeFechaUltMod;
    }

    public void setDaeFechaUltMod(Date daeFechaUltMod) {
        this.daeFechaUltMod = daeFechaUltMod;
    }

    public String getDaeCustomerId() {
        return daeCustomerId;
    }

    public void setDaeCustomerId(String daeCustomerId) {
        this.daeCustomerId = daeCustomerId;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public String getDaeEstadoEnvio() {
        return daeEstadoEnvio;
    }

    public void setDaeEstadoEnvio(String daeEstadoEnvio) {
        this.daeEstadoEnvio = daeEstadoEnvio;
    }

    public String getDaeErrorEnvio() {
        return daeErrorEnvio;
    }

    public void setDaeErrorEnvio(String daeErrorEnvio) {
        this.daeErrorEnvio = daeErrorEnvio;
    }

    public Long getDaeIdPagoMp() {
        return daeIdPagoMp;
    }

    public void setDaeIdPagoMp(Long daeIdPagoMp) {
        this.daeIdPagoMp = daeIdPagoMp;
    }

    @Override
    public String toString() {
        return "DebitosAutomaticosEnviosDTO { " + "daeId=" + daeId + ", daeDatCuota=" +
                daeDatCuota + ", daeDaoId=" + daeDaoId + "," + " daeIdPagoMP='" + daeIdPagoMp + '\''
                + ", daeToken='" + daeToken + '\'' + ", daeDatPeriodo='" + daeDatPeriodo + '\'' + ", " +
                "" + "daeNroComprobante='" + daeNroComprobante + '\'' + ", daeNroPlan='" + daeNroPlan + '\''
                + ", daeFechaADebitar=" + daeFechaADebitar + "," + " daeCustomerId='" + daeCustomerId + '\'' +
                ", externalReference='" + externalReference + '\'' + ", daeEstadoEnvio='" + daeEstadoEnvio + '\'' + " }";
    }
}
