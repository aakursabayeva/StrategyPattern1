package com;
abstract class Fighter
    {
        FlyBehavior flyBehavior;
        JumpBehavior jumpBehavior;

        public Fighter(FlyBehavior kickBehavior,
                       JumpBehavior jumpBehavior)
        {
            this.jumpBehavior = jumpBehavior;
            this.flyBehavior = kickBehavior;
        }
        public void punch()
        {
            System.out.println("Default Punch");
        }
        public void kick()
        {
            // delegate to kick behavior
            flyBehavior.fly();
        }
        public void jump()
        {

            // delegate to jump behavior
            jumpBehavior.jump();
        }
        public void roll()
        {
            System.out.println("Default Roll");
        }
        public void setKickBehavior(FlyBehavior kickBehavior)
        {
            this.flyBehavior = flyBehavior;
        }
        public void setJumpBehavior(JumpBehavior jumpBehavior)
        {
            this.jumpBehavior = jumpBehavior;
        }
        public abstract void display();
    }


