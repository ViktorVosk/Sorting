import Main.Sorting;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
@RunWith(Parameterized.class)
public class SortingParameterizedTest {
    private String expected;
    private File actual;
    public SortingParameterizedTest(String expected, String FilePath){
        this.expected = expected;
        this.actual = new File(FilePath);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"[1, 2, 5, 6, 10]", "src/test/resources/numbers1.txt"},
                {"[-19, -4, 0, 1, 2, 2, 4, 9, 17, 30]", "src/test/resources/numbers2.txt"},
                {"[-28, -23, -17, -10, -4, 0, 1]", "src/test/resources/numbers3.txt"},
                {"[3]", "src/test/resources/numbers4.txt"},
                {"[92, 1992, 2005, 103045]", "src/test/resources/numbers5.txt"},
        });
    }
    @Test
    public void testSort(){
        ArrayList<Integer> sorted = new ArrayList<>();
        try {
            File input = actual;
            Scanner in = new Scanner(input);
            int q = Sorting.setQuantity(in.nextInt());
            ArrayList<Integer> toSort = new ArrayList<>();
            while(in.hasNextInt()){
                int a = in.nextInt();
                toSort.add(a);
            }
           sorted = Sorting.sort(toSort);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Assert.assertEquals(expected, sorted.toString());
    }
}
