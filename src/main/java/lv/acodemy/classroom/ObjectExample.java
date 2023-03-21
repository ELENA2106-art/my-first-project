package lv.acodemy.classroom;

public class ObjectExample {

    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik");

        System.out.println(barsik.getAge());
        System.out.println(barsik);

        barsik.setAge(4);
        System.out.println(barsik.getAge());

        barsik.speak();
        barsik.feed();

        barsik.setWeight(6.5);
        System.out.println(barsik.getWeight());
        System.out.println(barsik);


        Cat mura = new Cat("Mura", "gray", "uncknown", "fermale", true);
        mura.setAge(1);
        mura.setWeight(2.0);
        System.out.println(mura);


        mura.walk();
        mura.walk();
        mura.walk();
        mura.walk();
        mura.walk();
        mura.walk();
        System.out.println(mura.getEnergy());

        mura.feed();
        mura.feed();
        mura.feed();
        mura.feed();
        mura.feed();
        mura.feed();


    }
}
