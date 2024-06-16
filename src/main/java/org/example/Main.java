package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int boardWidth = 500;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake Game");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game = new Game(boardWidth, boardHeight);
        frame.add(game);
        frame.pack();
        game.requestFocus();
    }
}