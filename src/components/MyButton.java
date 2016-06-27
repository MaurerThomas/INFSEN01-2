package components;


import factory.Component;
import javax.swing.*;


public class MyButton implements Component {

    public MyButton(String title){
        drawComponent(title);
    }

    @Override
    public JButton drawComponent(String title) {

        JButton button = new JButton(title);
        button.addActionListener(e -> {
            // En nu?

        });
        return button;
    }
}
