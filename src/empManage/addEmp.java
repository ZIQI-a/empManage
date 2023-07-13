package empManage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class addEmp extends JFrame {
    SaveEmp allEmp = new SaveEmp();
    public addEmp() {
        setSize(400,300);
//        存放内容的组件
        JPanel panel = new JPanel();

        JLabel idLabel = new JLabel("请输入ID：");
        JTextField id = new JTextField(20);
        JLabel nameLabel = new JLabel("请输入姓名：");
        JTextField name = new JTextField(20);
        JLabel ageLabel = new JLabel("请输入年龄：");
        JTextField age = new JTextField(20);
        JLabel levelLabel = new JLabel("请输入职位：");
        JTextField level = new JTextField(20);

        JButton button = new JButton("确定");
        JFrame j = this;

//        添加内容到panel里面
        panel.add(idLabel);
        panel.add(id);
        panel.add(nameLabel);
        panel.add(name);
        panel.add(ageLabel);
        panel.add(age);
        panel.add(levelLabel);
        panel.add(level);
        panel.add(button);
        this.getContentPane().add(panel);
//按钮监听事件，将输入的数据存放
        button.addActionListener(new MyAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取用户输入的数组对象的数据
                String qid = id.getText();
                String qname = name.getText();
                int qage = Integer.parseInt(age.getText());
                String qlevel = level.getText();

                // 新建一个数组对象，并将其添加到 ArrayList 数组对象中
//                ArrayList<AllEmployeeq> list = new ArrayList<>();
//                list.add(new Object(data));
                allEmp.addList(qid, qname,qage, qlevel);
                // 添加成功提示
                JOptionPane.showMessageDialog(j, "添加成功！");

                // 清空用户输入的数据
                id.setText("");
                name.setText("");
                age.setText("");
                level.setText("");
            }
        });

        setVisible(true);
    }
}
