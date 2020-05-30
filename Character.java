package com;

public class Character {
    static class Pegasus extends Fighter
    {
        public Pegasus(FlyBehavior flyBehavior,
                   JumpBehavior jumpBehavior)
        {
            super(flyBehavior,jumpBehavior);
        }
        public void display()
        {
            System.out.println("Pegasus");
        }
    }
    class Trolls extends Fighter
    {
        public Trolls(FlyBehavior flyBehavior,
                   JumpBehavior jumpBehavior)
        {
            super(flyBehavior,jumpBehavior);
        }
        public void display()
        {
            System.out.println("Trolls");
        }
    }
    class Vampires extends Fighter
    {
        public Vampires(FlyBehavior flyBehavior,
                      JumpBehavior jumpBehavior)
        {
            super(flyBehavior,jumpBehavior);
        }
        public void display()
        {
            System.out.println("Vampires");
        }
    }
}
