package Sarcina2;

import java.text.DecimalFormat;

public class Model {
    private double INITIAL_BEFORE_VALUE = 100;
    private double CONV_EUR_USD = 1.08;
    private double CONV_USD_EUR = 1/CONV_EUR_USD;
    private double CONV_EUR_MDL = 19.33;
    private double CONV_MDL_EUR = 1/CONV_EUR_MDL;
    private double CONV_USD_MDL = 17.9;
    private double CONV_MDL_USD = 1/CONV_USD_MDL;
    private double INITAL_AFTER_VALUE = 100*CONV_EUR_USD;
    private double result;

    public double getINITIAL_BEFORE_VALUE() {
        return INITIAL_BEFORE_VALUE;
    }

    public double getINITAL_AFTER_VALUE() {
        return INITAL_AFTER_VALUE;
    }

    public String convert(String c2, String c1, double amount){
        if(c1.equalsIgnoreCase("EUR")){
            if(c2.equalsIgnoreCase("MDL")){
                result =  amount*CONV_EUR_MDL;
            } else if(c2.equalsIgnoreCase("USD")){
                result = amount*CONV_EUR_USD;
            } else {
                result = amount;
            }
        } else if(c1.equalsIgnoreCase("USD")){
            if(c2.equalsIgnoreCase("MDL")){
                result = amount*CONV_USD_MDL;
            } else if(c2.equalsIgnoreCase("EUR")){
                result = amount*CONV_USD_EUR;
            } else{
                result = amount;
            }
        } else{
            if(c2.equalsIgnoreCase("EUR")){
                result = amount*CONV_MDL_EUR;
            } else if (c2.equalsIgnoreCase("USD")) {
                result = amount*CONV_MDL_USD;
            } else{
                result = amount;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(result);
    }
    }

