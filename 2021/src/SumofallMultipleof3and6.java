public class SumofallMultipleof3and6 {
    public static void main(String[] args){
        int num = 10;
        SumofallMultipleof3and6 s1 = new SumofallMultipleof3and6();
        num = s1.MultiplesOf3And6(num);
        System.out.println(num);
    }
    public int MultiplesOf3And6(int num){
        int sum =0 ;
        for (int i=1; i<num; i++){
            if (i % 3 == 0 || i % 5==0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
