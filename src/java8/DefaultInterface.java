package java8;



interface  MyInterface{
    void show();

    default void display (){
        System.out.println("in show");
    }
}
public class DefaultInterface implements MyInterface {
    public static void main(String[] args){
        DefaultInterface defaultAndStatic=new DefaultInterface();
        defaultAndStatic.show();
        defaultAndStatic.display();

    }

    @Override
    public void show() {
        System.out.println("hii");
    }
}
