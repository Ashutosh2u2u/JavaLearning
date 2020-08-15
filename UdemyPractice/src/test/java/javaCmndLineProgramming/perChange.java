package javaCmndLineProgramming;
class Stock{
String name;
String symbol;
double previousPrice;
double currentPrice;

   Stock(String name, String symbol, double previousPrice, double currentPrice )
   {
    this.name=name;
    this.symbol=symbol;
    this.previousPrice=previousPrice;
    this.currentPrice=currentPrice;
   }

   double getChangePercentage()
   {
   double percentageChange=((currentPrice-previousPrice)/previousPrice)*100;
   return percentageChange;
   }
}

public class perChange{
public static void main(String s[]){

 Stock obj1=new Stock("ANKIT","&&&",45,80);
 
 double change=obj1.getChangePercentage();
 System.out.println("The percentage change in the prices are : " +change);
}
}
