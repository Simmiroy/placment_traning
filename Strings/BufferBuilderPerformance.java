package Strings;

public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        StringBuffer buffer=new StringBuffer("Java");
        for(int i=1; i<100000; i++){
            buffer.append(" DSA");
        }
        System.out.println("Buffer Time : "+System.currentTimeMillis() + "ms");
        StringBuilder builder =new StringBuilder("Java");
        for(int i=1; i<1000000; i++){
            builder.append(" DSA");
        }
        System.out.println("Builder Time " + (System.currentTimeMillis()-startTime) + "ms");
    }
}
//StringBuilder is bettter than StringBuffer.