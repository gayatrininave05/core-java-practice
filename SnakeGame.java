package SnakeGame;

import javax.swing.*;

public class SnakeGame extends JFrame {

    SnakeGame() {
        setTitle("Snake Game");
        setSize(500, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SnakeGame();
    }
}
