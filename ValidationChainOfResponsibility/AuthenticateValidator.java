package ValidationChainOfResponsibility;

public class AuthenticateValidator implements RequestValidator{

    private RequestValidator nextValidator;

    AuthenticateValidator(RequestValidator nextValidator){
        this.nextValidator = nextValidator;
    }

    @Override
    public void validate(Request request) {
        // do some validations
        this.nextValidator.validate(request);
    }
    
}
