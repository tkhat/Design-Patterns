package Adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{
    Random generator = new Random();

    @Override
    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy tank does " + attackDamage + " Damage");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy tank moves " + movement + " distance");
    }

    @Override
    public void assignDriver(String driverName) {

        System.out.println(driverName + " is driving the tank ");

    }
}
