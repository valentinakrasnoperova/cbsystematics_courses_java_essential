package homework3.task2;

public class BadPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("bad studying");
    }

    @Override
    public void read() {
        System.out.println("bad reading");
    }

    @Override
    public void write() {
        System.out.println("bad writing");
    }

    @Override
    public void relax() {
        System.out.println("bad relaxing");
        System.out.print("\n");
    }
}
