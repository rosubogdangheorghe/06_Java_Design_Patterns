package adapter;

public class Main {
    public static void main(String[] args) {

    ComputerGame computerGame = new ComputerGame("battle",PegiAgeRating.P3,
            50.00,1,
            100,8,2,2400.00);

    GameAdapter gameAdapter =new GameAdapter(computerGame);
        System.out.println(gameAdapter.getTitle());
        System.out.println(gameAdapter.getPegiAllowedAge());

    }
}
