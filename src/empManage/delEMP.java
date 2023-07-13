package empManage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class delEMP extends JFrame {

    SaveEmp allEmp = new SaveEmp();

    public delEMP() {
        setSize(400,300);
//        存放内容的组件
        JPanel panel = new JPanel();

        JLabel idLabel = new JLabel("请输入需要删除的ID：");
        JTextField id = new JTextField(20);

        JButton button = new JButton("确定");
        JFrame j = this;

        panel.add(idLabel);
        panel.add(id);
        panel.add(button);
        this.getContentPane().add(panel);
        this.repaint();

        int index = getIndex(allEmp.list, id.getText());

        //按钮监听事件，将输入的数据存放
        button.addActionListener(new MyAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allEmp.getList().remove(index);
                // 添加成功提示
                JOptionPane.showMessageDialog(j, "添加成功！");
                id.setText("");
            }
        });
        setVisible(true);
    }

    public static int getIndex(ArrayList<AllEmployee> list, String id) {
        //遍历集合得到每一个元素
        for (int i = 0; i < list.size(); i++) {
            AllEmployee u = list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                return i;
            }
        }
        //因为只有当集合里面所有的元素都比较完了，才能断定id是不存在的。
        return -1;
    }
}
