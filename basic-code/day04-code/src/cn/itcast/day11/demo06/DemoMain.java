package cn.itcast.day11.demo06;

public class DemoMain {

    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero = new Hero();
        hero.setName("艾希");
        //创建武器
        Weapon weapon = new Weapon("火之高兴");
        //将武器赋予英雄
        hero.setWeapon(weapon);
        //攻击
        hero.attack();


    }
}
