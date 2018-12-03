package edu.medicine;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "dosage")
public class Dosage {

    private int oneDose;
    private int dayDose;

    public Dosage(){}

    public Dosage(int oneDose, int dayDose) {
        this.oneDose = oneDose;
        this.dayDose = dayDose;
    }

    public int getOneDose() {
        return oneDose;
    }

    @XmlAttribute(name="one-dose")
    public void setOneDose(int oneDose) {
        this.oneDose = oneDose;
    }

    public int getDayDose() {
        return dayDose;
    }

    @XmlAttribute(name="day-dose")
    public void setDayDose(int dayDose) {
        this.dayDose = dayDose;
    }
}
