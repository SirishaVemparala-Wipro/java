package com.wipro.java.java8;

//1. Single abstract method
//@FunctionalInterface
//default or/and static  

@FunctionalInterface
interface Shape
{
  // only 1 abstract method
  float area(float radius);

  // default method
  default float circumference (float radius)
  {
    
    return 2*(float)Math.PI*radius;
  }
  
  //  default method
  default String description()
  {
   
    return "Geometric shape";
  }
  
  //  static method
  static String type()
  {
      return "2 Dimensional shape";
  }

  //	static method
  static String uses()
  {
      return "Used in Geometry,physics,engineering";
  }
}

class DefaultMethod implements Shape{
		@Override
	
	  public float area(float radius)
	    {
	        return (float)Math.PI*radius*radius;
	    }
	  
	  public static void main(String args[])
	    {
	    	DefaultMethod circle = new DefaultMethod();
	        float radius=7.0f;
	        System.out.println("Radius: " + radius);
	        System.out.println("Area: " + circle.area(radius));
	        System.out.println("Circumference: " + circle.circumference(radius));
	        System.out.println("Description: " + circle.description());

	        // Calling Static Methods from Interface
	        System.out.println("Type: " + Shape.type());
	        System.out.println("Uses: " + Shape.uses());
	    }
 
}

