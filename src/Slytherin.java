public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String studentName, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(studentName, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int totalPoints() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public static void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
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
        return "faculty Slytherin, " +
                super.toString() +
                "cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", lustForPower = " + lustForPower;
    }
}
