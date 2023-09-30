package Chapter01;

import java.util.Collections;
import java.util.Scanner;

class Parent {
int x = 100;

Parent() {
this(500);
}
Parent(int x) {
this.x = x;
}
int getX() {
return this.x;
}
}
class Child extends Parent {
int x = 1000;

Child() {
this(4000);
}

Child(int x) {
this.x = x;
}

int getX(int n){ 
return n;
}

}

public class Test {
public static void main(String[] args) {
Child obj = new Child();
System.out.println(obj.getX());
}
}