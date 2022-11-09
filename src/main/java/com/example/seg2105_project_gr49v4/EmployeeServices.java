package com.example.seg2105_project_gr49v4;

public class EmployeeServices {

    private String serviceName;
    private Boolean offer;
    public EmployeeServices(){}

    public EmployeeServices(String serviceName, Boolean offer) {
        this.serviceName = serviceName;
        this.offer = offer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Boolean getOffer() {
        return offer;
    }

    public void setOffer(Boolean offer) {
        this.offer = offer;
    }

}
