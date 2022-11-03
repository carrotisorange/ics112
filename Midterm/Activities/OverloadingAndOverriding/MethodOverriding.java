package OverloadingAndOverriding;
public class Mammal{
    
    public static void makeSound ()
    {
        //code here
    }

    class Dog extends Mammal
    {
        public static void makeSound()
        {
            //code here
        }
    }

    class Cat extends Mammal{
        public static void makeSound() 
        {
            // code here
        }
    }
}
