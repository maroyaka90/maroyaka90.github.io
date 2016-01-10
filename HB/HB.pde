int rotate;
void setup(){
size(500, 400, OPENGL);

}
void draw(){
background(255);
translate(300, 200, -313); 
rotate = millis()/500;
rotateY(rotate);
noFill();
box(100);

translate(258, 130, 0); 
box(rotate);


box(84);
translate(1167, 84, 141); 
rotateX(rotate/18);
}