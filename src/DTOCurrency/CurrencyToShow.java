package DTOCurrency;

import com.google.gson.annotations.SerializedName;

public class CurrencyToShow implements Comparable<CurrencyToShow>{

      @SerializedName("conversion_result")
      private double result;



      public CurrencyToShow(double result) {
        this.result = result;
      }

    public CurrencyToShow() {
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Su cantidad en la divisa es = "+result;
    }

    @Override
    public int compareTo(CurrencyToShow o) {
        return 0;
    }
}
