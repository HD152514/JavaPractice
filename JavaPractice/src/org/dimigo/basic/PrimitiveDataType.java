/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 *  org.dimigo.basic
 *    |_ PrimitiveDataType
 *
 * 1. 개요 : 아이유
 * 2. 작성일 : 2017. 3. 9.
 * </pre> 
 *
 * @author : abcde
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "아이유";
		boolean isMale = false;
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.println("이름 : "+name);
		if(isMale){
		System.out.println("\n성별 : 남자\n");
		}
		else
		{System.out.println("\n성별 : 여자\n");}
		System.out.println("나이 : "+age+"세\n");
		System.out.println("키 : "+height+"cm\n");
		System.out.println("몸무게 : "+weight+"kg\n");
		System.out.println("혈액형 : "+bloodType+"형\n");
	}

}
