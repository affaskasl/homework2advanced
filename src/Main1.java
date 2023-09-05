import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть число: ");
        int N = sc.nextInt();
        List<Integer> integerList = getIntegerList(N);
        System.out.println("Список: " + integerList );
System.out.println(getMinimum(getIntegerList(N)));



    }

    public static LinkedList<Integer> getIntegerList(int N){
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new LinkedList<>();

        for (int x =0; x<N;x++){
            int number = N;
            list.add(number);



        }
        sc.close();
        return (LinkedList<Integer>) list;




    }
    public static  int getMinimum(LinkedList<Integer> list){
if(list.isEmpty()){
    throw new IllegalArgumentException(" Список пустий.");

}
int minimum = list.get(0);
for(int x = 0; x<list.size(); x++){
if(list.get(x)<minimum){
    minimum=list.get(x);

}

}
return minimum;
    }
}
