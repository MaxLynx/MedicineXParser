package edu.medicine;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "version")
@XmlType(propOrder = {"name","manufacturers"})
public class Version {
    private String name;
    private Manufacturer[] manufacturers;

    public Version(){}

    public Version(String name, Manufacturer[] manufacturers) {
        this.name = name;
        this.manufacturers = manufacturers;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public Manufacturer[] getManufacturers() {
        return manufacturers;
    }

    @XmlElement(name = "manufacturer")
    @XmlElementWrapper
    public void setManufacturers(Manufacturer[] manufacturers) {
        this.manufacturers = manufacturers;
    }
}
