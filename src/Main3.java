import  java.util.*;

public class Main3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
Scanner sc = new Scanner(System.in);

while(true){
String a = sc.nextLine();
if(a.equalsIgnoreCase("end")){
    break;
}
list.add(a);




}
System.out.println("Рядки, які ви ввели: ");


for(String a : list){
    System.out.println(a);



}

    }
}
