package Game;

/**
 * Created by 48089748z on 08/03/16.
 */
public class Warrior
{
    Weapon weapon;
    public Warrior(){}
    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }
    public void whatWeaponHeWearing()
    {
        weapon.whatWeaponHeWearing();
    }


}
