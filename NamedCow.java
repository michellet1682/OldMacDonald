class NamedCow extends Cow
{
  private String myCowname;
  public NamedCow(String type, String name, String sound){
    myType = type;
    myCowname = name;
    mySound = sound;
  }
  public String getName(){
    return myCowname;
  }
}
