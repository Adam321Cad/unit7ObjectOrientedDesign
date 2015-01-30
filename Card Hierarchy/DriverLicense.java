
/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String ExpirationYear;

    /**
     * Default constructor for objects of class DriverLicense
     */
    public DriverLicense(String n, String id)
    {  
        super(n);
        ExpirationYear = id;
    }



}
