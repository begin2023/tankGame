package com.wy.tank.layout;

import com.wy.tank.element.Hero;
import com.wy.tank.enums.Direction;
import com.wy.tank.enums.TankType;
import com.wy.tank.layout.util.DrawUtil;

import javax.swing.*;
import java.awt.*;

public class TankPanel extends JPanel {
    Hero hero;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1200, 900);
        DrawUtil.drawTank(g, 100, 100, TankType.HERO, Direction.UP);
        DrawUtil.drawTank(g, 200, 100, TankType.ENEMY, Direction.UP);
    }
}
