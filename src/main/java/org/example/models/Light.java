package org.example.models;

public class Light extends Thing{

    public interface OnLightChangedListener {
        void onLightChanged(Light light);
    }

    protected boolean IsLightOn = false;
    private OnLightChangedListener lightChangedListener;

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
        if (state == State.UNREACHABLE) {
            return;
        }
        IsLightOn = lightOn;
        if (lightChangedListener != null) {
            lightChangedListener.onLightChanged(this);
        }
    }

    public void setLightChangedListener(OnLightChangedListener lightChangedListener) {
        this.lightChangedListener = lightChangedListener;
    }
}
