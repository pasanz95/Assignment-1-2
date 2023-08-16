public class Taskc {
    public static void main(String[] args) {
        final String COLOR1 = "\033[39;1m";
        final String COLOR2 = "\033[36;1m";
        final String COLOR3 = "\033[31;2m";
        final String RESET1 = "\033[30;0m";
        final String COLOR4 = "\033[32;2m";
       


        System.out.printf("%s+-----------------+-------------+------------+%s\n", COLOR1, RESET1);
        System.out.printf("| %1$sNAME%2$s\t\t  | %1$sSTATE%2$s\t| POPULATION |\n", COLOR2, RESET1);
        System.out.printf("%s+-----------------+-------------+------------+%s\n", COLOR1, RESET1);
        System.out.printf("| Los Angeles\t  | California  |  %1$s3,966,936%2$s |\n", COLOR3, RESET1);
        System.out.printf("| %1$sNew%2$s York\t  | %1$sNew%2$s York    |  %3$s8,336,817%2$s |\n", COLOR4, RESET1,
                COLOR3);
        System.out.printf("%s+-----------------+-------------+------------+%s\n", COLOR1, RESET1);
    }
}
