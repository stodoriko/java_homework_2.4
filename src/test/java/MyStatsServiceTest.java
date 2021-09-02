import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class MyStatsServiceTest {

    @Test
    public void shouldGetSalesSum() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualSum = service.allSalesSum(arr);
        System.out.println("Сумма всех продаж: " + actualSum);
        int expectedSum = 180;
        assertEquals(expectedSum, actualSum);
        System.out.println("Успех! Ожидаемое и фактическое значения равны!");
        System.out.println("----------");
    }


    @Test
    public void shouldGetAvgSalesSum() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSum = service.avgSum(arr);
        System.out.println("Средняя сумма всех продаж: " + averageSum);
        System.out.println("----------");
    }


    @Test
    public void shouldGetMaxSalesMonth() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxMonth = service.maxSalesMonth(arr);
        System.out.println("Лучший месяц по продажам: " + maxMonth);
        System.out.println("----------");
    }


    @Test
    public void shouldGetMinSalesMonth() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int numberMonth = service.minSalesMonth(arr);
        System.out.println("Худший месяц по продажам: " + numberMonth);
        System.out.println("----------");
    }


    @Test
    public void shouldGetBelowAvgMonth() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int numberMonths = service.belowAvgMonths(arr);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + numberMonths);
        System.out.println("----------");
    }

    
    @Test
    public void shouldGetAboveAvgMonth() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int numberMonths = service.aboveAvgMonths(arr);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + numberMonths);
        System.out.println("----------");
    }
}
