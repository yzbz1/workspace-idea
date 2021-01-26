package test;

public class Person implements Comparable<Person> {
    private String Name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override //重写比较规则(用于排序)
    public int compareTo(Person o) {
        return this.age - o.age;  //此处为升序,0:默认元素全相同



    }
}
