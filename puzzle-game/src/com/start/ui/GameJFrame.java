package com.start.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {
    // 数据
    int[][] data = new int[4][4];
    // 空白块的位置
    int x = 0;
    int y = 0;

    public GameJFrame() {
        // 初始化窗口
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 初始化数据
        initData();

        // 初始化图片
        initImage();

        // 设置窗口可见
        this.setVisible(true);
    }

    /**
     * 初始化数据
     */
    private void initData() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            } else {
                data[i / 4][i % 4] = arr[i];
            }
        }
    }

    /**
     * 初始化图片
     */
    private void initImage() {
        // 清空窗口
        this.getContentPane().removeAll();
        // 外循环---行
        for (int i = 0; i < 4; i++) {
            // 内循环---列
            for (int j = 0; j < 4; j++) {
                // 初始化标签
                int number = data[i][j];
                JLabel jLabel = new JLabel(new ImageIcon("puzzle-game/image/animal/animal8/" + number + ".jpg"));
                // 设置标签位置
                jLabel.setBounds(j * 105 + 84, i * 105 + 134, 105, 105);
                // 添加图片边框
                jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
                // 添加标签
                this.add(jLabel);
            }
        }
        // 初始化背景图片
        JLabel background = new JLabel(new ImageIcon("puzzle-game/image/background.png"));
        // 设置背景图片位置
        background.setBounds(40, 40, 508, 560);
        // 添加背景图片
        this.add(background);
        // 重新绘制窗口
        this.repaint();
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
        this.setSize(603, 680);

        // 设置窗口标题
        this.setTitle("拼图游戏单机版 V1.0");

        // 设置界面置顶
        this.setAlwaysOnTop(true);

        // 设置窗口居中
        this.setLocationRelativeTo(null);

        // 设置窗口关闭时退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 设置窗口布局
        this.setLayout(null);

        // 添加键盘监听
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // 获取按键
        int keyCode = e.getKeyCode();
        // 判断按键
        switch (keyCode) {
            case KeyEvent.VK_UP -> {
                // 上
                System.out.println("上");
                if (x > 0) {
                    data[x][y] = data[x - 1][y];
                    data[x - 1][y] = 0;
                    x--;
                    initImage();
                }
            }
            case KeyEvent.VK_DOWN -> {
                // 下
                System.out.println("下");
                if (x < 3) {
                    data[x][y] = data[x + 1][y];
                    data[x + 1][y] = 0;
                    x++;
                    initImage();
                }
            }
            case KeyEvent.VK_LEFT -> {
                // 左
                System.out.println("左");
                if (y > 0) {
                    data[x][y] = data[x][y - 1];
                    data[x][y - 1] = 0;
                    y--;
                    initImage();
                }
            }
            case KeyEvent.VK_RIGHT -> {
                // 右
                System.out.println("右");
                if (y < 3) {
                    data[x][y] = data[x][y + 1];
                    data[x][y + 1] = 0;
                    y++;
                    initImage();
                }
            }
        }
    }
}
