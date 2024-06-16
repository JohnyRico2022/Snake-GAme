package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class Game extends JPanel implements ActionListener, KeyListener {

    private class Tile {
        int x;
        int y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int boardWidth;
    int boardHeight;
    int tileSize = 25;
    Tile snakeHead;
    ArrayList<Tile> snakeBody;
    Tile food;
    Tile superFood;
    Random random;
    int velocityX;
    int velocityY;
    Timer timer;
    boolean inGAme = false;
    boolean paused = false;

    public Game(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;

        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.black);
        addKeyListener(this);
        setFocusable(true);
    }


    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        draw(graphics);
    }

    private void draw(Graphics graphics) {

        for (int i = 0; i < boardWidth / tileSize; i++) {
            graphics.drawLine(i * tileSize, 0, i * tileSize, boardHeight); //vertical lines
            graphics.drawLine(0, i * tileSize, boardWidth, i * tileSize);  //horizontal lines
        }


        graphics.setFont(new Font("Arial", Font.PLAIN, 16));
        graphics.setColor(Color.red);
        graphics.drawString("Score: 25", tileSize - 16, tileSize);

        graphics.setColor(Color.orange);
        graphics.drawString("Hige Score: 32", tileSize - 16, tileSize * 2);


        /*if (paused) {
            graphics.setFont(new Font("Arial", Font.PLAIN, 30));
            graphics.setColor(Color.blue);
            graphics.drawString("PAUSE", boardHeight / 2 - tileSize * 2, boardWidth / 2);
        } else {
            graphics.setFont(new Font("Arial", Font.PLAIN, 30));
            graphics.setColor(Color.blue);
            graphics.drawString("", boardHeight / 2 - tileSize * 2, boardWidth / 2);
        }*/


    }


    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("key left");
        }
        if (key == KeyEvent.VK_RIGHT) {
            System.out.println("key right");
        }
        if (key == KeyEvent.VK_UP) {
            System.out.println("key up");
        }
        if (key == KeyEvent.VK_DOWN) {
            System.out.println("key down");
        }
        if (key == KeyEvent.VK_SPACE) {
            System.out.println("key space");
            paused = !paused;
            System.out.println("" + paused);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
