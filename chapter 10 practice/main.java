public class main
{

    public static void main(String[] args)
    {
        person p = new person("Matt");
        person p2 = new person("zdam");
        
        int num = p.compareTo(p2);
        if(num >0)
        {
            System.out.println("first person comes first");
        }else if(num <0)
        {
            System.out.println("second person comes first");
        }
        else{
            System.out.println("they are the same name");
        }
    }

}