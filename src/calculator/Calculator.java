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
        int newNumber = Integer.parseInt(firstNumber);
        numberList.add(newNumber);

        if (numberList.isEmpty() || numberSign.isEmpty()) {
            return 0;
        }
        result = numberList.get(0);

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

    public void clearValues() {
        numberList.clear();
        numberSign.clear();
        firstNumber = "0";
        result = 0;
    }
}
