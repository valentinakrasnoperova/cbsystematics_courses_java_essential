package homework3.task2;

public class GoodPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("good  studying");
    }

    @Override
    public void read() {
        System.out.println("good  reading");
    }

    @Override
    public void write() {
        System.out.println("good  writing");
    }

    @Override
    public void relax() {
        System.out.println("good  relaxing");
        System.out.print("\n");
    }
}
