package model;

/**
*    The User class models a user that plays the TicTacToe game. Objects of this class
*    will be used for first-time registration and login. The username attribute will be used
*    to uniquely identify every player in the game. This model class maps to the database
*    table ‘User’, with all class attributes having corresponding table columns.    
*    All attributes of the class are encapsulated.
*    @author Erick Aucancela
*    @author Christian Silvano
*/    
public class User {

    private String username;
    private String password;
    private String displayName;
    private boolean online;

    /**
     * A default constructor for the class
     * @author Erick Aucancela
     */

    public User() {
        this.username = "user1";
        this.password = " 1Pass";
        this.displayName = " 1DP";
        this.online = false;
    }

    /**
     * Constructor intended to set all attributes of this class to input values
     * @param username string
     * @param password string
     * @param displayName string
     * @param online boolean
     * @author Erick Aucancela
     */

    public User(String username, String password, String displayName, boolean online) {
        this.username = username;
        this.password = password;
        this.displayName = displayName;
        this.online = online;
    }

    /**
     * Sets value to variables.
     * @author Erick Aucancela
     * @param username string
     */

    public void setUsername (String username) {
        this.username = username;
    }

    /**
     * Assigns a value to parameters once user begins the code.
     * @author Erick Aucancela
     * @param password string
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Assigns a value to parameters once user begins the code.
     * @author Erick Aucancela
     * @param displayName string
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Assigns a value to parameters once user begins the code.
     * @author Erick Aucancela
     * @param online boolean
     */

    public void setOnline(boolean online) {
        this.online = online;
    }

    /**
     * Assigns a value to parameters once user begins the code.
     * @author Erick Aucancela
     * @return username
     */

    public String getUsername() {
        return username;
    }

    /**
     * return value of the variable
     * @author Erick Aucancela
     * @return password
     */

    public String getPassword() {
        return password;
    }

    /**
     * return value of the variable
     * @author Erick Aucancela
     * @return displayName
     */

    public String getDisplayName() {
        return displayName;
    }

    /**
     * return value of the variable
     * @author Erick Aucancela
     * @return online
     */

    public boolean isOnline() {
        return online;
    }

    /**
     * Implementing the equals method to verify if two objects under the eventID name are equal to one another
     * @author Erick Aucancela
     * @param other for equals method
     * @return true or false depending on if equals method is correct
     */
    
    @Override
    public boolean equals(Object other) {
        try {
            User otherUser = (User) other;
            return this.username.equals(other.getUsername());
        } catch (ClassCastException e) {
            return false;
        }
    }
}
