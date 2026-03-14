package interfacee;

public interface Browser {
    void Browser1();
}
interface Browser2{
    void Browser2();
}
interface Browser3{
    void Browser3();
}
class Browsers implements Browser , Browser2,Browser3{

    @Override
    public void Browser1() {
        System.out.println("Google");
    }

    @Override
    public void Browser2() {
        System.out.println("Maang");
    }

    @Override
    public void Browser3() {
        System.out.println(" Walmart.");
    }

    public static void main(String[] args) {
        Browsers b= new Browsers();
        b.Browser1();
        b.Browser2();
        b.Browser3();
    }
}
