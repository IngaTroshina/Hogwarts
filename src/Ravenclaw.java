public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String studentName, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(studentName, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public int totalPoints() {
        return mind + wisdom + wit + creation;
    }

    public static void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
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
        return "faculty Ravenclaw, " +
                super.toString() +
                "mind = " + mind +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", creation = " + creation;
    }
}
