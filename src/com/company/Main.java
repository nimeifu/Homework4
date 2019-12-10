package com.company;

public class Main {

    public static void main(String[] args) {
		/* Declare and initialize two vectors. */
    	Vector test=new Vector(4,5,7);
    	Vector test1=new Vector(5,4,8);

    	System.out.println("The length of vector is: "+test.VectorLength());//The use of VectorLength() method.
    	System.out.println("The scalar product of two vectors is: "+test.ScalarProduct(test1));//The use of ScalarProduct method.
	    System.out.println("The product of two vectors is: "+test.VectorProduct(test1));//The use of VectorProduct method.
	    System.out.println("The cosine of angle between two vectors is: "+test.cosOfAngles(test1));//The use of cosOfAngles method.
	    System.out.println(test.sumAndDifferentOfVectors(test1));//The use of sumAndDifferentOfVectors method.
	    System.out.println(test.toString());//THe use of toString method.

		/*
			Create a vector array with 5 random vectors in ti.
		 */
	    Vector[] randomVectors=Vector.generatedVectors(5);
		for (Vector i:randomVectors) {
			System.out.println(i);
		}
    }
}
