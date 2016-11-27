public abstract class Character{
    protected int hp;
    protected int maxhp;
    protected int strength;
    protected int defense;
    protected double attackrating;
    protected static String healthbar;
    

    protected boolean isAlive(){
	if (hp <= 0){
	    return false;
	}
	return true;
    }

    protected int getDefense(){
	return defense;

    }
	
    protected String getName(){
	return "";
    }
	



    protected void lowerHP(int ssubtractThis){
	hp = hp - ssubtractThis;
    }

    protected int attack(Character toAttack){
	int damage = (int)(strength * attackrating) - toAttack.getDefense();
	if (damage < 0){ damage = 0;}
	toAttack.lowerHP(damage);
	return damage;
    }

    protected void setHealthbar(){
	if (hp >= maxhp*1.0){
	    healthbar =  "Health : 0 0 0 0 0 0 0 0 0 0 ";
	} else if (hp >= maxhp*0.9) {
	    healthbar =  "Health : 0 0 0 0 0 0 0 0 0 X ";
	} else if (hp >= maxhp*0.8) {
	    healthbar =  "Health : 0 0 0 0 0 0 0 0 X X ";
	} else if (hp >= maxhp*0.7) {
	    healthbar =  "Health : 0 0 0 0 0 0 0 X X X ";
	} else if (hp >= maxhp*0.6) {
	    healthbar =  "Health : 0 0 0 0 0 0 X X X X ";
	} else if (hp >= maxhp*0.5) {
	    healthbar =  "Health : 0 0 0 0 0 X X X X X ";
	} else if (hp >= maxhp*0.4) {
	    healthbar =  "Health : 0 0 0 0 X X X X X X ";
	} else if (hp >= maxhp*0.3) {
	    healthbar =  "Health : 0 0 0 X X X X X X X ";
	} else if (hp >= maxhp*0.2) {
	    healthbar =  "Health : 0 0 X X X X X X X X ";
	} else if (hp >= maxhp*0.1) {
	    healthbar =  "Health : 0 X X X X X X X X X ";
	} else  {
	    healthbar =  "Health : X X X X X X X X X X ";
	}
    }
	
	protected abstract String about();
    protected abstract void specialize();
    protected abstract void normalize();
   
}
