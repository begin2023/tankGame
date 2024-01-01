package com.wy.tank.graphic;

import javax.swing.*;
import java.awt.*;

public class TankPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10, 10, 100, 100);
    }
}
