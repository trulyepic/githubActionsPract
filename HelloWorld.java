public class HelloWorld{

    public static void main(String[] args) {
	// write your code here
        printHelloWorldX3();
    }


    public static void printHelloWorldX3(){
        String[] helloWorldArray = {"hello world!", "hello World!", "hello World!"};

        for(String i: helloWorldArray){
            System.out.println(i);
        }
    }
}
