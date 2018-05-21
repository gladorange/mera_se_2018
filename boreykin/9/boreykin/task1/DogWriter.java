/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author flyer
 */
public class DogWriter extends AnimalWriter<Dog>
{
    @Override
    protected void writeSpecificFields(Dog a, BufferedWriter w) throws IOException 
    {
        w.write(String.format("громкостьЛая:\"%d\"", a.getBarkVolume()));
    }
}
