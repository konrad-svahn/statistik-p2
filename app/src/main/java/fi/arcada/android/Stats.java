package fi.arcada.android;

import android.view.View;


public class Stats {

    public static double Chi2(int a,int b, int c,int d) {
        double row1 = a + b;
        double row2 = c + d;
        double column1 = a + c;
        double column2 = b + d;
        double total = a + b + c + d;
        double väntatvärdeRa = (row1 * column1)/total;
        double väntatvärdeRb = (row1 * column2)/total;
        double väntatvärdeRc = (row2 * column1)/total;
        double väntatvärdeRd = (row2 * column2)/total;
        double chi2a = Math.pow(a - väntatvärdeRa ,2)/väntatvärdeRa;
        double chi2b = Math.pow(b - väntatvärdeRb,2)/väntatvärdeRb;
        double chi2c = Math.pow(c - väntatvärdeRc,2)/väntatvärdeRc;
        double chi2d = Math.pow(d - väntatvärdeRd,2)/väntatvärdeRd;
        double chi2 = chi2a + chi2b + chi2c + chi2d;
        return chi2;}



    public static double pVarde(double chi2){
        double pVarde;
        if(chi2 < 0.0000393){
            pVarde=1.0;
        }else if(chi2 >= 0.0000393 && chi2 < 0.000982){
            pVarde=0.995;
        }else if(chi2 >= 0.000982 && chi2 < 1.642){
            pVarde=0.975;
        }else if(chi2 >= 1.642 && chi2 < 2.706){
            pVarde=0.200;
        }else if(chi2 >= 2.706 && chi2 < 3.841){
            pVarde=0.100;
        }else if(chi2 >= 3.841 && chi2 < 5.024){
            pVarde=0.050;
        }else if(chi2 >= 5.024 && chi2 < 5.412){
            pVarde=0.025;
        }else if(chi2 >= 5.412 && chi2 < 6.635){
            pVarde=0.020;
        }else if(chi2 >= 6.635 && chi2 < 7.879){
            pVarde=0.010;
        }else if(chi2 >= 7.879 && chi2 < 9.550){
            pVarde=0.005;
        }else if(chi2 >= 9.550 && chi2 < 10.828) {
            pVarde=0.001;
        }else if(chi2 >= 10.828){
            pVarde=0.0;
        }else { pVarde=1.0;}
        return pVarde;
    }

    public static double andel1(int a, int c){
        double column1 = a + c;
        double numYes = a/column1;
        return numYes*100;
    }
    public static double andel2(int b, int d){
        double column2 = b + d;
        double numYes = b/column2;
        return numYes*100;
    }
}
