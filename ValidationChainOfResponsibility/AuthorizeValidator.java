package ValidationChainOfResponsibility;

public class AuthorizeValidator implements RequestValidator {

    public RequestValidator nextValidator;

    public AuthorizeValidator(RequestValidator nextValidator) {
        this.nextValidator = nextValidator;
    }

    @Override
    public void validate(Request request) {
        // if (request.getToken() == null) {
        //     throw new RuntimeException("Token is required");
        // }
        this.nextValidator.validate(request);
    }
}
