package tr.edu.maltepe.oop;

public class SimpleMain {
    public static void main(String[] args) {
        Books book1, book2, book3;
        MaltepeLibrary MaltepeLib = new MaltepeLibrary();

        Professor prof = new Professor(000000000,"Ensar Gül ",2022);
        Student std = new Student(190704034,"Efsa Zengin", 2022,prof);

        book1 = new Books("Java Programing");
        book2 = new Books("C Programming  ");
        book3 = new Books("OP System");

        MaltepeLib.addBook(book1);
        MaltepeLib.addBook(book2);
        MaltepeLib.addBook(book3);

        System.out.println("Books of Library");
        System.out.println(" ");

        MaltepeLib.lendBook(prof,book1);
        MaltepeLib.lendBook(prof,book3);
        MaltepeLib.lendBook(std,book1);


        prof.ShowHaveBooks();
        std.ShowHaveBooks();

    }

}