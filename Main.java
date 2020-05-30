package com;
public class Main {
    public static void main(String[] args) {
        // write your code here
        JumpBehavior shortJump = new ShortJump();
        JumpBehavior LongJump = new LongJump();
        FlyBehavior tornadoFly = new TornadoFly();
        Fighter pegasus = new Character.Pegasus(tornadoFly,shortJump);
        pegasus.display();

        // Test behaviors
        pegasus.punch();
        pegasus.kick();
        pegasus.jump();


        pegasus.setJumpBehavior(LongJump);
        pegasus.jump();
    }
}


