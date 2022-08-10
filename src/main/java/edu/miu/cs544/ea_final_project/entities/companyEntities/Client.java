package edu.miu.cs544.ea_final_project.entities.companyEntities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Client extends Company {
    private String mission;
    private String reason;
    private String website;

    @OneToOne(mappedBy = "client")
    private Offer offer;

    public Client() {

    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public Client(String name, String mission, String reason, String website) {
        super(name);
        this.mission = mission;
        this.reason = reason;
        this.website = website;
    }

    public Client(String mission, String reason, String website, Offer offer) {
        this.mission = mission;
        this.reason = reason;
        this.website = website;
        this.offer = offer;
    }

    @Override
    public String toString() {
        return "Client{" +
                "mission='" + mission + '\'' +
                ", reason='" + reason + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
