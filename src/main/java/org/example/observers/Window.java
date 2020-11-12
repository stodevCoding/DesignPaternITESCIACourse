package org.example.observers;

public class Window implements OnClickListener{
    private Button button;

    public Window() {
        button = new Button();
        button.setOnClickListener(this);
    }

    public void display() {
        button.press();
    }

    public static void main(String[] args) {
        Window w = new Window();
        w.display();
    }

    @Override
    public void onClick(Button button) {
        System.out.println("LISTENER FROM WINDOW");
    }
}
