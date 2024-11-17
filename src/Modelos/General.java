package Modelos;

import com.google.gson.annotations.SerializedName;

public class General implements Comparable<General>{
    @SerializedName("base_code")
    public String base_code;
    @SerializedName("conversion_rates")
    public Rate conversion_rates;

    public General(String base_code, Rate conversion_rates) {
        this.base_code = base_code;
        this.conversion_rates = conversion_rates;
    }

    public String getBase_code() {
        return base_code;
    }
    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }
    public Rate getConversion_rates() {
        return conversion_rates;
    }
    public void setConversion_rates(Rate conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    @Override
    public int compareTo(General otroGeneral) {
        return this.getBase_code().compareTo(otroGeneral.getBase_code());
    }


}

