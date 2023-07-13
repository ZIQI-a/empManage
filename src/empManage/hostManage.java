package empManage;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class hostManage extends JFrame {
    SaveEmp allEmp = new SaveEmp();

//    构造函数
    public hostManage() {

        initManage();

        initMenuBar();

        initButtom();

        this.setVisible(true);
    }

    private void initButtom() {
        JLabel jl = new JLabel();

        JButton addEmp = new JButton("添加职工");
        addEmp.setBounds(550,50, 200,50);
        JButton delEmp = new JButton("删除职工");
        delEmp.setBounds(550,130, 200,50);
        JButton disEmp = new JButton("查看所有职工");
        disEmp.setBounds(550,210, 200,50);

        jl.add(delEmp);
        jl.add(addEmp);
        jl.add(disEmp);

//        添加按钮事件
        addEmp.addActionListener(new MyAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击添加职工");
                new addEmp();
            }
        });
        delEmp.addActionListener(new MyAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击删除职工");
                new delEMP();
            }
        });
        delEmp.addActionListener(new MyAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击删除职工");
            }
        });
        disEmp.addActionListener(new MyAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击查看职工");
                repaint();
                new EmpTable();
            }
        });

        this.getContentPane().add(jl);
    }

    private void initMenuBar() {
        //创建一个菜单对象
        JMenuBar jMenuBar = new JMenuBar();
//设置菜单的宽高
        jMenuBar.setSize(680, 40);
//创建一个选项
        JMenu jMenu1 = new JMenu("功能");
//创建一个条目
        JMenuItem relogin = new JMenuItem("重新登录");
        JMenuItem exit = new JMenuItem("退出登录");

//把条目添加到选项当中
        jMenu1.add(relogin);
        jMenu1.add(exit);
//把选项添加到菜单当中
        jMenuBar.add(jMenu1);

//把菜单添加到最外层的窗体当中
        this.setJMenuBar(jMenuBar);
    }

    private void initManage() {
        System.out.println("这是管理主界面");
//        JFrame jFrame = new JFrame();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(3);

        this.setTitle("职工便利系统");
    }

}
