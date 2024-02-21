// public class Titik {
//     private double absis;
//     private double ordinat;
//     static double counterTitik;

//     Titik(){
//         absis = 0;
//         ordinat = 0;
//         counterTitik++;
//     }

//     public void setAbsis(double newAbsis){
//         this.absis = newAbsis;
//     }

//     public void setOrdinat(double newOrdinat){
//         this.ordinat = newOrdinat;
//     }

//     public double getAbsis(){
//         return absis;
//     }

//     public double getOrdinat(){
//         return ordinat;
//     }

//     public static double getCounterTitik(){
//         return counterTitik;
//     }

//     public void display(){
//         System.out.println("Absis : " + this.absis);
//         System.out.println("Ordinat : " + this.ordinat);
//         // System.out.println("Counter titik : " + this.counterTitik);
//     }

// }

public class Titik {
	float absis;
	float ordinat;
	static float counterTitik;

	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	void setAbsis(float a){
		absis = a;
	}
	
	void setOrdinat(float o){
		ordinat = o;
	}

	float getAbsis(){
		return absis;
	}

	float getOrdinat(){
		return ordinat;
	}

	static float getCounterTitik(){
		return counterTitik;
	}
}