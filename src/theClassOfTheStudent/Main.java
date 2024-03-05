package theClassOfTheStudent;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please scanf the number of the students ");
        try (Scanner in = new Scanner(System.in)) {
            int i = in.nextInt();
            Student[] student = new Student[i];// = new Student[i];// ]student[i];
            // System.out.println("P")i
            // int i = 0;
            int y = 1;

            for (Student he : student) {

                System.out.println("Please scannf NO" + y++ + " ID:");
                String e = in.next();
                // he.setstudentID(e);
                in.nextLine();

                System.out.println("the name:");
                String name = in.nextLine();
                // he.setstudentName(name);
                // in.nextLine();

                int q = 0;
                System.out.println("scannf the number of the activies");

                q = in.nextInt();

                // he.addExtraActivity(q);
                he = new Student(e, name, q);
                String[] heh = new String[q];
                in.nextLine();
                System.out.println("the activities the student attend ");
                int x = 1;

                StringBuilder iu = new StringBuilder();
                // String [] the=new String[q];
                for (String kk : heh) {
                    System.out.println("Please scanf the NO" + x + "activity");
                    kk = in.nextLine();
                    x++;
                    // the[x-1] =kk;
                    heh[x - 1] = kk;
                    if (x == 2)
                        iu.append(kk);
                    else {
                        iu.append("  and  " + kk);
                    }}}}}
  /*            }

                // String o = iu.toString();
                // String pp = heh.toString();
                // System.out.println("The activtis are" + o);
                // he.addExtraActivity(i, heh);

                he.addExtraActivity(q, heh);
                // he.setstudentName(name);
                // he.setstudentID(e);

                System.out.println(he.toString());
            }
            // System.out.println(s)
            /*
             * for (int w = 0; w < student.length; w++) {
             * System.out.println(student[w].toString());
             * }
             */
        }

}}
