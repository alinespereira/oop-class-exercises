package intro;

import java.util.Scanner;

public class Reader {
    private final Scanner keyboard;
    private String name;
    private static int nReaders;

    public Reader(String name) {
        this.keyboard = new Scanner(System.in);
        this.name = name;
        nReaders++;
    }

    public void readInt() {
        while (this.keyboard.hasNextInt()) {
            System.out.println(this.keyboard.nextInt());
        }
    }

    public static void main(String[] args) {
        Reader r1 = new Reader("Reader 1");
        Reader r2 = new Reader("Reader 2");
        Reader r3 = new Reader("Reader 3");
        Reader r4 = new Reader("Reader 4");
        r1.readInt();
        System.out.println(r3.getName());
        System.out.println(Reader.nReaders);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
