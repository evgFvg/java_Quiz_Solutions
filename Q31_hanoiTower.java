public class TOH {
    public static void main(String[] args) {
        printTower(3, 'A', 'B', 'C');
    }

    public static void printTower(int n, char from, char tmp, char to) {
        if (n > 0) {
            printTower(n - 1, from, to, tmp); //first move n - 1 discs to the "tmp" rod, using "to" as tmp (if 7 discs, we put 6 of them on the B(tmp))
            System.out.format("Disk %d moved from %c to %c%n", n, from, to);//last disk on the "from" rod - move it to "to" (7-th disk to move from A to C )
            printTower(n - 1, tmp, from, to);// move from "tmp" rod to "to" using "from" as tmp (6 discs from B to C)
        }
    }
}
