import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassAttributes {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setSname("Durai");
        System.out.println("The Student Name :" + s1.getSname());
        Class c1 = s1.getClass();
        Method[] m1 = c1.getDeclaredMethods();
        for (Method method : m1){
            System.out.println("Avaliable Methods of the Class : "+ method.getName());
        }
        Field[] f1 = c1.getDeclaredFields();
        for (Field field : f1){
            System.out.println("All Avaliable Fields : " +field.getName());
            System.out.println(field.getAnnotations());
        }

    }
}
