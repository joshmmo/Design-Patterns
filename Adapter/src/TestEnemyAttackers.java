import java.util.ArrayList;

public class TestEnemyAttackers {
    public static void main(String[] args) {
        ArrayList<EnemyAttacker> attackers = new ArrayList();

        EnemyTank rx7Tank = new EnemyTank();
        EnemyRobot fredTheRobot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        attackers.add(rx7Tank);
        attackers.add(robotAdapter);

        for (EnemyAttacker attacker : attackers) {
            System.out.println("---Attacker's Turn---");
            attacker.assignDriver("Frank");
            attacker.driveForward();
            attacker.fireWeapon();
            System.out.println();
        }
    }
}
