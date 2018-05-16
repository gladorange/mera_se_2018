package los.task1;

public class Person
{
  private String name;
  private String surname;
  private int year_birthday;
  private String country;
  private static long counter_objects_class = 0;
  
  public Person(String name, String surname, int year_birthday, String country)
  {
	  this.name = name;
	  this.surname = surname;
	  this.year_birthday = year_birthday;
	  this.country = country;
	  counter_objects_class ++;
  }
  
  public String getName()
  {
	  return this.name;
  }
  public void setName(String name)
  {
	  this.name = name;
  }
  public String getSurname()
  {
	  return this.surname;
  }
  public void setSurname(String surname)
  {
	  this.surname = surname;
  }
  public int getYearBirthday()
  {
	  return this.year_birthday;
  }
  public void setYearBirthday(int year_birthday)
  {
	  this.year_birthday = year_birthday;
  }
  public String getCountry()
  {
	  return this.country;
  }
  public void setCountry(String country)
  {
	  this.country = country;
  }
  public long getCounterObjectsClass()
  {
	  return this.counter_objects_class;
  }
}