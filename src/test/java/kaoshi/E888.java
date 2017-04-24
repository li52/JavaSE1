package kaoshi;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
public class E888 {
    public interface Animal {
        public void eat();
    }
    //Bird类
    public class Bird implements Animal{
        @Override
        public void eat() {
            System.out.println("小鸟");
        }
    }
    //Fish类
    public static class Fish implements Animal{
        @Override
        public void eat() {
            System.out.println("小鱼");
        }
    }
    //测试类
    public static class AnimalTest {
        public static void main(String[] args) {
            Animal b = new Animal() {
                @Override
                public void eat() {

                }
            };
            Animal f = new Fish();
            b.eat();
            f.eat();
        }
    }
}
