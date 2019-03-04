public class Kolmnurk {
    
	double a, b, c, h;
	
	public Kolmnurk(double kylg1, double kylg2, double kylg3, double kyrgus){
        a = kylg1;
		b = kylg2;
		c = kylg3;
		h = kyrgus;
    }
    
	public double pindala(){
        return ((a*h)/2);       
    }
    
	public double ymbermoot(){
        return (a+b+c);
    }
    
	public String toString(){
        return "Kolmnurga ümbermõõt on " + ymbermoot() + ", ja pindala on "+ pindala();
    }
}