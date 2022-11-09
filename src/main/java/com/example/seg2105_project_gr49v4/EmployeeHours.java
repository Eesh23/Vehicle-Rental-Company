package com.example.seg2105_project_gr49v4;

public class EmployeeHours {

    private String open;
    private String close;
    public EmployeeHours(){}

    public EmployeeHours(String open, String close) {
        this.open = open;
        this.close = close;
    }

    public String getOpen() {
        return open;
    }

    public String getClose() {
        return close;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public void setClose(String close) {
        this.close = close;
    }

}
