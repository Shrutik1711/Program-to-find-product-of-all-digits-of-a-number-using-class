public class ProductOfDigits {
    private int number;
    
    public ProductOfDigits(int number) {
        this.number = number;
    }
    
    public int getProduct() {
        int product = 1;
        int digit;
        
        while (number > 0) {
            digit = number % 10;
            product *= digit;
            number /= 10;
        }
        
        return product;
    }
    
    public static void main(String[] args) {
        ProductOfDigits obj = new ProductOfDigits(123456);
        System.out.println(obj.getProduct());
    }
}
