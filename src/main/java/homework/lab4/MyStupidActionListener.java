package homework.lab4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyStupidActionListener implements ActionListener {

    private ColorFrame colorFrame;

    public MyStupidActionListener(ColorFrame colorFrame) {
        this.colorFrame = colorFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Im stupid!");
        colorFrame.getContentPane().setBackground(Color.RED);

    }
}