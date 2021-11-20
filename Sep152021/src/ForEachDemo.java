public class ForEachDemo {
    public static void main(String[] args){
        String[] studentNames = {"Enne", "Meene", "Maani", "Mou", "Kaca", "Tocha", "Tia", "Thoo"};
        //For Looing Iteration
        for (int i=0; i<studentNames.length;i++){
            System.out.println(studentNames[i]);
        }
        //ForEach Iteration
        for (String s1: studentNames){
            System.out.println(s1);
        }
    }
}
