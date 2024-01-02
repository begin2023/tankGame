package com.wy.tank.layout;

import javax.swing.*;
import java.awt.*;

public class TankFrame extends JFrame {

    public TankFrame() throws HeadlessException {
        TankPanel panel = new TankPanel();
        this.setSize(1200, 900);
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
