package com.accenture;
/*
Next task
Create class Marathon
input data:

String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
343, 317, 265 };
Create method printResults, which will print in console al results of marathon in a view of two columns like this
 */
public class Marathon {
    public static void main(String[] args){

        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

        printResults(names,times);
    }

    private static void printResults(String[]names, int[] times){
        for(int i=0; i<names.length; i++){

            System.out.print(names[i]);
            int len = 30 - names[i].length();
            for(int j=0; j<len; j++){
                System.out.print(".");
            }
            //System.out.print(len);
            System.out.println(times[i]);


        }


    }

}
