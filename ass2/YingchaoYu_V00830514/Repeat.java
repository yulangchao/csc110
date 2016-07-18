//From textbook: Page 60, Question #5
public class Repeat {
 public static void method1() {
 System.out.println("This is the house that Jack built.");
 System.out.println();
 }

 public static void method2() {
 System.out.println("That lay in the house that Jack built.");
 System.out.println();
 }

 public static void method3() {
 System.out.println("That ate the malt");
 method2();
 }
  public static void method4() {
 System.out.println("That killed the rat,");
 method3();
 } 
 public static void method5() {
 System.out.println("That worried the cat,");
 method4();
 } 
 public static void method6() {
 System.out.println("That tossed the dog,");
 method5();
 }
  public static void method7() {
 System.out.println("That milked the cow with the crumpled horn,");
 method6();
 }
 public static void m1() {
 System.out.println("This is the malt");
 }
  public static void m2() {
 System.out.println("This is the rat,");
 } public static void m3() {
 System.out.println("This is the cat,");
 } public static void m4() {
 System.out.println("This is the dog,");
 } public static void m5() {
 System.out.println("This is the cow with the crumpled horn,");
 } public static void m6() {
 System.out.println("This is the maiden all forlorn");
 }
 public static void main(String[] args) {
 	
method1();
m1();
method2();
m2();
method3();
m3();
method4();
m4();
method5();
m5();
method6();
m6();
method7();
}
}