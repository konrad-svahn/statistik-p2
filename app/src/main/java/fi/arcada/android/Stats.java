package fi.arcada.android;

import android.view.View;


public class Stats {

    public static double Chi2(int a,int b, int c,int d) {
        int Ra = a;
        int Rb = b;
        int Rc = c;
        int Rd = d;
        int row1 = Ra + Rb;
        int row2 = Rc + Rd;
        int column1 = Ra + Rc;
        int column2 = Rb + Rd;
        int total = Ra + Rb + Rc + Rd;
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



    public static double pVarde(View view){
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
