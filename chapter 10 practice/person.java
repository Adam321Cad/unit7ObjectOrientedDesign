

/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class person implements Comparable<person>
{
    String name;
    
    public person(String n)
    {
        name = n;
    }
    
    public int compareTo(person other)
    {
        person otherperson = other;

        if(this.name.compareTo(otherperson.name) >0)
        {
            return -1;
        }else if(this.name.compareTo(otherperson.name) <0)
        {
            return 1;
        }
        else{
            return 0;
        }
        
    }

}
