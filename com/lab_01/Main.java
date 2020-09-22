package com.lab_01;

/**
 * Class that demonstrates first java app
 * @author <a href="mailto:my_email@exmaple.com">Ivan Kolesnik</a>
 * @version 1.0.0
 * @since 09/22/2020
 */
public class Main {
    /**
     * App entry point
     * @param args CLI arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("Group: 535st2");
        System.out.println("Student: Kolesnik Ivan Sergiyovych");
        System.out.println("Variant: 4");
        System.out.println();

        printKIS();
    }

    /**
     * Prints "KIS" with pseudo-graphics to stdout
     */
    public static void printKIS() {
        String line =
                "**          ***      **         ********\n" +
                "**        ***                ****       \n" +
                "**     ***           **      **         \n" +
                "**   ***             **      ****       \n" +
                "******               **         *****   \n" +
                "******               **         *****   \n" +
                "**   ***             **             ****\n" +
                "**     ***           **               **\n" +
                "**        ***        **             ****\n" +
                "**          ***      **      ********   \n";

        System.out.println(line);
    }
}
