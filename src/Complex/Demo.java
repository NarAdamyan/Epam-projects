package Complex;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        Apartament home1 = new Apartament(Address.First, 1, 3, 1, 43, 1, 1, true);
        Apartament home2 = new Apartament(Address.First, 6, 3, 2, 90, 3, 3, false);
        Apartament home3 = new Apartament(Address.Second, 10, 2, 3, 83, 3, 7, false);
        Apartament home4 = new Apartament(Address.Second, 15, 2, 4, 100, 4, 9, true);
        Apartament home5 = new Apartament(Address.Third, 10, 1, 5, 67, 2, 8, true);
        Apartament home6 = new Apartament(Address.Third, 12, 1, 6, 98, 4, 6, true);

        HashMap<String, Apartament> map = new HashMap<>();
        map.put(home1.getAddress(), home1);
        map.put(home2.getAddress(), home2);
        map.put(home3.getAddress(), home3);
        map.put(home4.getAddress(), home4);
        map.put(home5.getAddress(), home5);
//        map.put(home6.getAddress(), home6);

        try {
            returnByAddress(map, home6);
        } catch (NotValidAddressException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Apartament hashCode: " + home1.hashCode());

    }

    public static void returnByAddress(HashMap<String, Apartament> map, Apartament home) throws NotValidAddressException {
        String addressKey = home.getAddress();

        if (!map.containsKey(addressKey)) {
            throw new NotValidAddressException("Not valid address");
        }
        Apartament a = map.get(addressKey);
        System.out.println(a);
    }
}
