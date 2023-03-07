package hopur_5.library_system;

public class UserOrBookDoesNotExistException extends Exception{
    public UserOrBookDoesNotExistException(String message) {
        super(message);
    }
}
