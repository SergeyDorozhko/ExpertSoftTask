import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> one = new ArrayList<>();
        one.add(1);
        one.add(3);
        one.add(5);
        ArrayList<Integer> two = new ArrayList<>();
        two.add(2);
        two.add(6);
        two.add(8);

        System.out.println(one);
        System.out.println(two);

        System.out.println("RESULT:");
        Main testMethod = new Main();
        testMethod.merge(one, two);
        System.out.println(one);
        System.out.println(two);

    }

    void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            for (; j < b.size(); ) {
                boolean notLastInAListAndSmallerThenInB = a.get(i) < b.get(j) && (i != a.size() - 1);
                boolean lastInAListAndSmallerThenInB = a.get(i) < b.get(j) && (i == a.size() - 1);
                if (notLastInAListAndSmallerThenInB) {
                    break;
                } else if (lastInAListAndSmallerThenInB) {
                    a.add(b.get(j));
                } else {
                    a.add(i, b.get(j));
                    i++;
                }
                j++;
            }
        }
    }
}
