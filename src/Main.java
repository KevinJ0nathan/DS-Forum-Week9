import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> HT = new Hashtable<>(13);
        HT.put(197354863 % 13, "a1");
        HT.put(933185952 % 13, "a2");
        HT.put(132489973 % 13, "a3");
        HT.put(134152056 % 13, "a4");
        HT.put(216500306 % 13, "a5");
        HT.put(106500306 % 13, "a6");

        System.out.println("Index" + "\t" + "Value");
        for (int i = 0; i < 13; i++) {
            // Check if the key exists in the Hashtable
            if (HT.containsKey(i)) {
                System.out.println(i + "\t\t" + HT.get(i));
            } else {
                // If the key doesn't exist, print that it's empty
                System.out.println(i + "\t\tEMPTY");
            }
        }
    }
}
