public class Taskd {
    public static void main(String[] args) {

        final String COLOR1 = "\033[39;1m";
        final String COLOR2 = "\033[36;1m";
        final String COLOR3 = "\033[31;2m";
        final String RESET1 = "\033[30;0m";
        final String COLOR4 = "\033[32;2m";
        

        System.out.printf("%s+----------+----------+-------+%s\n", COLOR1, RESET1);
        System.out.printf("| ITEM\t   | QUANTITY | PRICE |\n", COLOR2, RESET1);
        System.out.printf("%s+----------+----------+-------+%s\n", COLOR1, RESET1);
        System.out.printf("| Apples   |        %1$s5%2$s | %3$s$%2$s%4$s0.99%2$s |\n", COLOR2, RESET1, COLOR4, COLOR3);
        System.out.printf("| Oranges  |       %1$s10%2$s | %3$s$%2$s%4$s1.49%2$s |\n", COLOR2, RESET1, COLOR4, COLOR3);
        System.out.printf("%s+----------+----------+-------+%s\n", COLOR1, RESET1);

    }
}
