package base;

public class MyInteger {
	
int value;
	
	MyInteger (int newValue){
		value = newValue;
	}
	
	public int getValue() {
		return value;
	}
	
	public static boolean isEven(int n){
		for (int f=2; f< n / 2; f++) {
			if (n % f == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isOdd(int n){
		for (int f=2; f< n / 2; f++) {
			if (n % f == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime(int n) {
		for (int f=2; f< n / 2; f++) {
			if (n % f == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean isEven(MyInteger n) {
		return n.isEven();
	}
	
	public static boolean isOdd(MyInteger n) {
		return n.isOdd();
	}
	
	public static boolean isPrime(MyInteger n) {
		return n.isPrime();
	}
	
	public boolean isEven() {
		return (this.value%2 == 0);
	}
	
	public boolean isOdd() {
		return (this.value%2==0);
	}
	
	public boolean isPrime () {
		return (this.value%2==0);
	}
	
	public boolean equals (int n) {
		return (value == n);
	}
	
	public boolean equals(MyInteger n) {
		return equals (n.getValue());
	}

	public boolean isEquals(int i) {
		return false;
	}
}
	
	
		