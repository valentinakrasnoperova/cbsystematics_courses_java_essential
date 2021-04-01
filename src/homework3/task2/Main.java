package homework3.task2;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(new Pupil[]{new BadPupil(), new GoodPupil(), new GoodPupil(), new ExcelentPupil()});
        classRoom.showActivity();
    }
}
