package prototype_Design_Pattern;

public class AnotherConnection extends NetworkConnection {

    @Override
    public void importantdata() {
        super.importantdata();
        //System.out.println("Ip:"+this.getIp()+"port"+this.getPort1());

    }
    public AnotherConnection(){
        System.out.println("This is Another Connection:");
    }
}
