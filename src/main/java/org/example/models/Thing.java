package org.example.models;

public abstract class Thing {
    public enum State {
        REACHABLE,
        UNREACHABLE,
    }
    protected String sName = "";
    protected State state = State.REACHABLE;

    public abstract String getTypeName();
    public abstract String getDescription();

    public String getName() {
        return sName;
    }

    public void setName(String sName) {
        this.sName = sName;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
