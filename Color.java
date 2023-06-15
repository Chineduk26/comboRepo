class Color{

private String name,type;
private int num;
public Color(String name, String type, int num){
this.name = name;
this.type = type;
this.num = num;
}
public void setName(String name){
this.name = name;
}
public void setType(String type){
this.type = type;
}
public void setName(int num){
this.num = num;
}
public String getName(){
return name;
}
public String getType(){
return type;
}
public int getNum(){
return num;
}
 public  String printOut(){
return (" color name is " + this.getName() + " ,type of color " + this.getType() + "\nthe number of colors " + this.getNum());
}
public static void main(String[] args){
Color mall = new Color("pink","primary",30);
System.out.println(mall.printOut());

}
}