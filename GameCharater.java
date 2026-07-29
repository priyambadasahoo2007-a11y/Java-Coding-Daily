/*
You're creating a game character status system. The character has various status conditions that need to be checked using logical operators.

Start with these status conditions:
hasShield is true
hasWeapon is true
isInjured is false
hasPotion is false
Create these boolean conditions using logical operators:
canFight: True if character has weapon AND is not injured
needsHealing: True if character is injured OR doesn't have shield
isVulnerable: True if character doesn't have shield AND doesn't have weapon
shouldUsePotion: True if character has potion AND is injured
isReadyForBattle: True if character has weapon AND has shield AND is not injured

 */

public class GameCharacter {

    public static void main(String[] args) {
        boolean hasShield = true;
        boolean hasWeapon = true;
        boolean isInjured = false;
        boolean hasPotion = false;

        boolean canFight = hasWeapon && !isInjured;
        boolean needHealing = isInjured || !hasShield;
        boolean isVulnerable = !hasShield && !hasWeapon;
        boolean shouldUsePotion = hasPortion && isInjured;
        boolean isReadyForBattle = hasWeapon && hasShield && !isInjured;
        //Output

        System.out.println("GameSystem");
        System.out.println("----------");
        System.out.println(" CanFight : " + canFight);
        System.out.println("NeedHealing : " + needHealing);
        System.out.println("IsVulnerable : " + isVulnerable);
        System.out.println("ShouldUsePortion : " + shouldUsePortion);
        System.out.println("IsReadyForBattle : " + isReadyForBattle);
    }
}
