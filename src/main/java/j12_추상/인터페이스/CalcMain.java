package j12_추상.인터페이스;

public class CalcMain {
    public static void main(String[] args) {
        int[] taxPay = {0, 0, 0};
        int[] salaryPay = {1000000, 1000000, 1000000, 1000000};

        int result1 = 0;
        int result2 = 0;

        Calculator calculator = new Tax(); //연말정산
        result1 = calculator.calc(taxPay); // = calculator.calc(int[] {2000000, 2500000, 2600000, 2700000});
        if(result1 == 0) {
            System.out.println("오류 : " + calculator.ERROR_CODE);
        }else {
            System.out.println("result1 => " + result1);
        }

        calculator = new Salary(); //급여정산
        result2 = calculator.calc(salaryPay);
        if(result2 == 0) {
            System.out.println("오류 : " + calculator.ERROR_CODE);
        }else {
            System.out.println("result2 => " + result2);
        }
    }
}
