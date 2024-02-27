import java.util.ArrayList;

public class CaloriesCalculatorTest {
    public static void main(String[] args) {

        NewYearGoodie tart = new NewYearGoodie("Pineapple Tarts", 82.5, 20);
        NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa", 115, 28);
        NewYearGoodie loveLetters = new NewYearGoodie("Love Letters", 56.5, 13);

        System.out.println("Pineapple Tarts more sinful than Bak Kwa:" + tart.isMoreSinful(bakKwa));
        System.out.println("");

        ArrayList<NewYearGoodie> goodieArr = new ArrayList<>();
        goodieArr.add(tart);
        goodieArr.add(bakKwa);
        goodieArr.add(loveLetters);

        for (NewYearGoodie goodie : goodieArr) {
            System.out.printf("%s (calories per gram) :%.2f%n", goodie.getName(), goodie.getCaloriesPerGram());
        }
        System.out.println("");

        CaloriesCalculator calCalc = new CaloriesCalculator();
        calCalc.addNewYearGoodie(tart, 2);
        calCalc.addNewYearGoodie(bakKwa, 3);
        calCalc.addNewYearGoodie(loveLetters, 5);
        System.out.printf("Total Calories :%.2f", calCalc.getTotalCalories());
        System.out.println("Most sinful goodie: " + calCalc.getMostSinfulGoodie().getName());

    }
}

/* NOTE TO SELF

    printf

*/
