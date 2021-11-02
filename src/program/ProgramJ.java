package program;

public class ProgramJ {

    public static void calc(int a, int b, char operator){
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case'*':
                System.out.println(a*b);
                break;
            case'/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Что-то пошло не так, повторите запрос");
                break;
        }
    }

    public static void main(String[] args) {
        calc(2,3, '+');
    }
    }

