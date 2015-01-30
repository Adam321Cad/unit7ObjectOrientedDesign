/**
 * Write a description of class comboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class comboLock
{
    /** description of instance variable x (add comment for each instance variable) */
    private boolean open = false;
    private int lock1;
    private int lock2;
    private int lock3;
    private int turns = 0;
    private int locknum = 0;
    private boolean correct = true;

    public comboLock(int secret1, int secret2, int secret3)
    {
        lock1 = secret1;
        lock2 = secret2;
        lock3 = secret3;
    }

    public void turnClockwise(int ticks)
    {
        turns++;
        locknum+= ticks;
        if (locknum >39)
        {
            locknum = locknum - 40;
        }
        if(locknum <0)
        {
            locknum = locknum+40;
        }

        if(!(turns == 1 && locknum == lock1))
        {
            correct = false;
        } else if(!(turns == 3 && locknum == lock3))
        {
            correct = false;
        }

    }

    public void turnCounterClockwise(int ticks)
    {
        turns++;
        locknum = locknum - ticks;
        if (locknum >40)
        {
            locknum = locknum - 40;
        }
        if(locknum <0)
        {
            locknum = locknum+40;
        }

        if(!(turns == 2 && locknum == lock3))
        {
            correct = false;
        }

    }

    public boolean open()
    {
        if (turns == 3){
            return correct;
        }else{
            return false;
        }
    }

}