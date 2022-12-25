public class Main {
    public static void main(String[] args) {
        //类的实体化


    }

}
class Person{
    //1.属性：
    String name;
    int age;
    boolean sex;

    //2.方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }
    public String getName(){
        return name;
    }
    public String setName(String n){
        name = n;
        return name;
    }
    public void info() {
        eat();
        sleep();
        System.out.println("name:" + name + "age:" + age + "sex:" + sex);
    }


}