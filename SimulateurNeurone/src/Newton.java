import java.util.*;

public class Newton {
    private static Scanner scanner = new Scanner(System.in);
    public ArrayList<String> list  = new ArrayList<String>();;
    
    public String toString() {
        String s ="";
        for(int i = 0;i<this.list.size();i++) {
            s+= this.list.get(i) + "\n";
        }
        return s;
    }
    
    public static void main(String[] args) {
        Newton nt = new Newton();
        int n = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i<n; i++) {
            nt.list.add(scanner.nextLine());
        }
        
        for (int i = 0; i<nt.list.size(); i++) {
            if ((nt.list.get(i).length() > 10))  {
                String element = nt.list.get(i);
                String element1 = element.substring(0,1);
                int element2 = element.length()-2;
                String element3 = element.substring(element.length()-1);
                element = element1 + element2 + element3;
                nt.list.set(i, element);
            }
        }
        
        System.out.println(nt);
    }
}