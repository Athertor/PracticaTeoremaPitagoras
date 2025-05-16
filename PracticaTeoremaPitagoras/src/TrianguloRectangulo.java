
/**
 * 
 */
public class TrianguloRectangulo {
	private int a; //cateto
	private int b; //cateto
	private double c; //hipotenusa
	
	
	/****
	 * 
	 * Constructor por defecto
	 * 
	 */
	public  TrianguloRectangulo() {
		this.a=1;
		this.b=1;
	}
	/****
	 * Constructor con paramentros
	 * @param catetoA
	 * @param catetoB
	 */
	public TrianguloRectangulo(int catetoA, int catetoB) {
		if(catetoA<=0 ||b<=0) throw new IllegalArgumentException();
		this.a= catetoA;
		this.b=catetoB;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	/****
	 * metodo para calcular area
	 * @return
	 */
	
	public double area() {
		return ((this.a*this.b)/2);
	}
	
	/****
	 * metodo para calcular hipotenusa
	 * @return
	 */
	public double hipotenusa() {
		return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2) );
	}
	
	/****
	 * Método que calcula el perimetro
	 * @return
	 */
	
	public double perimetro() {
		return hipotenusa()+this.a+this.b;
	}
	
	public String toString() {
		String res="";
		res+= "El valor de a= "+this.a;
		res+= "El valor de b= "+this.b;
		res+= "El valor de c= "+this.c;
		return res;
		
	}
	
	
		
		
	
}
