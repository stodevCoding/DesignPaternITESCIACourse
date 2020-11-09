package org.example.models;

public class Light extends Thing{


    protected boolean IsLightOn = false;

    @Override
    public String getTypeName() {
        return "Light";
    }

    @Override
    public String getDescription() {
        return "Light is on = " + IsLightOn;
    }

    public boolean isLightOn() {
        return IsLightOn;
    }

    public void setLightOn(boolean lightOn) {
        IsLightOn = lightOn;
    }
}
