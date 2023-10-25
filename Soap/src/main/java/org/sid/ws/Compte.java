package org.sid.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
@XmlRootElement(name="compte")
@XmlAccessorType(XmlAccessType.FIELD )
public class Compte {
    private int code;
    private double solde;
    @XmlTransient
    private Date dateCeation;

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public Compte(int code, double solde, Date dateCeation) {
        this.code = code;
        this.solde = solde;
        this.dateCeation = dateCeation;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCeation() {
        return dateCeation;
    }

    public void setDateCeation(Date dateCeation) {
        this.dateCeation = dateCeation;
    }
}
