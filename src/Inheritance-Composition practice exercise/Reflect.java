package Inheritance;

;

public class Reflect {
    public static class H<T, E, F> {
        T first;
        E second;
        F third;

        H(T first, E second, F third) {

            this.first = first;
            this.second = second;
            this.third = third;

        }

        public static <T, E, F> H<T, E, F> k(H<T, E, F> j) {

            int i = (int) j.first;
            // +j.second+j.third;
            int u = (int) j.second;
            int o = (int) j.third;

            int sum = i + u + o;

            System.out.println(sum);

            return j;

        }

    }

    public static class Hello<T> {
        private T first;
        private T second;

        Hello(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public String toString() {
            return "The first of the class is" + this.first + this.second;
        }
    }

    public static <T> Hello<T> he(Hello<T> j) {
        System.out.println(j);
        return j;
    }

    public static void main(String[] args) {
        var k = new Hello<String>("1".repeat(100), "2");
        he(k);
        var p = new H<Integer, Integer, Integer>(1, 1, -12);
        H.k(p); /*


        
                 * interfice h = new Event() {
                 * 
                 * public void pr() {
                 * System.out.println("You are successful");
                 * 
                 * }
                 * };
                 * h.pr();
                 * 
                 * // public static void reflect(Class<?> cla) {
                 * 
                 * /*
                 * Class thereflect = cla.getClass();
                 * Method[] me = thereflect.getMethods();
                 * 
                 * for (Method q : me) {
                 * String modifier = Modifier.toString(q.getModifiers());
                 * 
                 * String returnvalue = q.getReturnType().toString();
                 * String name = q.getName();
                 * String a = q.getParameterTypes().toString();
                 * System.out.println(modifier + "  " + returnvalue + " " + name + "[");
                 * Type[] types = q.getParameterTypes();
                 * for (Type s : types) {
                 * System.out.println(s + " ");
                 * 
                 * }
                 * if (types.length == 0) {
                 * System.out.println("There is no parameter in the method ");
                 * }
                 * System.out.print("]");
                 */

    }

}// }