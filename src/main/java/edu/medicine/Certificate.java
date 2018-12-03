package edu.medicine;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement(name = "certificate")
public class Certificate {

    private String id;
    private Date startDate;
    private Date endDate;
    private String organization;

    public Certificate(){}

    public Certificate(String id, Date startDate, Date endDate, String organization) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.organization = organization;
    }

    public String getId() {
        return id;
    }

    @XmlAttribute
    public void setId(String id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    @XmlAttribute(name="start-date")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    @XmlAttribute(name="end-date")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getOrganization() {
        return organization;
    }

    @XmlAttribute
    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
