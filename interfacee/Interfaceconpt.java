package interfacee;

public interface Interfaceconpt {
    void display();
}
    class A{

    }
    class B{
        public static void main(String[] args) {
            A a = new A();
            B b= new B();
            Interfaceconpt o = new Interfaceconpt(){
                public void display(){
                    System.out.println("Hello ");
                }
            };
            Interfaceconpt o1=()-> System.out.println("Hello");
        }
}
