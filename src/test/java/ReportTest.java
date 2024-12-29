import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import reports.*;

public class ReportTest {

    @Test
    public void testGenerateFinancialReport() {
        FinancialReport financialReport = new FinancialReport();
        String result = financialReport.generate();
        assertEquals("Financial Report", result);
    }

    @Test
    public void testGenerateMarketingReport() {
        MarketingReport marketingReport = new MarketingReport();
        String result = marketingReport.generate();
        assertEquals("Marketing Report", result);
    }

    @Test
    public void testGenerateHRReport() {
        HRReport hrReport = new HRReport();
        String result = hrReport.generate();
        assertEquals("HR Report", result);
    }

    @Test
    public void testGetDataFinancialReport() {
        FinancialReport financialReport = new FinancialReport();
        String result = financialReport.getData();
        assertEquals("Get financial data", result);
    }

    @Test
    public void testGetDataMarketingReport() {
        MarketingReport marketingReport = new MarketingReport();
        String result = marketingReport.getData();
        assertEquals("Get marketing data", result);
    }

    @Test
    public void testGetDataHRReport() {
        HRReport hrReport = new HRReport();
        String result = hrReport.getData();
        assertEquals("Get HR data", result);
    }
}

