package com;
class calculate{
    double simpleInterest(double principal, double rateOfInterest, double timeInYears){
        double si=(principal*rateOfInterest*timeInYears)/100;
        return si;
    }
    double compoundInterest(double principal, double rateOfInterest, double timeInYears){
        double ci=principal*Math.pow((1+(rateOfInterest/100)),timeInYears);
        return ci;
    }
}