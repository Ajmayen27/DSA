package prototype_Design_Pattern;

public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException {

        NetworkConnection n1 = new NetworkConnection();
        n1.setIp("127.0.0.1");
        n1.setPort1("Abc");
        n1.importantdata();

        NetworkConnection n2 = null;

        n2 = (NetworkConnection) n1.clone();
        System.out.println(n2);

        AnotherConnection a1 = new AnotherConnection();
        a1.setIp("122.12.123.1");
        a1.setPort1("ZXCX");
        a1.importantdata();
        NetworkConnection a2 = null;
         a2 = (NetworkConnection) a1.clone();
        System.out.println(a2);
    }
}
