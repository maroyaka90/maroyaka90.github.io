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

public class Hollow_box extends PApplet {

int[] data = {5, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250}; //Declare data
int value = 0;
int keyIndex;
float x, y, z;
float dim = 50.0f;
float a;                 // Angle of rotation
float offset = PI/24.0f;  // Angle offset between boxes
int num = 12;            // Number of boxes
boolean test;

public void setup(){

}
  
public void keyPressed()
{ // If the key is between 'A'(65) to 'Z' and 'a' to 'z'(122)
  if((key >= 'A' && key <= 'Z') || (key >= 'a' && key <= 'z')) {
    
    if(key <= 'Z') {
      keyIndex = key-'A';
    } else {
      keyIndex = key-'a';
    }
  }
  }

{
  if((value == 0)){
     value = keyIndex;
     redraw();
    } else {
      value = keyIndex;
    redraw();}
  }
      
public void draw(){

background(keyIndex - 615);

y = y + 0.8f;
z = z + 30.8f;

if (x < 1) {
test = true;}

if (test == true){
  x = x + .15f;}

if (x > 25) {
test = false;}

if (test == false){
  x = x - .15f;}




  for (int i = 1; i < x; i++) {
    pushMatrix();
    translate(250, 250, 0); 
rotateY(cos(x/365));
rotateX(sin(y/441));
fill(data[i]);
noFill();
box(54+data[i]);
popMatrix();
}

  for (int i = 1; i < x; i++) {
    pushMatrix();
    translate(250, 250, 93); 
rotateY(cos(x/401));
rotateX(sin(y/631));
fill(data[i]);
noFill();
box(58+data[i]);
popMatrix();
}

  for (int i = 1; i < x; i++) {
    pushMatrix();
    translate(250, 250, -800); 
rotateY(cos(x/542));
rotateX(tan(y/737));
fill(data[i]);
noFill();
box(118+data[i]);
popMatrix();
}
  }
  public void settings() { 
size (500, 500, P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Hollow_box" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
