void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#F51B1B);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#0E760D);
    rect(176, 103, 12, 32);
    if(mousePressed){
      fill(#C4C4C4);
    ellipse(100,200,100,100);
    }
}
