package ShangXueTang.col;

public class Person {
    private final String name;
    private final int handsome;

    public Person() {
        name = null;

        handsome = 0;
    }

    public Person(String name, int handsome) {
        this.name = name;
        this.handsome = handsome;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getHandsome() {
        return handsome;
    }

//    public void setHandsome(int handsome) {
//        this.handsome = handsome;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", handsome=" + handsome +
                '}';
    }
}
