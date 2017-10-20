class NamedCow extends Cow
{     
  private String myName;
  public NamedCow(String name, String type, String sound) {      
    myType = type;         
    mySound = sound;   
    myName = name;
  }     
  public NamedCow() {  

    myName = "unknown";
  }      
  public String getName() 
  {
    return myName;
  }
}