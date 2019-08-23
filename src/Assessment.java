public class Assessment {
    public static int cube(int n){
        return n*n*n;
    }

    public static double getAverage(int[] array)
    {
        int sum = 0;
        for(int i : array) sum += i;
        return ((double) sum)/array.length;
    }
    public static int difference(int a,int b){
        return a-b;
    }
    public static double difference(double a, double b){
        return a-b;
    }

    public static void main(String[] args) {
        Device a = new Device("computer", "apple",100.00);
        System.out.println(a.getBrand());
        System.out.println(a.openTextFile("jsp.txt"));
    }



}
