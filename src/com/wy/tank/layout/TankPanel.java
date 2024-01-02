package com.wy.tank.layout;

import com.wy.tank.element.Hero;
import com.wy.tank.enums.Direction;
import com.wy.tank.enums.TankType;
import com.wy.tank.layout.util.DrawUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TankPanel extends JPanel implements KeyListener {
    private Hero hero;

    private int step = 5;

    public TankPanel() {
        hero = new Hero(100, 100, Direction.UP);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1200, 900);
        DrawUtil.drawTank(g, hero.getX(), hero.getY(), TankType.HERO, hero.getDirection());
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()) {
            case KeyEvent.VK_W:
                this.hero.setY(hero.getY() - step);
                this.hero.setDirection(Direction.UP);
                break;
            case KeyEvent.VK_S:
                this.hero.setY(hero.getY() + step);
                this.hero.setDirection(Direction.DOWN);
                break;
            case KeyEvent.VK_A:
                this.hero.setX(this.hero.getX() - step);
                this.hero.setDirection(Direction.LEFT);
                break;
            case KeyEvent.VK_D:
                this.hero.setX(this.hero.getX() + step);
                this.hero.setDirection(Direction.RIGHT);
                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
