package edu.medicine;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "manufacturer")
@XmlType(propOrder = {"certificate", "dosage", "pack"})
public class Manufacturer {

    private Certificate certificate;
    private Dosage dosage;
    private Package pack;

    public Manufacturer(){}

    public Manufacturer(Certificate certificate, Dosage dosage, Package pack) {
        this.certificate = certificate;
        this.dosage = dosage;
        this.pack = pack;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    @XmlElement
    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Dosage getDosage() {
        return dosage;
    }

    @XmlElement
    public void setDosage(Dosage dosage) {
        this.dosage = dosage;
    }

    public Package getPack() {
        return pack;
    }

    @XmlElement(name="package")
    public void setPack(Package pack) {
        this.pack = pack;
    }
}

