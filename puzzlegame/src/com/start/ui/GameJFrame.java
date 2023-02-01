package com.start.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        // 初始化窗口
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 设置窗口可见
        this.setVisible(true);
    }

    /**
     * 初始化菜单栏
     */
    private void initJMenuBar() {
        // 初始化菜单栏
        JMenuBar jMenuBar = new JMenuBar();

        // 初始化菜单
        JMenu functionMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于");

        // 初始化菜单项
        JMenuItem replayItem = new JMenuItem("重新开始");
        JMenuItem reLoginItem = new JMenuItem("重新登陆");
        JMenuItem exitItem = new JMenuItem("退出");

        JMenuItem aboutItem = new JMenuItem("关于");

        // 添加菜单项
        functionMenu.add(replayItem);
        functionMenu.add(reLoginItem);
        functionMenu.add(exitItem);

        aboutMenu.add(aboutItem);

        // 添加菜单
        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutMenu);

        // 添加菜单栏
        this.setJMenuBar(jMenuBar);

    }

    /**
     * 初始化窗口
     */
    private void initJFrame() {
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
    }
}
