package exceptionhandling;

public class ThrowKeyword {
    public static void main(String[] args) throws Exception {
        int age=17;
        if(age>18){
            System.out.println("you can  vote");

        }else {
            throw new Exception("you can vote");
        }
    }
}

/**
//             Throw                                           //   Throws

    1. used in explicitly                                   used to declare exception
    2. used in method                                       in signature method
    3.  followed by instance                                    followed by  class
    4. you can throw single                                 you can throw multiple



 */