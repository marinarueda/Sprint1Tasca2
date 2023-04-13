package exercici1;

public class VentaBuidaException extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VentaBuidaException() {
        super("Para hacer una venta, primero debes seleccionar productos.");
    }
    
    public VentaBuidaException(String message) {
        super(message);
    }
    
    @Override
    public String getMessage() {
        return "VentaBuidaException: " + super.getMessage();
    }

	
    
   

}
