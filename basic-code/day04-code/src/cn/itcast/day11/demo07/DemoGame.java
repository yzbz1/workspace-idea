package cn.itcast.day11.demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("源氏");
        hero.setSkill(new SkillImpl("竜神のdu剣を喰らえ"));
        hero.attack();

        System.out.println("===================");
        hero.setSkill(new Skill(){
            @Override
            public void use() {
                System.out.println("啊~");
            }
        });
        hero.attack();
    }
}
