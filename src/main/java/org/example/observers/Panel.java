package org.example.observers;

public class Panel implements OnClickListener{
    private Button button;

    public Panel() {
        button = new Button();
        button.setOnClickListener(this);
    }

    public void display() {
        button.press();

    }

    public static void main(String[] args) {
        Panel p = new Panel();
        p.display();
    }

    @Override
    public void onClick(Button button) {
        System.out.println("LISTENER FROM PANEL");
    }
}
