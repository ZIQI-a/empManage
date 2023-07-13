package empManage;

public class AllEmployee {
    private String id;
    private String name;
    private int age;
    private String level;
    private double eatCost = 0;
    private double dailyCost = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getEatCost() {
        return eatCost;
    }

    public void setEatCost(double eatCost) {
        this.eatCost = eatCost;
    }

    public double getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(double dailyCost) {
        this.dailyCost = dailyCost;
    }

    public AllEmployee(String id, String name, int age, String level, double eatCost, double dailyCost) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.level = level;
        this.eatCost = eatCost;
        this.dailyCost = dailyCost;
    }
}
