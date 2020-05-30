package com;

interface FlyBehavior {
    public void fly();
}
class TornadoFly implements FlyBehavior
{
    @Override
    public void fly() {
        System.out.println("Tornado Fly");
    }
}
class PegasusFly implements FlyBehavior
{
    public void fly()
    {
        System.out.println("Pegasus fly");
    }
}

