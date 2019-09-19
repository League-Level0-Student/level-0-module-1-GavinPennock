void setup(){
  size(500,500);
 PImage face=loadImage("download.jpg");
 face.resize(width,height);
 image(face, 0,0);
  
  

  

}

void draw(){
  
  fill(mouseX, mouseY, 0);
  ellipse(290,60,30,15);
  ellipse(335,90,30,15);
  fill(#000000);
  ellipse(290,60,5,5);
  ellipse(335,90,5,5);
  println(mouseX + "    " + mouseY);
}
