
void setup() {
    size(500,500);
    fill(#8B7E50);
    ellipse(250,250,300,300);
    fill(#F03924);
    ellipse(250,250,275,275);
    fill(#EDE69C);
    ellipse(250,250,250,250);
    PImage pepperoni = loadImage("pep.jpg");
    pepperoni.resize(25,25);
image(pepperoni, 310, 150);
image(pepperoni, 330, 200);
image(pepperoni, 125, 275);
image(pepperoni, 250, 250);
image(pepperoni, 225, 300);
image(pepperoni, 200, 200);
PImage fly = loadImage("fly.jpeg");
    fly.resize(25,25);
    image(fly, 200, 360);
    image(fly, 300, 345);
    image(fly, 350, 200);
    image(fly, 240, 150);

}
void draw() {
  if(mousePressed){
    PImage fly = loadImage("fly.jpeg");
    fly.resize(25,25);
  image(fly, 340, 300);
  }
    
}
