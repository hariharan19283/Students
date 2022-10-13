public class Main3 {
public static void main(String[] args)
void printDivide(int num, int den)
 throws ArithmeticException {
 System.out.println(num / den);
}
void createArray(int size) {
if (size < 0)
        throw IllegalArgumentException("Size must be non-negative " + size);
    this.array = new int[size];
}
}