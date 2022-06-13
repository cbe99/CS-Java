package Java.autoAndUn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");
        // ArrayList<int> intArrayList = new ArrayList<int>(); //Gives error for int
        // Solution: Make an class for the ArrayList type
        // ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        // intClassArrayList.add(new IntClass(54));
        // Integer integer = new Integer(54); //causes error
        // Integer myIntValue = 56; // this doesnot

        // Double doubleVal = new Double(12.5);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double db = 0.0; db <= 10.0; db++) {
            myDoubleValues.add(db);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }

    }

    class IntClass {
        private int myValue;

        public IntClass(int myValue) {
            this.myValue = myValue;
        }

        public int getMyValue() {
            return myValue;
        }

        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }
    }

}
