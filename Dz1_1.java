//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Dz1_1 {
    public static void main(String[] args) {
        String[] n = {"first str", null, "third str"};
        int[] m = {1,2,3,4,5,6,7,8,9,10,11,12};
        division(10, 0);
        printValueByIndex(m,12);
        printStringArray(n);
    }

    public static void division(double firstNum, double secondNum){
        if(secondNum ==  0) throw new ArithmeticException("На ноль делить нельзя!!!");
        double result = firstNum/secondNum;
        System.out.printf("Результат деления %f на %f равен %f.\n", firstNum, secondNum, result);
    }

    public static void printValueByIndex(int[] m, int index){
        if(index > m.length-1) throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует");
        else System.out.printf("Элемент с индексом %d равен %d.\n",index, m[index]);
    }

    public static void printStringArray(String[] n){
        for (String item: n){
            if(item == null) throw new NullPointerException("Элемент отсутствует!!!");
            System.out.println(item);
        }
    }
}