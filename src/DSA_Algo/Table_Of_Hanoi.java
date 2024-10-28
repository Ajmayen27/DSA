package DSA_Algo;

public class Table_Of_Hanoi {

    public int moves(int n, char t1,char t2,char t3){
        if(n == 1){
            return 1;
        }
        int step1 = moves( n-1,t1,t3,t2);
        int step2 = 1;
        int step3 = moves(n-1,t3,t2,t1);
        return step1+step2+step3;
    }

    public static void main(String[] args) {
        Table_Of_Hanoi obj = new Table_Of_Hanoi();
        System.out.println(obj.moves(3,'A','B','C'));
    }
}
