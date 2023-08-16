public class Task1 {
    public static void main(String[] args) {
      
      
      
       
        final String COLOR1 = "\033[36;1m";
        final String COLOR2 = "\033[31;2m";
        final String RESET1 = "\033[30;0m";
        final String COLOR3 = "\033[33;2m";

        System.out.printf("%1$s+-----------------+-----+%2$s\n", COLOR3, RESET1);
        System.out.printf("| %1$sNAME%2$s\t\t  | %1$sAGE%2$s |\n", COLOR1, RESET1);
        System.out.printf("%1$s+-----------------+-----+%2$s\n", COLOR3, RESET1);
        System.out.printf("| Alice\t\t  | %1$s 24%2$s |\n", COLOR2, RESET1);
        System.out.printf("| Bob\t\t  | %1$s 30%2$s |\n", COLOR2, RESET1);
        System.out.printf("%1$s+-----------------+-----+%2$s\n\n", COLOR3, RESET1);
    }
}
