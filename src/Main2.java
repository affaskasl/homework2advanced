
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();
        map.put("Москва", "Іванови");
        map.put("Київ", "Петрови");
        map.put("Лондон","Абрамовичі");
        System.out.println("Введіть назву міста: ");

        String a = sc.nextLine();
        if (map.containsKey(a)){
            System.out.println("Сім'я яка мешкає в цьому місті -  "+ map.get(a));

        } else{

            System.out.println("Неправильно");

        }



    }



}
