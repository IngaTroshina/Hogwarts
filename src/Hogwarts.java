 public class Hogwarts {
    private String studentName;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts (String studentName, int magicPower, int transgressionDistance) {
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

     public int totalPointsTotal() {
         return magicPower + transgressionDistance;
     }

     public static void compareTwoHogwartsStudents(Hogwarts student1, Hogwarts student2) {
         System.out.println("Total points of " + student1.getStudentName() + " = " + student1.totalPointsTotal());
         System.out.println("Total points of " + student2.getStudentName() + " = " + student2.totalPointsTotal());
         if (student1.totalPointsTotal() > student2.totalPointsTotal()) {
             System.out.println(student1.getStudentName() + " better than " + student2.getStudentName());
         } else if (student1.totalPointsTotal() < student2.totalPointsTotal()) {
             System.out.println(student2.getStudentName() + " better than " + student1.getStudentName());
         } else {
             System.out.println("Students'skills are equal");
         }
     }

     @Override
     public String toString() {
         return  "name: " + studentName +
                 ", magicPower = " + magicPower +
                 ", transgressionDistance = " + transgressionDistance +
                 ", ";
     }
 }
