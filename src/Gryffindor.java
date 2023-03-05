public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String studentName, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(studentName, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int totalPoints() {
        return nobility + honor + bravery;
    }

    public static void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
        System.out.println("Total points of " + student1.getStudentName() + " = " + student1.totalPoints());
        System.out.println("Total points of " + student2.getStudentName() + " = " + student2.totalPoints());
        if (student1.totalPoints() > student2.totalPoints()) {
            System.out.println(student1.getStudentName() + " better than " + student2.getStudentName());
        } else if (student1.totalPoints() < student2.totalPoints()) {
            System.out.println(student2.getStudentName() + " better than " + student1.getStudentName());
        } else {
            System.out.println("Students'skills are equal");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "faculty Gryffindor, " +
                super.toString() +
                "nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery;
    }
}
