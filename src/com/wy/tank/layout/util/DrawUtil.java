package com.wy.tank.layout.util;

import com.wy.tank.enums.Direction;
import com.wy.tank.enums.TankType;

import java.awt.*;

public class DrawUtil {
    public static void drawTank(Graphics g, int x, int y, TankType type, Direction direct) {
        switch (type) {
            case HERO:
                g.setColor(Color.RED);
                break;
            case ENEMY:
                g.setColor(Color.YELLOW);
                break;
        }
        switch (direct) {
            case UP:
            case DOWN:
                drawUpOrDown(g, x, y, direct);
                break;
            case RIGHT:
            case LEFT:
                drawRightOrLeft(g, x, y, direct);
                break;
        }
    }

    private static void drawUpOrDown(Graphics g, int x, int y, Direction direct) {
        g.fill3DRect(x - 20, y - 30, 10, 60, false);
        g.fill3DRect(x - 10, y - 20, 20, 40, false);
        g.fill3DRect(x + 10, y - 30, 10, 60, false);
        if (g.getColor() == Color.RED) {
            g.setColor(Color.YELLOW);
        } else {
            g.setColor(Color.RED);
        }
        g.fillOval(x - 10, y - 10, 20, 20);
        if (direct == Direction.UP) {
            g.drawLine(x, y, x, y - 30);

        } else {
            g.drawLine(x, y, x, y + 30);
        }
    }

    private static void drawRightOrLeft(Graphics g, int x, int y, Direction direct) {
        g.fill3DRect(x - 30, y - 20, 60, 10, false);
        g.fill3DRect(x - 20, y - 10, 40, 20, false);
        g.fill3DRect(x - 30, y + 10, 60, 10, false);
        if (g.getColor() == Color.RED) {
            g.setColor(Color.YELLOW);
        } else {
            g.setColor(Color.RED);
        }
        g.fillOval(x - 10, y - 10, 20, 20);
        if (direct == Direction.RIGHT) {
            g.drawLine(x, y, x + 30, y);
        } else {
            g.drawLine(x, y, x - 30, y);
        }
    }
}
