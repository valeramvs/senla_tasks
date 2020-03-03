package second;

public class NewMath {
    /**
     * Method int gcd(int, int) calculates greatest common divisor of two numbers
     */
    public static int gcd(int a, int b)
    {
        while (b > 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Method int lcm(int, int) calculates least common multiple of two numbers
     */
    public static int lcm(int a, int b)
    {
        return a * (b / gcd(a, b));
    }
}
