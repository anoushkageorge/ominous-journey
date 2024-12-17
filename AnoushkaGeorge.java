import java.util.*;
/**
 * Each player or team will create their own Player, this is only an example....
 * 
 * Your code MUST INCLUDE a move method with the following signature. To insure that, you must implement
 * the Player interface
 * 
 * You can create additional methods but must have the move method
 * 
 */
public class AnoushkaGeorge implements Player
{
    private static String name = "AnoushkaGeorge";

    /**
     * Implements a counter-strategy against the opponent.
     * 
     * @return      the move you want to play against opponent
     *              "r" - rock
     *              "p" - paper
     *              "s" - scissors
     *              anything else - forfeit the turn
     */
    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore)
    {
        // First move: Counter "r" (rock) with "p" (paper)
        if (myMoves.length == 0) {
            return "p";
        }
        
        // Subsequent moves: Counter "s" (scissors) with "r" (rock)
        return "r";
    }

    /**
     * Returns the name of the player
     * 
     * @return      the name of the player              
     */
    public String getName()
    {
        return name;
    }
}
