package day05;

public class School {
    public static void main(String[] args) {
        Journal journal = new Journal();

        System.out.println(journal.addStudent("John Doe"));
        System.out.println(journal.addStudent("Kiss Töhötöm"));
        System.out.println(journal.addStudent("Nagy János"));
        System.out.println(journal.addStudent("Madonna"));

        System.out.println(journal.getNaplo());
    }
}
