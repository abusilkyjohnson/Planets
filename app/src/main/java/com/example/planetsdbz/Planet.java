package com.example.planetsdbz;

//(used to hold data)Model Class: acting as a model/template for our list view
public class Planet {

    //Attributes
    private String planetName;
    private String Gravity;

    private int planetImg;

    //Constructor
    public Planet(String planetName, String gravity, int planetImg) {
        this.planetName = planetName;
        Gravity = gravity;
        this.planetImg = planetImg;
    }

    //Getter & Setter

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getGravity() {
        return Gravity;
    }

    public void setGravity(String gravity) {
        Gravity = gravity;
    }

    public int getPlanetImg() {
        return planetImg;
    }

    public void setPlanetImg(int planetImg) {
        this.planetImg = planetImg;
    }
}
