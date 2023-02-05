import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    private final StatsService service = new StatsService();

    @Test
    public void MinMonth() {

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 9;
        long actualMonth = service.minSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void MaxMonth() {

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 8;
        long actualMonth = service.maxSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void SumMonth() {

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 180;
        long actualMonth = service.sumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void AverageSumMonth() {

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 15;
        long actualMonth = service.averageSumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void LowAverageSumMonth() {

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 5;
        long actualMonth = service.lowAverageSumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void UpAverageSumMonth() {

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 5;
        long actualMonth = service.upAverageSumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}