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
                drawUp(g, x, y);
                break;
            case RIGHT:
                drawRight();
                break;
            case DOWN:
                drawDown();
                break;
            case LEFT:
                drawLeft();
                break;
        }
    }

    private static void drawUp(Graphics g, int x, int y) {
        g.fill3DRect(x - 20, y - 30, 10, 60, false);
        g.fill3DRect(x - 10, y - 20, 20, 40, false);
        g.fill3DRect(x + 10, y - 30, 10, 60, false);
        if (g.getColor() == Color.RED) {
            g.setColor(Color.YELLOW);
        } else {
            g.setColor(Color.RED);
        }
        g.fillOval(x - 10, y - 10, 20, 20);
        g.drawLine(x, y, x, y - 30);
    }

    private static void drawRight() {

    }

    private static void drawDown() {
    }

    private static void drawLeft() {
    }

}
