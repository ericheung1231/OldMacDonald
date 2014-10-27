import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OldMacDonald extends PApplet {

//your variable declarations here
public void setup() 
{   /*  
    Cow c = new Cow("cow", "moo");
    Chick ch = new Chick("chick", "cluck");
    Pig p = new Pig("pig", "oink");   
    System.out.println(c.getType() + " goes " + c.getSound());
    System.out.println(ch.getType() + " goes " + ch.getSound());
    System.out.println(p.getType() + " goes " + p.getSound());
    */
    Farm barn = new Farm();
    barn.animalSounds();
}
//declare classes and the interface below
class Farm 
{     
  private Animal[] aBunchOfAnimals = new Animal[3];    
  public Farm()    
  {       
   aBunchOfAnimals[0] = new NameCow("cow","Elsie","moo");          
   aBunchOfAnimals[1] = new Chick("chick","cheep","cluck");
   aBunchOfAnimals[2] = new Pig("pig","oink");    
  }     
  public void animalSounds()    
  {
    for (int nI=0; nI < aBunchOfAnimals.length; nI++) 
    {             
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound() );       
    }       
    System.out.println( "The cow is known as " + ((NameCow)aBunchOfAnimals[0]).getName() );    
  } 
}

interface Animal 
  {    
    public String getSound();        
    public String getType(); 
  }

class Cow implements Animal 
{     
  protected String myType;     
  protected String mySound;      
  public Cow(String type, String sound)    
  {         
     myType = type;         
     mySound = sound;     
  }     
  public Cow()    
  {         
     myType = "unknown";         
     mySound = "unknown";     
  }      
  public String getSound(){return mySound;}     
  public String getType(){return myType;} 
}

class Chick implements Animal 
{
  private int s;     
  private String myType;     
  private String mySound;
  public Chick(String type, String sound, String sound1)    
  {   
     int s = (int)(Math.random()*2);      
     myType = type;
     if (s == 0)
     {
      mySound = sound;
     }
     if (s == 1)
     {
      mySound = sound1;
     }      
  }      
  public Chick(String type, String sound)    
  {         
     myType = type;         
     mySound = sound;     
  }     
  public Chick()    
  {         
     myType = "unknown";         
     mySound = "unknown";     
  }      
  public String getSound(){return mySound;}     
  public String getType(){return myType;} 

}

class Pig implements Animal 
{     
  private String myType;     
  private String mySound;      
  public Pig(String type, String sound)    
  {         
     myType = type;         
     mySound = sound;     
  }     
  public Pig()    
  {         
     myType = "unknown";         
     mySound = "unknown";     
  }      
  public String getSound(){return mySound;}     
  public String getType(){return myType;} 
}

class NameCow extends Cow 
{     
  protected String myType;     
  protected String mySound;
  private String myName;
  public NameCow(String type, String name, String sound)
  {
    myName = name;
    myType = type;         
    mySound = sound;
  }
  public NameCow()
  {
    myName = "unknown";
    myType = "unknown";         
    mySound = "unknown";
  }      
  public String getSound(){return mySound;}     
  public String getType(){return myType;}
  public String getName(){return myName;} 
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OldMacDonald" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
