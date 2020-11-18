public class BeerSongP11 {
	public static void main (String[] args){
		int beerNum = 99;
		String word = "garrafas";
	
	while (beerNum > 0) {
		
	System.out.println(beerNum + " " + word + " de cerveja na parede");
	System.out.println(beerNum + " " + word + " de cerveja.");
	System.out.println("Derrume um.");
	System.out.println("Passe adiante.");
	beerNum = beerNum - 1;

        if (beerNum == 1) {
			word = "garrafa";
		}
        
	if (beerNum > 0) {
		System.out.println(beerNum + " " + word + " de cerveja na parede");
		} else {
		System.out.println("Não há mais garrafas de cerveja na parede");
		}
	}
	}
}
