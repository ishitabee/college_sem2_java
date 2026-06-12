//4. Java Program to define a class, describe its constructor,overload the Constructors and instantiate its object

class Person {
	String name;
	int age;

	//Default Constructor
	Person(){
		this.name="Unknown";
		this.age=0;
	}

	//Parameterised Constructor
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	
	//Method to display details
	void display(){
		System.out.println("Name: " + name + ",Age: " + age);
	}
}

class ConstructorOverloading{
	public static void main(String[] args){
		Person p1= new Person(); 		//calls default constructor
		Person p2= new Person("Ishita",19);	//calls parameterized constructor

		p1.display();
		p2.display();
	}
}