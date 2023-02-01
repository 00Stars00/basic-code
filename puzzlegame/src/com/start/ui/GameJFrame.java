package com.start.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {

        // 设置窗口大小
        this.setSize(603,680);

        // 设置窗口标题
        this.setTitle("拼图游戏单机版 V1.0");

        // 设置界面置顶
        this.setAlwaysOnTop(true);

        // 设置窗口居中
        this.setLocationRelativeTo(null);

        // 设置窗口关闭时退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 设置窗口可见
        this.setVisible(true);
    }
}
