/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

/**
 *
 * @author flyer
 */
public class WrongWordNumberInName extends Exception
{
    private final int words;
    
    public WrongWordNumberInName(int words)
    {
        this.words = words;
    }
    
    @Override
    public String toString()
    {
        if(words < Employee.MIN_NAME_WORDS)
        {
            return "Exception: too few words in employee name. Two or three are allowed.";
        }
        else if(words > Employee.MAX_NAME_WORDS)
        {
            return "Exception: too many words in employee name. Two or three are allowed.";
        }
        else
        {
            return "No exception: allowed words number. Should be a programming error or intentional expections throwing in normal situation.";
        }
    }
}
