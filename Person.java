public class Person {
    private String name;
    private String sex;
    private int age;
    public static int num=10;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    static{
        num=20;
    }

    public void eat(){
        System.out.println(name+"吃饭");
    }
    public void sleep(){
        System.out.println(name+"睡觉");
    }

}