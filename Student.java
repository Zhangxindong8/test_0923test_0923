public class Student {
    public static void main(String[] args) {
        Person xiaohua=new Person("小花","女",17);
        Person xiaoli=new Person("小莉","女",18);
        xiaohua.eat();
        xiaoli.sleep();
        System.out.println(Person.num);
        xiaoli.setAge(25);
        System.out.println(xiaoli);


    }
}
