void setup(){

      PImage face = loadImage("face.png");
      size(800,600);
    face.resize(width,height);
    background(face);}
void draw(){
  if (mouseX>365){
    mouseX=365;}
    if (mouseX<335){
    mouseX=335;}
        if (mouseY>285){
    mouseY=285;}
        if (mouseY<255){
    mouseY=255;}
  fill(250,250,250);
  ellipse(350, 270, 50, 50);
  fill(0,0,0);
  ellipse(mouseX,mouseY, 5, 5);
  fill(250,250,250);
  ellipse(410, 270, 50, 50);
  fill(0,0,0);
  ellipse(mouseX+65,mouseY, 5, 5);

}