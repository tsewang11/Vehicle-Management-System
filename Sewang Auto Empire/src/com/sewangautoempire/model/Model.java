/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sewangautoempire.model;

/**
 *
 * @author kargo
 */
public class Model {
    
    private String carID ;
    private String classID ;
    private String model ;
    private String bodyStyle;
    private String engineType;
    private String transmission;
    private int hp;
    private String driveSystem;
    private String color;
    private int price;
    private int makeYear;
    private int seater;

    public Model(int sn,String carID, String classID, String model,
            String bodyStyle, String engineType, String transmission, 
            int hp, String driveSystem, String color,int makeYear, 
            int seater, int price) {
        this.sn=sn;
        this.carID = carID;
        this.classID = classID;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.engineType = engineType;
        this.transmission = transmission;
        this.hp = hp;
        this.driveSystem = driveSystem;
        this.color = color;
        this.makeYear = makeYear;
        this.seater = seater;
        this.price = price;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getDriveSystem() {
        return driveSystem;
    }

    public void setDriveSystem(String driveSystem) {
        this.driveSystem = driveSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public int getSeater() {
        return seater;
    }

    public void setSeater(int seater) {
        this.seater = seater;
    }
    private int sn;

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

}
