package homework3.task2;

public class ClassRoom {
    public int index = 0;
    public Pupil[] pupils;

    public ClassRoom(int maxClassSize) {
        this.pupils = new Pupil[maxClassSize];
    }

    public void addPupil(Pupil pupil){
        if(index == pupils.length){
            System.out.println("Threre is no more place in the class");
        }
        pupils[index++] = pupil;
    }

    public void showActivity() {
        Pupil pupil;
        for (int i = 0; i<index;i++ ) {
            pupil = pupils[i];
            pupil.read();
            pupil.write();
            pupil.study();
            pupil.relax();

        }
    }
}
