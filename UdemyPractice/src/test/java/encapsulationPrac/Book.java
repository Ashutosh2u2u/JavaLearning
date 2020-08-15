package  encapsulationPrac;
class Author {

	private String name;

	private String email;

	private char gender;

	Author(String name,String email,char gender)
	{

		this.name=name;

		this.email=email;

		this.gender=gender;

	}


	public void authorDetails()
	{

		System.out.println("Author Name: "+name+"\nEmail: "+email+"\nGender: "+gender);

	}

}

class Book
{

	private String name;

	private Author author;

	private double price;

	private int qtyInStock;


	Book(String name,Author author,double price,int qtyInStock)
	{

		this.name=name;

		this.author=author;

		this.price=price;

		this.qtyInStock=qtyInStock;

	}


	public String getName()
	{

		return name;

	}

	public double getPrice() 
	{

		return price;

	}
	/*
    public Author getAuthor() 
{
        return author.authorDetails();
    }
	 */


	public int getQtyInStock() 
	{

		return qtyInStock;

	}


	public void setPrice(int price)
	{

		this.price=price;

	}


	public void setQtyInStock(int qtyInStock)
	{

		this.qtyInStock=qtyInStock;

	}


	public static void main(String args[]) 
	{

		Author mAuthor=new Author("Edison","Edison@gmail.com",'m');

		Book aBook=new Book("DSP",mAuthor,350,5);

		System.out.println("Book name: "+aBook.getName()+"\nPrice: "+aBook.getPrice()+"\nQuantity: "+aBook.getQtyInStock());
		mAuthor.authorDetails();

		Author mAuthor1=new Author("Kandhaswamy","Kandhaswamy@gmail.com",'m');
		Book aBook1=new Book("Java",mAuthor1,400,15);
		System.out.println("\nBook name: "+aBook1.getName()+"\nPrice: "+aBook1.getPrice()+"\nQuantity: "+aBook1.getQtyInStock());
		mAuthor1.authorDetails();

	}


}