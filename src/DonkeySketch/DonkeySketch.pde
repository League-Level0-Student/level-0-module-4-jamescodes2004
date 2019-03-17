PImage donkey;
PImage tail;
void setup(){
  donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
size(612, 344);     //replace width, height with your picture's dimensions
tail.resize(210, 210);}     //replace width, height with your tail's dimensions
void draw(){
background (250,0,0);

rect(0, 0, 30, 30);

 if (dist(0, 0, mouseX, mouseY) < 30){
   background (donkey);
   rect(0, 60, 160, 150);
}
if (mousePressed){
image(tail, mouseX-100, mouseY-100);
}

}