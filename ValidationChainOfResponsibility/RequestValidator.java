// Chain of Responsibility Pattern
// Identifier -> Chain of events of validation/logging/some checks
// Design pattern -> 
// 1. Make an interface (RequestValidator) with function validate()
// 2. In base classes of RequestValidator, add a variable of type RequestValidator (stores nextValidator)
// 3. In validate() function of each base class, call this.nextValidator.validate(request)


package ValidationChainOfResponsibility;

public interface RequestValidator {

    void validate(Request request);
}
