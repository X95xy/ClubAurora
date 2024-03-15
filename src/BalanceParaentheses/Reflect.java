package BalanceParaentheses;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;;

public class Reflect {

    public static void Re(Class<?> the) {

        Class he = the.getClass();
        Method[] hehe = he.getMethods();

        for (Method hr : hehe) {
            String kk = Modifier.toString(hr.getModifiers());
            String name = hr.getName();
            Type jj = hr.getReturnType();

            String hh = jj.toString();
            Parameter[] ii = hr.getParameters();
            System.out.println(kk + " " + name + " " + hh);

            System.out.println(kk + " " + hh + " " + name + "(");
            for (Parameter o : ii) {

                Type uu = (Type) o.getType();// getAnnotatedType();
                System.out.println(uu);
                String na = o.getName();
                System.out.print(na);

            }
            System.out.print(");");

        }

    }

    public static void main(String[] args) {

        Re(BalanceParentheses.class);

    }

}
