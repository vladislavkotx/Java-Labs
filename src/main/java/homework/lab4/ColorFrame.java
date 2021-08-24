package homework.lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class ColorFrame extends JFrame {
    private AtomicInteger counter;

    public ColorFrame(AtomicInteger counter) throws HeadlessException {
        this.counter=counter;
        setSize(500,500);
        JButton button = new JButton("click me to be red");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(ColorFrame.this.counter.addAndGet(1));
            }
        });
        
        getContentPane().add(button, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorFrame(new AtomicInteger(10));
    }
}
