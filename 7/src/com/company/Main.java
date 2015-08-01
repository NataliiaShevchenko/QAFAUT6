package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int[] input = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1}; //false
        //int isAllLessThan = 3;
        //if (input[isAllLessThan] == 4){
            //System.out.print("false");
       // }
        //else  {
           // System.out.print("true");
        //}


       //int[] input = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};  //false
       //int isAllLessThan = 6;
        //if (input[isAllLessThan] == 1){
           // System.out.print("false");
        //}
       // else  {
            //System.out.print("true");
        //}


        //int[] input = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};  //true
        //int isAllLessThan = 7;
        //if (input [isAllLessThan] != 6){
                    //System.out.print("false");
       // }
        //else {
           // System.out.print("true");
        //}



        //int[] input = {-5, -10, -1, -1, -2, -5, -9, 0, -11, -10, -100};  //false
        //int isAllLessThan = 0;
        //if (input[isAllLessThan] == -5){
            //System.out.print("false");
        //}
        //else {
            //System.out.print("true");

        //}


        int[] operand1 = {96, 35, 71, 54, 87, 76, 85, 30, 94, 8, 88, 82, 20};
        int[] operand2 = {2, 63, 33, 91, 98, 20, 95, 95, 5, 83, 38, 66, 87};
        int[] expectedResults = {98, 98, 100, 137, 185, 96, 180, 125, 99, 91, 126, 148, 90};

        boolean testresult = true;

        for (int i=0; i<operand1.length; i++) {
            int sum=operand1[i] + operand2[i];
            int expected=expectedResults[i];
            if (sum != expected) {
                System.out.println("Expected: "+ expected +"; Actual: "+sum);
                testresult = false;
            }
        }

        if (testresult == true)
        {
            System.out.print("Tests PASSED");
        }
        else{
            System.out.print("Tests FAILED");
        }

        //TARGETS
        //5
        int[] notstrings = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int target = 1;
        int result =0;
        for (int i=0; i<11; i++){
            if (notstrings[i]==target){
                result++;
                System.out.println(result);

            }
        }

        //2
        //int[] notstrings = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        //int target = 6;

        //3
        //int[] notstrings = {1, 7, 1, 4, 1, 7, 9, 6, 13, 1, 7};
        //int target = 7;



    }
}

                                                  //ПРИМЕРЫ ФУНКЦИЙ
package com.company;
//пример простой функции, выводим число 1000
public class Main {
    public static int f(){
        return 1000;

    }

    public static void main(String[] args) {
        // write your code here
        int i=1000;
        //System.out.println(i);
        int x=f();
        System.out.println(x);

    }
}





package com.company;
// написать функцию, которая будет принимать число, а потом выдавать это же число умноженное на само себя.
public class Main {
    public static int f (int a){
        return a*a;
    }


    public static void main(String[] args) {
        //write your code here
        int a=10;
        int x = f(10);
        System.out.println(x);

    }
}



package com.company;
// Функция принимает число и строку и в результате выдает эту строку повторенную число раз
public class Main {
    public static String f(String a, int b){
        String c="";
        for (int i=0; i<b; i++){
            c=c+a;
        }
        return c;


    }


    public static void main(String[] args) {
        // write your code here
        String a = "Class";
        int b = 5;
        System.out.println(f(a,b));

    }
}
