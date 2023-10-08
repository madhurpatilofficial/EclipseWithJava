class Animal{
	String breed;
	int age;
	
	public Animal(String breed, int age){
		this.breed = breed;
		this.age = age;
	}
}
class Dog extends Animal{
	String bark;
	public Dog(String breed, int age, String bark){
		super(breed, age);
		this.bark = bark;
	}
	public String toString() {
		return breed + age + bark;
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		Dog d = new Dog("PUG ", 5, " Bhau Bhau..");
		System.out.println(d);
	}
}
