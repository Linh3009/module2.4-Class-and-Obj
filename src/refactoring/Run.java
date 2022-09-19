package refactoring;

public class Run {
    public static void main(String[] args) {
        System.out.println("5 + 3 = "+Calculator.calculate(5,3,'+'));
        System.out.println("5 - 3 = "+Calculator.calculate(5,3,'-'));
        System.out.println("5 * 3 = "+Calculator.calculate(5,3,'*'));
        System.out.println("5 / 3 = "+Calculator.calculate(5,3,'/'));
    }
}
