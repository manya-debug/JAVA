import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String all = upper + lower + numbers;
        String s1 = "";
        Random random = new Random();
	int r1 = random.nextInt(26); 
	int r2= random.nextInt(10);
        s1 = s1 + upper.substring(r1,r1+2)+ lower.substring(r1,r1+4)+ numbers.substring(r2,r2+2);         	
	System.out.println("Generated Password: " + s1);
    }
}