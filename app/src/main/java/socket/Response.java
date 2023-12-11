package socket;

/**
*    The Response class above models all the server's response to a client request. The
*    server creates an object of this class to communicate back to the client. Likewise,
*    the client always expects an object of this class (or its subclasses) when receiving a
*    response from the server. It contains information about the request status, either
*    success or failure. It also contains a string message that can be displayed to the user with more
*    information about the success or failure of the request.
*    @author Erick Aucancela
*    @author Christian Silvano
*/

public class Response {
    
    public enum ResponseStatus {
        SUCCESS,
        FAILURE
    }

    private ResponseStatus status;
    private String message;

    /**
     * A default constructor for the class.
     * @author Erick Aucancela
     * @author Christian Silvano
     */

    public Response() {
    }

    /**
     *  A constructor that sets all attributes of this class
     * @author Erick Aucancela
     * @author Christian Silvano
     * @param status response
     * @param message string
     */

    public Response(ResponseStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    /**
     * Provide all attributes with a value, determined by user's gameplay
     * @author Christian Silvano
     * @author Erick Aucancela
     * @param status set value
     */
    
    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    /**
     * Provide all attributes with a value, determined by user's gameplay
     * @author Christian Silvano
     * @author Erick Aucancela
     * @param message string
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Provide all attributes with a value, determined by user's gameplay
     * @author Christian Silvano
     * @author Erick Aucancela
     * @return status
     */
    public ResponseStatus getStatus() {
        return status;
    }

    /**
     * Provide all attributes with a value, determined by user's gameplay
     * @author Christian Silvano
     * @author Erick Aucancela
     * @return message
     */
    public String getMessage() {
        return message;
    }
}
