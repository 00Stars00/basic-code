package com.stars.test;

import javax.swing.*;

public class Test3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("事件演示");
        jFrame.setSize(603, 680);
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        JButton button = new JButton("点我啊");
        button.setBounds(100, 100, 100, 100);
        button.addActionListener(e -> {
            System.out.println("你点了我");
        });
        jFrame.add(button);

        jFrame.setVisible(true);

    }
}
