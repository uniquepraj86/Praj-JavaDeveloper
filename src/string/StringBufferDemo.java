package string;

public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("pune");
        StringBuffer stringBuffer1 = new StringBuffer("pune");
        stringBuffer.append(stringBuffer1);
        System.out.println(stringBuffer);

        stringBuffer.delete(0,4);
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.charAt(1));
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.capacity());

    }
}
