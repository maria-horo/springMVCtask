package solid;

class Marker {
	String name;
	String color;
	int year;
	int price;

	public Marker (String name, String color, int year, int price) {
		this.name = name;
		this.color = color;
		this.year = year;
		this.price = price;
	}
}
class Invoice{
	private Marker marker;
	private int quantity;
	public Invoice(Marker marker, int quantity) {
		this.marker = marker;
		this.quantity = quantity;
	}
	public int calculateTotal() {
		int price = ((marker.price) + this.quantity);
		return price;
	}
	public void printInvoice() {
		//print invoice
	}
	public void saveToDB() {
		//save the data into DB
	}
}

class InvoiceDao {
	Invoice invoice;
	public  InvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}
	public void saveToDB() {
		//save the data into DB
	}
}

class InvoicePrinter{
	private Invoice invoice;
	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}
	public void print() {
		//print the invoice
	}
}

interface InvoiceDao{
	public void save(Invoice invoice);
}
class DatabaseInvoiceDao implements InvoiceDao{
	@Override
	public void save(Invoice invoice) {
		//save to DB
	}
}
class FileInvoiceDao implements InvoiceDao{
	@Override
	public void save(Invoice invoice) {
		//save to file
	}
}
//O
interface Bike{
	void turnOnEngine();
	void accelerate();
}
class MotoCycle implements Bike{
	boolean isEngineOn;
	int speed;

	@Override
	public void turnOnEngine() {
		//turn on the engine
		isEngineOn = true;
	}

	@Override
	public void accelerate() {
		//increase the speed
		speed = speed + 10;
	}	
}
class Bicycle implements Bike{

	@Override
	public void turnOnEngine() {
		throw new AssertionError("there is no engine.");
	}

	@Override
	public void accelerate() {
		//do something		
	}
}
//I

interface RestaurantEmployee{
	void washDishes();
	void serveCustomers();
	void cookFood();
}
class Waiter implements RestaurantEmployee{

	@Override
	public void washDishes() {
		//not my job	
	}

	@Override
	public void serveCustomers() {
		//yes and here is my implementation
		System.out.println("serving the customer");	
	}

	@Override
	public void cookFood() {
		//not my job
	}	
}

interface WaiterInterface {
	void serveCustomers();
	void takeOrder();
}
interface chefInterface {
	void cookFood();
	void decideMenu();
}

class Waiter implements WaiterInterface {
	@Override
	public void serveCustomers() {
		System.out.println("serving the customer");	
	}
	@Override
	public void takeOrder() {
		System.out.println("taking orders");
	}
}

//d
interface Mouse{
	void wiredMouse();
	void bluetoothMouse();
}
interface Keyboard{
	void wiredKeyboard();
	void bluetoothKeyboard();
}
class MacBook{
	private final WiredKeyboard keyboard;
	private final WiredMouse mouse;
	
	public MacBook(WiredKeyboard keyboard, WiredMouse mouse) {
		keyboard = new WiredKeyboard();
		mouse = new WiredMouse();
	}
}

class MacBook{
	private final Keyboard keyboard;
	private final Mouse mouse;
	
	public MacBook(Keyboard keyboard, Mouse mouse) {
		this.keyboard = keyboard();
		this.mouse = mouse();
	}
}