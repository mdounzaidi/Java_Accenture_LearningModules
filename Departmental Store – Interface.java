public interface BonusPoints {
double calculateBonusPoints();
}
//===================================//
public class CustomerDetails implements BonusPoints, DoorDelivery{
private String customerName;
private String phoneNumber;
private String streetName;
private double billAmount;
private int distance;
public CustomerDetails(String customerName, String phoneNumber, String
streetName, double billAmount, int distance){
this.customerName=customerName;
this.phoneNumber=phoneNumber;
this.streetName=streetName;
this.billAmount=billAmount;
this.distance=distance;
}
public String getCustomerName(){
return customerName;
}
public void setCustomerName(String customerName){
this.customerName=customerName;
}
public String getPhoneNumber(){
return phoneNumber;
}
public void setPhoneNumber(String phoneNumber){
this.phoneNumber=phoneNumber;
}
public String getStreetName(){
return streetName;
}
public void setStreetName(String streetName){
this.streetName=streetName;
}
public void setBillAmount(double billAmount){
 this.billAmount=billAmount;
}
public double getBillAmount(){
 return billAmount;
}
public double calculateBonusPoints(){
 if(billAmount>=250){
 return billAmount/10;
 }
 return 0.0;
}
public double deliveryCharge(){
 if(distance>=25)
 return distance*8;
 if(distance>=15)
 return distance*5;
 return distance*2;
}
}
//===================================//
public interface DoorDelivery {
 double deliveryCharge();
}
//===================================//
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter the customer name");
 String customerName=sc.nextLine();
 System.out.println("Enter the phone number");
 String phoneNumber=sc.nextLine();
 System.out.println("Enter the street name");
 String streetName=sc.nextLine();
 System.out.println("Enter the bill amount");
 double billAmount=sc.nextDouble();
 System.out.println("Enter the distance");
 int distance=sc.nextInt();
 CustomerDetails obj=new CustomerDetails(customerName,phoneNumber,streetName,billAmount,distance);
 System.out.println("Customer name "+obj.getCustomerName());
 System.out.println("Phone number "+obj.getPhoneNumber());
 System.out.println("Street name "+obj.getStreetName());
 System.out.println("Bonus points "+obj.calculateBonusPoints());
 System.out.println("Delivery charge "+obj.deliveryCharge());
 }
}


