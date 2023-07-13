package empManage;

import java.util.ArrayList;

public class SaveEmp {
    public ArrayList<AllEmployee> list = new ArrayList<>();

    public ArrayList<AllEmployee> getList() {
        return list;
    }

    public void setList(ArrayList<AllEmployee> list) {
        this.list = list;
    }

    AllEmployee e1 = new AllEmployee("01", "张三", 19, "职员", 40.1, 100.12);
    AllEmployee e2 = new AllEmployee("02", "李四", 34, "经理", 40.1, 100.12);
    AllEmployee e3 = new AllEmployee("03", "王大锤", 12, "校长", 40.1, 100.12);
    public SaveEmp() {
        list.add(e1);
        list.add(e2);
        list.add(e3);
    }
    //    添加数组中的对象
    public void addList(String id,String name,int age, String level) {
        AllEmployee temp = new AllEmployee(id, name, age, level, 0.0, 0.0);
        list.add(temp);
    }
}

