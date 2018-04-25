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
public class ArtistExcersize 
{
    public static void main(String [] args)
    {
        Artist [] artists = { 
            new Artist("Иван", "Иванов", Artist.Style.NEOCLASSIC),
            new Artist("Сидор", Artist.Style.REALISM),
            new Artist("Тихон","Тихонов")
        };
                
        artists[0].setBirthYear(1990);
        artists[1].setBirthYear(1970);
        artists[1].setLastName("Сидоров");
        artists[2].setBirthYear(1995);
        
        for(Artist a:artists)
        {
            a.printInfo();
        }
    }
}
