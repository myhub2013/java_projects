/** Testing program  */
public class TestRecursiveMethods {
  public static void main(String[] args) {
    RecursiveMethodsInterface recursiveTest = new Recursive();

    System.out.println("sumTo 5: " + recursiveTest.sumTo(5));
    System.out.println("sumTo -6: " + recursiveTest.sumTo(-6));

    recursiveTest.printNumbers(0);
    System.out.println();
    recursiveTest.printNumbers(1);
    System.out.println();
    recursiveTest.printNumbers(2);
    System.out.println();
    recursiveTest.printNumbers(3);
    System.out.println();
   recursiveTest.printNumbers(4);
    System.out.println();
    recursiveTest.printNumbers(8);
    System.out.println();
     recursiveTest.printNumbers(15);
    System.out.println();
    recursiveTest.printNumbers(30);
    System.out.println();

    System.out.println(recursiveTest.toDecimal(""));
    System.out.println(recursiveTest.toDecimal("0"));
    System.out.println(recursiveTest.toDecimal("1"));
    System.out.println(recursiveTest.toDecimal("10"));
    System.out.println(recursiveTest.toDecimal("11"));
    System.out.println(recursiveTest.toDecimal("1000"));
    System.out.println(recursiveTest.toDecimal("1011"));
    System.out.println(recursiveTest.toDecimal("111000"));
    System.out.println(recursiveTest.toDecimal("1010010"));

    System.out.println(recursiveTest.phraseAnagramCheck("John Kerry", "horny jerk"));
    System.out.println(recursiveTest.phraseAnagramCheck("something", "thingsome"));
    System.out.println(recursiveTest.phraseAnagramCheck("she loves me", "she loves me not"));
    System.out.println(recursiveTest.phraseAnagramCheck("abcdefg", "aabbccddeeffgg"));
    System.out.println(recursiveTest.phraseAnagramCheck("unempty", ""));

    System.out.println("zigzag 1");
    recursiveTest.printZigZag(1, 0);
    System.out.println("zigzag 2");
    recursiveTest.printZigZag(2, 0);
    System.out.println("zigzag 3");
   recursiveTest.printZigZag(3, 0);
    System.out.println("zigzag 4");
    recursiveTest.printZigZag(4, 0);
     System.out.println("zigzag 6");
    recursiveTest.printZigZag(6, 0);
    System.out.println("zigzag 8");
    recursiveTest.printZigZag(8, 0);
    System.out.println("zigzag 12");
    recursiveTest.printZigZag(12, 0);
    System.out.println("zigzag 16");
    recursiveTest.printZigZag(16, 0);
    System.out.println("zigzag 35");
    recursiveTest.printZigZag(35, 0);
  }
}

