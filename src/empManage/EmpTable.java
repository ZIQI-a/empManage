package empManage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class EmpTable extends JFrame {
    private JTable table;
    private JScrollPane scrollPane;
    private ArrayList<AllEmployee> arrayList;
    SaveEmp allEmp = new SaveEmp();

    public EmpTable() {
        this.repaint();
        this.arrayList = allEmp.list;
        String[] columnNames = {"ID", "Name", "Age", "Level"};
        Object[][] rowData = new Object[arrayList.size()][4];
        // 将 arraylist 中的对象的各个属性填充到 rowData 中。
        for (int i = 0; i < arrayList.size(); i++) {
            rowData[i][0] = arrayList.get(i).getId();
            rowData[i][1] = arrayList.get(i).getName();
            rowData[i][2] = arrayList.get(i).getAge();
            rowData[i][3] = arrayList.get(i).getLevel();
        }
        DefaultTableModel model = new DefaultTableModel(rowData, columnNames);
        table = new JTable(model);
        scrollPane = new JScrollPane(table);
        setContentPane(scrollPane);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setVisible(true);
    }
}
