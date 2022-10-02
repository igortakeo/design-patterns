public class Application {
    public static void main(String args[]){
        
        //Round Peg fits in Round Hole
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(4);

        if(hole.fits(peg)){
            System.out.println("The round peg fits in role");
        }

        SquarePeg sqPeg = new SquarePeg(4);
        // hole.fits(sqPeg); Not compile

        SquarePegAdapter sqPegAdapter = new SquarePegAdapter(sqPeg);
        if(hole.fits(sqPegAdapter)){
            System.out.println("The square peg fits in role");
        }
        else {
            System.out.println("The square peg doesn't fits in role");
        }

    }
}