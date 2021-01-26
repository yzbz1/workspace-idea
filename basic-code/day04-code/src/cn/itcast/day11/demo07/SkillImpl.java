package cn.itcast.day11.demo07;

public class SkillImpl implements Skill {
    String code = null;
    @Override
    public void use() {
        System.out.println(code);
    }

    public SkillImpl(String code) {
        this.code = code;
    }
}
