package PracticaTest;

public class Main {

	public static void main(String[] args) {
		
		//ejecución estandar
		Game juego = new Game();
		
		//ejecución Mock
		
		
		boolean[][] testArray1 =	{{true ,  true ,  true ,  false ,  true ,  true ,  true	}, 
									{true ,  true ,  false  ,  false ,  false ,  true ,  true 	}, 
									{true ,  false ,  false  ,  false ,  false  ,  false ,  true 	}, 
									{false,  false ,  false ,  false ,  false ,  false  ,  false	}, 
									{true ,  false ,  false ,  false ,  false ,  false ,  true	}, 
									{true ,  true ,  false  ,  false ,  false ,  true ,  true	}, 
									{true ,  true ,  true ,  false ,  true  ,  true  ,  true }};
		
		String[] inputs = {"D 1 2","F 3 3"};
		
		Board b = new Board(testArray1);
		Player p = new Player();
		
		MockInput in = new MockInput(inputs);
		
		
		juego = new Game(p, b, in);
		
	}
	
}
