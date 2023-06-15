package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

//alien class is now dependent on laptop class
public class Alien {
     private int aid;
     private String aname;
     private String tech;
     @Autowired
     private Laptop laptop;

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getTech() {
        return tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show() {

        System.out.println("showing------");
        laptop.compile();
    }
}
