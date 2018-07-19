public class Task1 {
    public void Task1(int a, int b) {
        int min, max;

        if (a > b){
            max = a;
            min = b;
        }
        else {
            max = b;
            min = a;}
        System.out.println("Min =" + min);
        System.out.println("Max =" + max);


    }
}
