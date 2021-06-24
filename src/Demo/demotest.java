package Demo;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class demotest {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(0.1);
        System.out.println("a values is:" + a);
        System.out.println("=====================");
        BigDecimal b = new BigDecimal("0.1");
        System.out.println("b values is:" + b);


        NumberFormat currency = NumberFormat.getCurrencyInstance(); //建立货币格式化引用
        NumberFormat percent = NumberFormat.getPercentInstance();  //建立百分比格式化引用
        percent.setMaximumFractionDigits(3); //百分比小数点最多3位

        BigDecimal loanAmount = new BigDecimal("15000.48"); //贷款金额
        BigDecimal interestRate = new BigDecimal("0.008"); //利率
        BigDecimal interest = loanAmount.multiply(interestRate); //相乘
        BigDecimal add = loanAmount.add(interestRate);
        BigDecimal subtract = loanAmount.subtract(interestRate);
        BigDecimal multiply = loanAmount.multiply(interestRate);
        BigDecimal divide = loanAmount.divide(interestRate);
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);

        System.out.println("贷款金额:\t" + currency.format(loanAmount));
        System.out.println("利率:\t" + percent.format(interestRate));
        System.out.println("利息:\t" + currency.format(interest));
    }
}
