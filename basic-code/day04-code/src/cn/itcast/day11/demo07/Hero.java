package cn.itcast.day11.demo07;

public class Hero {

    private String name;  //名称
    private Skill skill;    //技能

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void attack(){
        System.out.println(name+"释放技能!");
        skill.use();
        System.out.println("sextuple kill");
    }
}
