import java.util.Random;

public class OTP {
    static String sendOTP(int length) {
        String number = "0123456789";
        Random rdm = new Random();
        char otp[] = new char[length];
        for(int i=0;i<length;i++) {
            otp[i]=number.charAt(rdm.nextInt(number.length()));	
        }
        String a=new String(otp);
        return a;
	}
	public static void main (String args[]){
		System.out.println("Genrated otp is:");
		System.out.println(sendOTP(5));
		
	}
}
