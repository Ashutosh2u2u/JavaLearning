package encapsulationPrac;
class Author1{

private String name;
private String email;
private char gender;

  /* Author(){
   name="Rabindranath Tagore";
   email="rabi@gmail.com";
   gender='m';
   }
 */ 
   Author1(String name,String email,char gender){
   this.name=name;
   this.email=email;
   this.gender=gender;
   }
   String getauthor_name(){
   return name;
   }
   void display(){
   System.out.println("Author Details and email id :" +name+" and "+email+" and his gender is "+gender);
   }
}

class Book1{

private String name;
private String author;
private double price;
private int qtyInStock;

/*  Book(String name,String author,double price,int qtyInStock){
  this.name=name;
  this.author=author;
  this.price=price;
  this.qtyInStock=qtyInStock;
  }
*/
  void getName(String bname){
  name=bname;
  System.out.println("The name of book: "+name);
  }
  void getAuthor(String author_name){
  author=author_name;
  System.out.println("Author name : "+author);
  }
  void getPrice(double p){
  price=p;
  }
  void getQtyInStock(int a){
  qtyInStock=a;
  }
  double setprice(){
  return price;
  }
  int setQtyInStock(){
  return qtyInStock;
  }
}
class encap{
public static void main(String s[]){
Author1 a=new Author1("ANKKIT","ankit@gmail.com",'m');
Book1 b=new Book1();
b.getName("Java Programming");

String author_name=a.getauthor_name();
b.getAuthor(author_name);
b.getPrice(564);
b.getQtyInStock(5);
double price=b.setprice();
int qty=b.setQtyInStock();
System.out.println("Price : "+price+" Quantity : "+qty);
a.display();
}
}

