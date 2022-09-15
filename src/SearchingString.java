import java.util.Scanner;

public class SearchingString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter the Character to Search");
        char target=sc.next().charAt(0);
        System.out.println(search(str,target));
    }
    static boolean search(String str, char target){
        if (str.length()==0)
            return false;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==target)
                return true;

        }
        return false;
    }
}
