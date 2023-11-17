package aleatorio;

import java.util.Random;

public class CaraCruz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rand = new Random();
		
		int num = rand.nextInt(2);
		
		if(num == 0) {
			System.out.println("Cara");
		} else if(num==1) {
			System.out.println("Cruz");
		}else {
			System.out.println("fallo");
		}

	}

}
