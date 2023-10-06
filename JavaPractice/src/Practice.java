import java.util.*;

class LoopJava {
    int table;

    public void calculateTable() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(table + " X " + i + " = " + table * i);
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table: ");
        LoopJava obj = new LoopJava();
        obj.table = sc.nextInt();
        obj.calculateTable();
    }
}