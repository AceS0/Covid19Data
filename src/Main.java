import java.util.*;

public class Main {
    public static void main(String[] args) {


        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> datas = fh.loadAllData();

        for (Covid19Data data : datas) {
            System.out.println(data);
        }

        Comparator comparator = new RegionComparator();
        Comparator comparator2 = new AldersGruppeComparator();


        Scanner sc = new Scanner(System.in);
        System.out.println("Choose betweeen Region or Age, by typing 1 for Region and 2 for Age.");
               while(true) {
                   String number = sc.next();
                   if (Objects.equals(number, "1")) {
                       Collections.sort(datas, comparator);
                       break;
                   } else if (Objects.equals(number, "2")) {
                       Collections.sort(datas, comparator2);
                       break;
                   } else{
                       System.out.println("The input doesn't match.");
                   }
               }
        System.out.println("Data has been changed.");

        for (Covid19Data data : datas) {
            System.out.println(data);
        }


        comparator = new RegionComparator().thenComparing(new AldersGruppeComparator());
        comparator2 = new AldersGruppeComparator().thenComparing(new RegionComparator());
        System.out.println("Choose betweeen primary Region & secondary Age or primary Age & secondary Region," +
                " by typing 1 for Region and 2 for Age.");
        while(true) {
            String number = sc.next();
            if (Objects.equals(number, "1")) {
                Collections.sort(datas, comparator);
                break;
            } else if (Objects.equals(number, "2")) {
                Collections.sort(datas, comparator2);
                break;
            } else{
                System.out.println("The input doesn't match.");
            }
        }
        System.out.println("Data has been changed.");

        for (Covid19Data data : datas) {
            System.out.println(data);
        }

    }
}