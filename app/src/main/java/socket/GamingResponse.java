package socket;

import model.Event;

/**
 * The class above is a subclass of the Response class. It models the response to a
 * request of type REQUEST_MOVE. The server responds with the opponent's last
 * move and if the game is still active (in the case when the opponent aborts the game
 * or disconnects).
 * @author Erick Aucancela
 * @author Christian Silvano
 */

public class GamingResponse extends Response{
    private int move;
    private boolean active;

    public GamingResponse() {
        super();
    }

    /**
     * A constructor that sets all attributes of this class. Must call the constructor of super class
     * @author Erick Aucancela
     * @param status variable
     * @param message variable
     * @param move variable
     * @param active variable
     */

   public GamingResponse(ResponseStatus status, String message, int move, boolean active) {
    super(status, message);
    this.move = move;
    this.active = active;
    }

    /**
     * Gives the variables a value, defined by the users
     * @author Erick Aucancela
     * @param move int
     */
    public void setMove(int move) {
        this.move = move;
    }

    /**
     * @author Erick Aucancela
     * @param active variable
     */

    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @author Erick Aucancela
     * @return move variable
     */
    public int getMove() {
        return move;
    }

    /**
     * @author Erick Aucancela
     * @return active variable
     */
    public boolean isActive() {
        return active;
    }




}
