import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer[] luckyNumbers = { 25, 7, 1992, 2, 5, 1, 9 };

        System.out.println("Array de inteiros original: " + Arrays.asList(luckyNumbers));

        List<Integer> luckyList = MyOwnLists.asListedSorted(luckyNumbers, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }

        });

        System.out.println("Lista de inteiros ordenada gerada: " + luckyList);

        String[] catBreeds = { "Sphynx", "Bengal", "British Shorthair", "Russian Blue", "Persa", "Savannah",
                "Ashera", "Maine Coon" };

        System.out.println("Array de strings original: " + Arrays.asList(catBreeds));

        List<String> catBreedsList = MyOwnLists.asListedSorted(catBreeds, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        });

        System.out.println("Lista de strings ordenada gerada: " + catBreedsList);

    }

}
