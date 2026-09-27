import java.util.*;
public class greeting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            case 4:
                System.out.println("Hola");
                break;
            case 5:
                System.out.println("Ciao");
                break;
            case 6:
                System.out.println("Konnichiwa");
                break;
            case 7:
                System.out.println("Salam");
                break;
            case 8:
                System.out.println("Zdravstvuyte");
                break;
            case 9:
                System.out.println("Shalom");
                break;
            case 10:
                System.out.println("Sawubona");
                break;
            case 11: 
                System.out.println("Sawasdee");
                break;
            case 12:
                System.out.println("Merhaba");
                break;
            case 13:
                System.out.println("Hej");
                break;
            case 14:
                System.out.println("Aloha");
                break;
            case 15:
                System.out.println("Salve");
                break;
            case 16:
                System.out.println("Sannu");
                break;
            case 17:
                System.out.println("Selam");
                break;
            case 18:
                System.out.println("Privet");
                break;
            case 19:
                System.out.println("Jambo");
                break;
            case 20:
                System.out.println("Dia dhuit");
                break;
            default:
                System.out.println("Invalid button");
        }
    }
    
}
