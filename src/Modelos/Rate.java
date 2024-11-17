package Modelos;

import com.google.gson.annotations.SerializedName;



public class Rate implements Comparable<Rate> {
    @SerializedName("ARS")
    public double ARS;
    @SerializedName("BRL")
    public double BRL;
    @SerializedName("COP")
    public double COP;
    @SerializedName("MXN")
    public double MXN;

    public Rate(double ARS, double BRL,double PLC , double MXN) {
        this.ARS = ARS;
        this.BRL = BRL;
        this.COP = PLC;
        this.MXN = MXN;

    }

    public double getARS() {
        return ARS;
    }
    public void setARS(double ARS) {
        this.ARS = ARS;
    }
    public double getBRL() {
        return BRL;
    }
    public void setBRL(double BRL) {
        this.BRL = BRL;
    }

    public double getCOP() {
        return COP;
    }

    public void setCOP(double COP) {
        this.COP = COP;
    }

    public double getMXN() {
        return MXN;
    }
    public void setMXN(double MXN) {
        this.MXN = MXN;
    }

    @Override
    public int compareTo(Rate otroRate) {
        return 0;
    }
}

