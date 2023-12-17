package calculator;

import java.util.ArrayList;

public class Calculator {

    private String firstNumber = "0";
    ArrayList<Integer> numberList = new ArrayList<>();
    ArrayList<String> numberSign = new ArrayList<>();
    int result = 0;

    public void setNumber(String num) {
        this.firstNumber += num;
    }

    public void addToArrayList(String buton) {

        int newFirstNumber = Integer.parseInt(firstNumber);
        numberList.add(newFirstNumber);
        numberSign.add(buton);
        firstNumber = "";

    }

    public int operation() {
        /*This variable newNumber is esscencial because is like the second inserted number,
        with it I can select the last number when pressing "=" button
        */
        int newNumber = Integer.parseInt(firstNumber);
        numberList.add(newNumber);

        /*If I press "=" and there's no number yet it will show me a 0*/
        
        if (numberList.isEmpty() || numberSign.isEmpty()) {
            return 0;
        }
        result = numberList.get(0);

        /*Here below I run through the sign array and then the numberList and depending what sign is in the moment,
          I sum them or multiply etc.  
        */
        for (int i = 0; i < numberSign.size(); i++) {
            String sign = numberSign.get(i);

            if (i + 1 < numberList.size()) {
                int nextNum = numberList.get(i + 1);

                switch (sign) {
                    case "+":
                        result += nextNum;
                        break;
                    case "-":
                        result -= nextNum;
                        break;
                    case "*":
                        result *= nextNum;
                        break;
                    case "/":
                        result /= nextNum;
                        break;
                }
            }
        }
        return result;
    }
/*As the name says, I reset all the values of my variables once finished, to start over again*/
    public void clearValues() {
        numberList.clear();
        numberSign.clear();
        firstNumber = "0";
        result = 0;
    }
}
