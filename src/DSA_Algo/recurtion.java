package DSA_Algo;

public class recurtion {
    public static int[] arr = new int[]{1, 2, 3};

    public void print(int[] arr , int i) {

        if(arr.length <= i){
            return ;
        }

        print(arr,i+1);
        System.out.println(arr[i]);

    }

    public static void main(String[] args) {
        recurtion rec = new recurtion();
        rec.print(arr,0);
    }
}