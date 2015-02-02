//GeonHee Ko
//Broken GPS

package brokenGps;

import java.util.Random;

public class Gps {
public enum Direction {
NORTH, EAST, WEST, SOUTH;
}
public static void main(String[] args) {
// TODO Auto-generated method stub
// the number of turns based on 60 miles per hour for an hour drive
// GPS randomly generates the new direction every 5 minutes
// 60/5=12
final int TURNS = 12;
Random rand = new Random();
// 0=north, 1= east, 2=south, 3=west int direction;
Direction aDirection = Direction.NORTH;
int x =0;
int y=0;

for (int i = 0; i < TURNS; i++) {
	
aDirection=aDirection.values()[rand.nextInt(4)];
System.out.println(aDirection);

switch (aDirection) {
case NORTH:
y +=1;
break;
case EAST:
x+=1;
break;
case WEST:
x-=1;
break;
case SOUTH:
y-=1;
break;

}
}
System.out.println("You are located at coordinates ("+x+", "+y+")");
}
}


