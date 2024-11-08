package prototype_Design_Pattern;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String port1;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort1() {
        return port1;
    }

    public void setPort1(String port1) {
        this.port1 = port1;
    }
    public void importantdata(){
        this.ip = ip;
        this.port1 = port1;
        System.out.println("ip:"+ip+",port1:"+port1);
    }
    public NetworkConnection(){
        System.out.println("Object is created");
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", port1='" + port1 + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
