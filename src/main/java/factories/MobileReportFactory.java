package factories;

import reports.*;

public class MobileReportFactory implements ReportFactory {
    public FinancialReport createFinancialReport() {
        return new FinancialReport();
    }
    public MarketingReport createMarketingReport() {
        return new MarketingReport();
    }
    public HRReport createHRReport() {
        return new HRReport();
    }
}