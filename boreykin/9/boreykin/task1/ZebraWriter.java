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
public class ZebraWriter  extends AnimalWriter<Zebra>
{
    @Override
    protected void writeSpecificFields(Zebra a, BufferedWriter w) throws IOException 
    {
        w.write(String.format("числоПолос:\"%d\"", a.getStripeNumber()));
    }
}
