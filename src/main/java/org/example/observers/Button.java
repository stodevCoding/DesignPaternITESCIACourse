package org.example.observers;

public class Button {



    private OnClickListener onClickListener;

    public void press() {
        System.out.println("Button pressed!");
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
