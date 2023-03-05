public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String studentName, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(studentName, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public int totalPoints() {
        return industriousness + loyalty + honesty;
    }
    public static void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
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
        return "faculty Hufflepuff, " +
                super.toString() +
                "industriousness = " + industriousness +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty;
    }
}
