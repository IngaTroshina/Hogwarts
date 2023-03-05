public class Main {
    public static void main(String[] args) {

        Hogwarts[] students = {
                new Gryffindor("Harry Potter", 100, 80, 100, 100, 100),
                new Gryffindor("Hermione Granger", 100, 100, 100, 100, 90),
                new Gryffindor("Ronald Weasley", 70, 60, 90, 100, 70),
                new Slytherin("Draco Malfoy", 80, 70, 100, 70, 100, 70, 100),
                new Slytherin("Graham Montague", 60, 60, 60, 60, 50, 60, 60),
                new Slytherin("Gregory Goyle", 50, 50, 50, 50, 50, 50, 50),
                new Hufflepuff("Zacharias Smith", 80, 40, 100, 100, 100),
                new Hufflepuff("Cedric Diggory", 90, 90, 100, 100, 100),
                new Hufflepuff("Justin Finch-Fletchley", 70, 40, 90, 100, 100),
                new Ravenclaw("Cho Chang", 70, 70, 90, 60, 70, 80),
                new Ravenclaw("Padma Patil", 80, 70, 90, 80, 70, 90),
                new Ravenclaw("Marcus Belby", 50, 50, 50, 50, 50, 50),
        };

        listAllStudents(students);

        studentDescription(students, "Harry Potter");

        Gryffindor.compareGryffindorStudents((Gryffindor) students[0], (Gryffindor) students[1]);

        Hufflepuff.compareHufflepuffStudents((Hufflepuff) students[6], (Hufflepuff) students[7]);

        Ravenclaw.compareRavenclawStudents((Ravenclaw) students[9], (Ravenclaw) students[10]);

        Slytherin.compareSlytherinStudents((Slytherin) students[3], (Slytherin) students[4]);

        Hogwarts.compareTwoHogwartsStudents(students[0], students[5]);
    }
    private static void listAllStudents(Hogwarts[] students) {
        System.out.println("List of all students:");
        for (Hogwarts i : students) {
            System.out.println(i);
        }
        System.out.println();
    }
    private static void studentDescription(Hogwarts[] students, String student) {
        for (Hogwarts i : students) {
            boolean comparisonTrue = student.equalsIgnoreCase(i.getStudentName());
            if (comparisonTrue) {
                System.out.println("Description of student " + student + ": " + i);
            }
        }
        System.out.println();
    }
}