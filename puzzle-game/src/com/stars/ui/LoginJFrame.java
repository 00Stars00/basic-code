package com.stars.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame() {
        // 初始化窗口
        initJFrame();
        // 初始化界面
        initView();
        // 设置窗口可见
        this.setVisible(true);
    }

    private void initView() {
        // 初始化用户名标签
        JLabel usernameLabel = new JLabel(new ImageIcon("puzzle-game/image/login/用户名.png"));
        usernameLabel.setBounds(116, 135, 47, 17);
        this.add(usernameLabel);
        // 初始化用户名输入框
        JTextField username = new JTextField();
        username.setBounds(195, 134, 200, 30);
        this.add(username);

        // 初始化密码标签
        JLabel passwordLabel = new JLabel(new ImageIcon("puzzle-game/image/login/密码.png"));
        passwordLabel.setBounds(130, 195, 32, 16);
        this.add(passwordLabel);
        // 初始化密码输入框
        JPasswordField password = new JPasswordField();
        password.setBounds(195, 195, 200, 30);
        this.add(password);

        // 初始化验证码标签
        JLabel codeLabel = new JLabel(new ImageIcon("puzzle-game/image/login/验证码.png"));
        codeLabel.setBounds(133, 256, 50, 30);
        this.add(codeLabel);
        // 初始化验证码输入框
        JTextField code = new JTextField();
        code.setBounds(195, 256, 100, 30);
        this.add(code);

        // 初始化登录按钮
        JButton login = new JButton(new ImageIcon("puzzle-game/image/login/登录按钮.png"));
        login.setBounds(123, 310, 128, 47);
        // 设置按钮透明
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        this.add(login);

        // 初始化注册按钮
        JButton register = new JButton(new ImageIcon("puzzle-game/image/login/注册按钮.png"));
        register.setBounds(256, 310, 128, 47);
        // 设置按钮透明
        register.setBorderPainted(false);
        register.setContentAreaFilled(false);
        this.add(register);

        // 初始化背景图片
        JLabel background = new JLabel(new ImageIcon("puzzle-game/image/login/background.png"));
        background.setBounds(0, 0, 470, 390);
        this.add(background);

    }

    /**
     * 初始化窗口
     */
    private void initJFrame() {
        // 设置窗口大小
        this.setSize(488,430);
        // 设置窗口标题
        this.setTitle("拼图游戏 登录界面");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置窗口居中
        this.setLocationRelativeTo(null);
        // 设置窗口关闭时退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口布局
        this.setLayout(null);
    }
}
