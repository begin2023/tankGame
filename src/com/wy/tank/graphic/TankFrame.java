package com.wy.tank.graphic;

import javax.swing.*;
import java.awt.*;

public class TankFrame extends JFrame {
    private TankPanel panel = null;

    public TankFrame() throws HeadlessException {
        panel = new TankPanel();
        this.setSize(400, 300);
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
