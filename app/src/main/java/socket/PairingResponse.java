package socket; 
import model.User;
import model.Event;
import java.util.List;

public class PairingResponse extends Response {
    private List<User> availableUsers;
    private Event invitation;
    private Event invitationResponse;
  
  
  public PairingResponse() {
    super();
  }
  
  
  public PairingResponse(ResponseStatus status, String message, List<User> availableUsers, Event invitation, Event invitationResponse) {
    super(status, message);
    this.availableUsers = availableUsers;
    this.invitation = invitation;
    this.invitationResponse = invitationResponse;
  }


  public List<User> getAvailableUsers() {
    return availablesers;
  }

  public void setAvailableUsers(List<User> availableUsers) {
    this.availableUsers = availableUsers;
  }

  public Event getInvitation() {
    return invitation;
  }

  public void setInvitation (Event invitation) {
    this.invitation = invitation;
  }

  public Event getInvitationResponse() {
    return invitationResponse; 
  }

  public void setInvitationResponse (Event invitationResponse) {
    this.invitationResponse = invitationResponse;
  }
  
}
