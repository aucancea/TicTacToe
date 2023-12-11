package socket;

import model.*;

/**
 * The Request class above models all the requests a client will send to the server. The
 * client must create an object of this class to communicate with the server. Likewise,
 * the server always expects an object of this class when receiving a request from the
 * client. The client must specify the type of request by setting it to one of the
 * enumeration values specified in RequestType and optional data when needed.
 * @author Erick Aucancela
 * @author Christian Silvano
 */

public class Request {

    public enum RequestType {
        LOGIN,
        REGISTER,
        UPDATE_PAIRING,
        SEND_INVITATION,
        ACCEPT_INVITATION,
        DECLINE_INVITATION,
        ACKNOWLEDGE_RESPONSE,
        REQUEST_MOVE,
        SEND_MOVE,
        ABORT_GAME,
        COMPLETE_GAME
    }

    private RequestType type;
    private String data;


    /**
     * A default constructor for the class
     * @author Erick Aucancela
     * @author Christian Silvano
     */
    public Request() {
        this.type = RequestType.LOGIN;
        this.data = "Data 1";
    }

    /**
     * A default constructor for the class
     * @author Erick Aucancela
     * @param type request
     * @param data string
     */
    
    public Request(RequestType type, String data) {
        this.type = type;
        this.data = data;
    }

    /**
     * Assigns a value to parameters once user begins the code.
     * @author Erick Aucancela
     * @author Christian Silvano
     * @return data
     */

    public String getData() {
        return data;
    }

    /**
     * Assigns a value to parameters once user begins the code.
     * @author Erick Aucancela
     * @author Christian Silvano
     * @return type
     */
    public RequestType getRequestType() {
        return type;
    }

    /**
     * Assigns a value to parameters once user begins the code.
     * @author Erick Aucancela
     * @author Christian Silvano
     * @param data string
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Assigns a value to parameters once user begins the code.
     * @author Erick Aucancela
     * @author Christian Silvano
     * @param type request
     */

    public void setType(RequestType type) {
        this.type = type;
    }
}
