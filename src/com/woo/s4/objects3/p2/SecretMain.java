package com.woo.s4.objects3.p2;

import com.woo.s4.objects3.p1.Secret;

public class SecretMain {

	public static void main(String[] args) {
		
		Secret secret = new Secret();
		com.woo.s4.objects3.p2.Secret secret2 = new com.woo.s4.objects3.p2.Secret();
		
		secret.money=1;
		
		secret.s1();
//		secret.s2(); // default는 같은 패키지 내에서만 사용 가능
		

		System.out.println(secret.point);
		Test test = new Test();
		System.out.println(test.point);
		
	}

}
