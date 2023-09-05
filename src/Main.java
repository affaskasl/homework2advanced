import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<String> mylist= new ArrayList<>(){


        };

        String str = sc.nextLine();
String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        String str4 = sc.nextLine();
        mylist.add(str);
        mylist.add(str1);
        mylist.add(str2);
        mylist.add(str3);
        mylist.add(str4);
System.out.println(mylist.size());
System.out.println(doubleValues(mylist));
for (String word : mylist){
    System.out.println(word);


}
    }
    public static Collection<String> doubleValues(Collection<String> input){
List<String> doubleV = new ArrayList<>();
for(String word:input){
    doubleV.add(word);
    doubleV.add(word);



}
return doubleV;

    }
}