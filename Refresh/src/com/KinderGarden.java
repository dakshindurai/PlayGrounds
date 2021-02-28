package com;

public class KinderGarden {
    public static void main (String args[]){
        Student s1 = new Student();
        s1.setStudentName("Durai");
        System.out.println(s1.getStudentName());

        System.out.println("Completed execution ...");
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            public void run()
            {
                System.out.println("Shutdown Hook One running !");
            }
        });


    }


}
