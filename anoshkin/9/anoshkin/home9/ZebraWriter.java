package anoshkin.home9;

import anoshkin.home8.Zebra;


public class ZebraWriter extends AnimalWriter<Zebra> {
    @Override
    public String[] getAnimalDescription(Zebra zebra) {
        String [] out = new String[2];
        out[0] = zebra.getName();
        out[1] = Integer.toString(zebra.getStripes());
        return out;
    }
}
