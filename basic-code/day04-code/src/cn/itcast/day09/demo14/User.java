package cn.itcast.day09.demo14;

public class User {
    private String Name;
    private int money;

    public User(String name, int money) {
        Name = name;
        this.money = money;
    }

    public User() {

    }
    //展示当前用户有多少钱
    public void show(){
        System.out.println("用户:"+this.Name +",当前余额"+ this.money);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
