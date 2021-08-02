package com.example.vo;

public class School {
    private String scname;
    private String scaddress;

    public String getScname() {
        return scname;
    }

    public void setScname(String scname) {
        this.scname = scname;
    }

    public String getScaddress() {
        return scaddress;
    }

    public void setScaddress(String scaddress) {
        this.scaddress = scaddress;
    }

    @Override
    public String toString() {
        return "School{" +
                "scname='" + scname + '\'' +
                ", scaddress='" + scaddress + '\'' +
                '}';
    }
}
