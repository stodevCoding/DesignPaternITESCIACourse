package org.example.models;

public abstract class Thing {
    public enum State {
        REACHABLE,
        UNREACHABLE,
    }
    protected String sName = "";
    protected State eState = State.REACHABLE;

    public abstract String getTypeName();
    public abstract String getDescription();

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public State geteState() {
        return eState;
    }

    public void seteState(State eState) {
        this.eState = eState;
    }
}
