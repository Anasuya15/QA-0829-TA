package support;

public class Homework {
    public static void main(String[] args) {
       printString();
        printInt();
        printBoolean();
        sumofString();
        mathResults();
        comparisonResults();
        logicalOperators();

    }
    static void printString() {
        System.out.println("This is a srting...");
    }
    static void printInt(){
        System.out.println(5);
    }
    static void printBoolean(){
        System.out.println(true);

    }
    static void sumofString(){
        String  str1="First String";
        String str2="second String";
        System.out.println(str1+str2);
    }
    static void mathResults(){
      int x= 5;
      int y= 6;
        System.out.println("Result for operation + :"+(x+y) );
        System.out.println("Result for operation - :"+(x-y) );
        System.out.println("Result for operation / :"+(x/y) );
        System.out.println("Result for operation * :"+(x*y) );
    }
    static void comparisonResults(){
        int x = 5;
        int y = 6;
        System.out.println("Results for > : " + (x>y));
        System.out.println("Results for "+x+">"+y+"= " + (x>y));
        System.out.println("Results for "+x+"<"+y+"= " + (x<y));
        System.out.println("Results for "+x+">="+y+"= " + (x>=y));
        System.out.println("Results for "+x+"<="+y+"= " + (x<=y));
        System.out.println("Results for "+x+"=="+y+"= " + (x==y));
        System.out.println("Results for "+x+"!="+y+"= " + (x!=y));



    }
    static void logicalOperators(){
        boolean val = true;
        int x = 10;
        if (x ==10 && val == true ){
            System.out.println( "Both conditions are true");
        }
        if (x ==11  || val) {
            System.out.println("single condition met");
        }
    }

}
