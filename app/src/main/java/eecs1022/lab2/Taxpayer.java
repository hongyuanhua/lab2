package eecs1022.lab2;

/**
 * Created by user on 1/26/18.
 */
public class Taxpayer
{
    private String name;
    private double income;
    private String status;
    private double first=0;
    private double second = 0;
    private double third = 0;
    private double fourth = 0;

    private boolean valid = true;


    public Taxpayer(String name,String income,String stutas){
        this.name =name;
        if(Double.parseDouble(income)>=0){
            this.income = Double.parseDouble(income);}
        else{
            this.income = 1;
            this.valid = false;
        }
        this.status = status;}


public void getTax()
{
    if (this.status.equals("single"))
    {
        if (this.income >= 0 && this.income <8350)
        {
            this.first = 0.1 * this.income;
        } else if (this.income >= 8350 && this.income < 33950)
        {
            this.first = 0.1 * 8350;
            this.second = (this.income - 8350) * 0.15;
        } else if (this.income >= 33950 && this.income <= 82250)
        {
            this.first = 0.1 * 8350;
            this.second = (33950 - 8350) * 0.15;
            this.third = (this.income - 33950) * 0.25;

        } else
        {
            this.first = 0.1 * 8350;
            this.second = (33950 - 8350) * 0.15;
            this.third = (82250 - 33950) * 0.25;
            this.fourth = (this.income - 82250) * 0.3;
        }
    } else if (this.status.equals("married"))
    {
        if (this.income >= 0 && this.income <16700)
        {
            this.first = 0.1 * this.income;
        } else if (this.income >= 8350 && this.income < 67900)
        {
            this.first = 0.1 * 8350;
            this.second = (this.income - 16700) * 0.15;
        } else if (this.income >= 33950 && this.income <137050)
        {
            this.first = 0.1 * 8350;
            this.second = (67900 - 16700) * 0.15;
            this.third = (this.income - 679000) * 0.25;

        } else
        {
            this.first = 0.1 * 8350;
            this.second = (67900 - 16700) * 0.15;
            this.third = (137050 - 67900) * 0.25;
            this.fourth = (this.income - 137050) * 0.3;
        }
    } else
    {
        if (this.income >= 0 && this.income < 11950)
        {
            this.first = 0.1 * this.income;
        } else if (this.income >= 11950 && this.income < 45500)
        {
            this.first = 0.1 * 11950;
            this.second = (this.income - 8350) * 0.15;
        } else if (this.income >= 45500 && this.income < 117450)
        {
            this.first = 0.1 * 11950;
            this.second = (45500 - 11950) * 0.15;
            this.third = (this.income - 45500) * 0.25;

        } else
        {
            this.first = 0.1 * 11950;
            this.second = (45500 - 11950) * 0.15;
            this.third = (117450 - 45500) * 0.25;
            this.fourth = (this.income - 117450) * 0.3;
        }
    }
}
    public String getResult(){
        getTax();
        String tax = String.format("%.2",this.first+this.second+this.third+this.fourth);
        String s;
        if(this.valid){
            s =this.name +",your tax due is $"+tax;
            s+="\nCalculation is cased on the scheme of"+this.status+"Filling:";
            s+="\nPartI: $"+String.format("%.2f",this.first);
            s+="\nPartII: $"+String.format("%.2f",this.second);
            s+="\nPartIII: $"+String.format("%.2f",this.third);
            s+="\nPartIV: $"+String.format("%.2f",this.fourth);


        }else{
            s = "invalid result!";
        }
        return s;
    }
}

