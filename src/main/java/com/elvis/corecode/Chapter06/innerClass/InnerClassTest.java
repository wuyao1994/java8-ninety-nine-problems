package com.elvis.corecode.Chapter06.innerClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;

public class InnerClassTest {

    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

}
class TalkingClock {
    private int interval;
    private boolean beep;
    public TalkingClock(int pInterval, boolean pBeep) {
        interval = pInterval;
        beep = pBeep;
    }
    
    public void start() {
        ActionListener listener = new TimePrinter();
        javax.swing.Timer t = new javax.swing.Timer(interval, listener);
        t.start();
    }
    
    public class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Date now = new Date();
            System.out.println("At the tone, the time is " + now);
            if (beep) {
                java.awt.Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}