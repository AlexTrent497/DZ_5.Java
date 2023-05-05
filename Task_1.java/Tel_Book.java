
package Task_1;


import java.util.*;


/**
 * Tel_Book
 */
public class Tel_Book {
    private static final String Tel_BookPhone = null;
    public static void addNumber(String key, int value, String telBookphone){
        if (telBookphone.contains(key)) {
            telBookphone.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            telBookphone.put(key, list);
        }

    }
    public static void printTei_Book(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        new HashMap<>();
        addNumber("Иванов", 123, Tel_BookPhone);
        addNumber("Иванов", 1234, Tel_BookPhone);
        addNumber("Петров", 546585, Tel_BookPhone);
        addNumber("Сидоров", 8956477, Tel_BookPhone);
        addNumber("Иванов", 12356233, Tel_BookPhone);
        addNumber("Петров", 787897, Tel_BookPhone);
        printTel_Book(Tel_BookPhone);
    
}
    private static void printTel_Book(String Tel_Bookphone) {
    }

}







