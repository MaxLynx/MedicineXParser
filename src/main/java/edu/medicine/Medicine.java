package edu.medicine;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "medicine")
@XmlType(propOrder = {"name","pharm","group", "analogs", "versions"})
public class Medicine {
    private String name;
    private String pharm;
    private Group group;
    private String[] analogs;
    private Version[] versions;

    public Medicine(){}

    public Medicine(String name, String pharm, Group group, String[] analogs, Version[] versions) {
        this.name = name;
        this.pharm = pharm;
        this.group = group;
        this.analogs = analogs;
        this.versions = versions;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getPharm() {
        return pharm;
    }

    @XmlElement
    public void setPharm(String pharm) {
        this.pharm = pharm;
    }

    public Group getGroup() {
        return group;
    }

    @XmlElement
    public void setGroup(Group group) {
        this.group = group;
    }

    public String[] getAnalogs() {
        return analogs;
    }

    @XmlElement(name = "analog")
    @XmlElementWrapper
    public void setAnalogs(String[] analogs) {
        this.analogs = analogs;
    }

    public Version[] getVersions() {
        return versions;
    }

    @XmlElement(name = "version")
    @XmlElementWrapper
    public void setVersions(Version[] versions) {
        this.versions = versions;
    }
}
