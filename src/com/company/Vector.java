package com.company;

public class Vector {
    private final double x,y,z; //Declare three coordinates of a vector.
    /*
    Constructor of Vector, initialize x, y and z coordinates of
     */
    public Vector(double x,double y,double z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    /*
    This method calculates the length of vector.
    @return a double which represents the length of vector.
     */
    public double VectorLength()
    {
        return (Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)));
    }

    /*
    This method calculates the scalar product of two vectors
    @param anotherVector a vector with x,y, and z coordinates.
    @return a double which represents the scalar product of two vectors.
     */
    public double ScalarProduct(Vector anotherVector)
    {
        return(this.x*anotherVector.x+this.y*anotherVector.y+this.z*anotherVector.z);
    }
    /*
    This method calculates the vector product of two vectors.
    @param anotherVector a vector with x,y and z coordinates.
    @return a double which represents the vector product of two vectors.
     */
    public Vector VectorProduct(Vector anotherVector)
    {
        Vector VectorProduct=new Vector((this.y*anotherVector.z-this.z*anotherVector.y), (this.z*anotherVector.x-this.x*anotherVector.z),(this.x*anotherVector.y-this.y*anotherVector.x));
        return VectorProduct;
    }

    /*
    This method calculates the cosine of the angle between vector a and vector b.
    @param a a vector with x,y and z coordinates.
    @param b a vector with x,y,and z coordinates.
    @return a double represents the cosine of angle between two vectors.
     */
    public double cosOfAngles(Vector b)
    {
        return (this.ScalarProduct(b)/(this.VectorLength()*b.VectorLength()));
    }

    /*
    This method calculates the sum and difference between two vectors.
    @param anotherVector a vector with x,y and z coordinates.
    @return a String which contains the sum and different of two vectors.

     */
    public String sumAndDifferentOfVectors(Vector anotherVector)
    {
        Vector Sum=new Vector((this.x+anotherVector.x),(this.y+anotherVector.y),(this.z+anotherVector.z));
        Vector Different=new Vector((this.x-anotherVector.x),(this.y-anotherVector.y),(this.z-anotherVector.z));
        return ("The sum of these vectors is: "+Sum+"\nThe different between them is: "+Different);
    }

    /*
    This method returns a String that concatenate the word "vector" with x,y and z coordinates.
    @return the word "vector" with three coordinates.
     */
    public String toString()
    {
        return "Vector"+" "+"x: "+this.x+" y: "+this.y+" z: "+this.z;
    }

    /*This static method generated random values of three coordinates of vectors and put vectors in a vector array.
    @param n an int that determine the size of the array.
    @return a vector array that contains vectors.
    */
    public static Vector[] generatedVectors(int n)
    {
        double x,y,z;
        Vector[] randomVector=new Vector[n];
        for(int i=0;i<randomVector.length;i++)
        {
             x=Math.random()*10;
             y=Math.random()*10;
             z=Math.random()*10;
            randomVector[i]=new Vector(x,y,z);
        }
        return randomVector;

    }
}
