package edu.medicine;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "package")
public class Package {

    private String type;
    private int count;
    private int price;

    public Package(){}

    public Package(String type, int count, int price) {
        this.type = type;
        this.count = count;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    @XmlAttribute
    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    @XmlAttribute
    public void setPrice(int price) {
        this.price = price;
    }
}
