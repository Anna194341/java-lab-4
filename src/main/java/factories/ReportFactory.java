package factories;

import reports.*;

public interface ReportFactory {
    FinancialReport createFinancialReport();
    MarketingReport createMarketingReport();
    HRReport createHRReport();
}
