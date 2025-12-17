package True_Pay_Backend.Backend_True_Pay.Service.exceptions;

public class UserNotFoundException  extends RuntimeException{
    public UserNotFoundException(String message){
       super(message);
    }
}
