public class Main {

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println();


        int result = add(3,4,10,3);
        System.out.println(result);


        }

        static int add(int x,int y){
            System.out.println("this is method 1");
            return x+y;
        }

        static int add(int x, int y, int z){
            System.out.println("This is method 2");
            return x + y + z;
        }

        static int add(int a, int b, int c, int d){
            System.out.println("This is method 3");
            return a + b + c + d;
        }
    }
