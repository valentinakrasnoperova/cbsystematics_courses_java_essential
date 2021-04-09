package homework7.task3;

public enum Animals {
    LION(1), BEAR(2), ELEPHANT(3), RHINOCEROS(4), OSTRICH(5);
    int age;

    Animals(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "name is : " + this.name() + ", age is : " + age;
    }
}
