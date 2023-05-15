package Aula11;

import java.util.List;

public class Customer {
    private static int customerId;
    private List<Double> meterReadings;

    public Customer(int iD, List<Double> meterReadings) {
        Customer.customerId = iD;
        this.meterReadings = meterReadings;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        Customer.customerId = customerId;
    }

    public List<Double> getMeterReadings() {
        return meterReadings;
    }

    public void setMeterReadings(List<Double> meterReadings) {
        this.meterReadings = meterReadings;
    }
}
