
public class EX02 {

	public static void main(String[] args) {
//		int[] arr = { 10, 20, 1 };
//		
//		int max = arr[0]; // 첫 번째 배열의 값을 변수에 대입
//		
//		for (int num : arr) {
//            if (num > max) {
//                max = num;
//            }
//        }
//		
//		System.out.println("최대값은 " + max + "입니다");
		
		
		int num1 = -6;
		int num2 = 6;
		int num3 = 10;
		
		int max = num1;
		
		if(max < num2) {
			max = num2;
		}
		
		if(max < num3) {
			max = num3;
		}
		System.out.println("최대값은 " + max + "입니다");

	}

}
