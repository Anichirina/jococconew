import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.StatisticsService;

class StatisticsServiceTest {


    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {3, 5, 8, 4, 5, 12, 8, 6, 11, 11, 12};
        long expected = 12;

        var actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

}
