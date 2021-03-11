package fi.arcada.android;

import android.view.View;


public class Stats {

    public static double Chi2(int a,int b, int c,int d) {
        double Ra = a;
        double Rb = b;
        double Rc = c;
        double Rd = d;
        double row1 = Ra + Rb;
        double row2 = Rc + Rd;
        double column1 = Ra + Rc;
        double column2 = Rb + Rd;
        double total = Ra + Rb + Rc + Rd;
        double väntatvärdeRa = (row1 + column1)/total;
        double väntatvärdeRb = (row1 + column2)/total;
        double väntatvärdeRc = (row2 + column1)/total;
        double väntatvärdeRd = (row2 + column2)/total;
        double chi2a = Math.pow(Ra - väntatvärdeRa,2)/väntatvärdeRa;
        double chi2b = Math.pow(Rb - väntatvärdeRb,2)/väntatvärdeRb;
        double chi2c = Math.pow(Rc - väntatvärdeRc,2)/väntatvärdeRc;
        double chi2d = Math.pow(Rd - väntatvärdeRd,2)/väntatvärdeRd;
        double chi2 = chi2a + chi2b + chi2c + chi2d;
        return chi2;}



    public static double pVarde(double chi2){
        double pVarde;
        //if(){

        //}else if(){

        //}else if(){

        //}else if(){

        //}else if(){

        //}else if(){

        //}else if(){

        //}else if(){

        //}else if(){

        //}else if(){

        //}else if() {

        //}
        return 0;
    }
}
