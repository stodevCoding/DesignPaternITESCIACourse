package org.example;

import org.example.models.Light;
import org.example.models.Thing;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HomeSystem implements Light.OnLightChangedListener {

    public enum State {
        ON,
        OFF,
    }

    private final List<Thing> things;
    private State state;
    private final SystemLogger logger;


    public HomeSystem(SystemLogger logger) {
        System.out.println("CONSTRUCTOR HOMESYSTEM");
        this.logger = logger;
        this.things = new ArrayList<>();
        this.state = State.ON;
    }

    @Override
    public void onLightChanged(Light light) {
        String message = "HomeSystem - Light " + light.getName() + " updated. light on = " + light.isLightOn();
        logger.addLog(message);
    }

    public boolean addThing(Thing thing) {
        return things.add(thing);
    }

    public List<Thing> getThings() {
        return things;
    }

    public void toggleAllLights(boolean IsLightOn) {
        if (state == State.OFF) {
            return;
        }
        for (Light l : getLights()) {
            l.setLightOn(IsLightOn);

        }
    }

    public List<Light> getLights() {
        List<Light> list = new ArrayList<>();
        for (Thing t : things) {
            if (t instanceof Light) {
                list.add((Light)t);
            }
        }
        return list;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
