package com.stars.ui;

import com.stars.domain.User;
import com.stars.util.CodeUtil;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class LoginJFrame extends JFrame implements MouseListener {
    static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User("张三", "123456"));
        users.add(new User("李四", "123456"));
    }


    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JLabel rightCode = new JLabel();
    JTextField code = new JTextField();
    JButton login = new JButton(new ImageIcon("puzzle-game/image/login/登录按钮.png"));
    JButton register = new JButton(new ImageIcon("puzzle-game/image/login/注册按钮.png"));
    // 验证码
    String codeStr;

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
        username.setBounds(195, 134, 200, 30);
        this.add(username);

        // 初始化密码标签
        JLabel passwordLabel = new JLabel(new ImageIcon("puzzle-game/image/login/密码.png"));
        passwordLabel.setBounds(130, 195, 32, 16);
        this.add(passwordLabel);
        // 初始化密码输入框
        password.setBounds(195, 195, 200, 30);
        this.add(password);

        // 初始化验证码标签
        JLabel codeLabel = new JLabel(new ImageIcon("puzzle-game/image/login/验证码.png"));
        codeLabel.setBounds(133, 256, 50, 30);
        this.add(codeLabel);
        // 初始化验证码输入框
        code.setBounds(195, 256, 100, 30);
        this.add(code);

        // 设置验证码标签的文本
        codeStr = CodeUtil.getCode();
        rightCode.setText(codeStr);
        rightCode.setBounds(300, 256, 50, 30);
        rightCode.addMouseListener(this);
        this.add(rightCode);

        // 初始化登录按钮
        login.setBounds(123, 310, 128, 47);
        // 设置按钮透明
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.addMouseListener(this);
        this.add(login);

        // 初始化注册按钮
        register.setBounds(256, 310, 128, 47);
        // 设置按钮透明
        register.setBorderPainted(false);
        register.setContentAreaFilled(false);
        register.addMouseListener(this);
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
        this.setSize(488, 430);
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
    public void showJDialog(String content) {
        JOptionPane.showMessageDialog(this, content, "错误", JOptionPane.INFORMATION_MESSAGE);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if (source == rightCode) {
            // 设置验证码标签的文本
            codeStr = CodeUtil.getCode();
            rightCode.setText(codeStr);
            System.out.println("点击验证码");
        } else if (source == login) {
            System.out.println("点击登录");
            // 获取用户名和密码
            String usernameInput = username.getText();
            String passwordInput = String.valueOf(password.getPassword());
            // 获取验证码
            String codeInput = code.getText();
            // 封装成User对象
            User userInfo = new User(usernameInput, passwordInput);
            System.out.println("username: = " + usernameInput);
            System.out.println("password: = " + passwordInput);

            // 判断用户名和密码是否为空
            if (codeInput.length() == 0) {
                showJDialog("验证码不能为空");
            } else if (usernameInput.length() == 0 || passwordInput.length() == 0) {
                showJDialog("用户名或密码不能为空");
            } else if (!codeInput.equalsIgnoreCase(rightCode.getText())) {
                showJDialog("验证码错误");
            } else if (contains(userInfo)) {
                // 跳转到游戏界面
                this.dispose();
                new GameJFrame();
            } else {
                // 登录失败
                showJDialog("用户名或密码错误");
            }
        } else if (source == register) {
            System.out.println("点击注册");
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            login.setIcon(new ImageIcon("puzzle-game/image/login/登录按下.png"));
        } else if (source == register) {
            register.setIcon(new ImageIcon("puzzle-game/image/login/注册按下.png"));
        }
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            login.setIcon(new ImageIcon("puzzle-game/image/login/登录按钮.png"));
        } else if (source == register) {
            register.setIcon(new ImageIcon("puzzle-game/image/login/注册按钮.png"));
        }
    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mouseExited(MouseEvent e) {

    }
    private boolean contains(User userInput) {
        for (User rightUser : users) {
            if (rightUser.getUsername().equals(userInput.getUsername()) && rightUser.getPassword().equals(userInput.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
