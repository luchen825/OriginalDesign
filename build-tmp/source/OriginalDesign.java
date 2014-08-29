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

public class OriginalDesign extends PApplet {

//Lucy C., APCS, Mods 6-7, Original Design
int x = 30;
int y = 0;
int x1 = 30;
int y1 = 0;
int x2 = 30;
int y2 = 0;
int x3 = 30;
int y3 = 0;
int z = 0;
int x4 = 0;
int y4 = 0;
int x5 = 0;
int y5 = 0;
int x6 = 0;
int y6 = 0;
public void setup()
{
  size(600,300);
  background(127);
  noStroke();
}
public void draw()
{
  bottomBun();
  meat();
  cheese();
  tomato();
  lettuce();
  topBun();
  bite();
}
public void topBun()
{
  fill(232,116,70);
  arc(300,110,395,150,PI,2*PI);
  arc(300,110,395,25,0,PI);
}
public void lettuce()
{
  fill(0,255,0);
  bezier(105,100,110,150,230,150,230,103);
  bezier(210,103,180,150,315,170,320,103);
  bezier(300,103,285,170,425,150,410,103);
  bezier(380,103,390,150,500,140,495,100);
}
public void tomato()
{
  fill(255,0,0);
  rect(130,130,170,30,20);
  rect(300,130,170,30,20);
  arc(215,155,165,20,0,PI);
  arc(385,155,165,20,0,PI);
}
public void cheese()
{
  fill(242,234,68);
  triangle(300,190,140,150,460,150);
}
public void meat()
{
  fill(113,50,10);
  rect(120,160,360,35,20);
  arc(300,190,350,40,0,PI);
}
public void bottomBun()
{
  fill(232,116,70);
  rect(100,195,400,40,20);
  arc(300,230,390,35,0,PI);
}
public void bite()
{
  fill(127);
  ellipse(x,y,110,110);
  ellipse(x,y1,110,110);
  ellipse(x1,y,130,130);
  ellipse(x1,y2,120,120);
  ellipse(x2,y,120,120);
  ellipse(x2,y3,100,100);
  ellipse(x2,z,110,110);
  ellipse(x3,y,110,110);
  ellipse(x4,y4,130,130);
  ellipse(x5,y,130,130);
  ellipse(x5,y5,130,130);
  ellipse(x6,y,160,160);
  ellipse(x6,y6,170,170);
}
public void mousePressed()
{
  if(x < 130)
  {
    x = x + 100;
    y = y + 80;
  }
  else if(x < 230 && y1 < 190)
  {
    y1 = y1 + 190;
  }
  else if(x1 < 150)
  {
    x1 = x1 + 135;
  }
  else if(y2 < 190)
  {
    y2 = y2 + 190;
  }
  else if(x2 < 210)
  {
    x2 = x2 + 210;
  }
  else if(y3 < 160)
  {
    y3 = y3 + 160;
  }
  else if(z < 220)
  {
    z = z + 220;
  }
  else if(x3 < 270)
  {
    x3 = x3 + 270;
  }
  else if(x4 < 300 && y4 < 190)
  {
    x4 = x4 + 300;
    y4 = y4 + 190;
  }
  else if(x5 < 365)
  {
    x5 = x5 + 365;
  }
  else if(y5 < 200)
  {
    y5 = y5 + 200;
  }
  else if(x6 < 450)
  {
    x6 = x6 + 450;
  }
  else if(y6 < 200)
  {
    y6 = y6 + 200;
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
