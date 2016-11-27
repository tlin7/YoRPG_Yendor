public class Warrior extends Character{
    
    private String name;

    public Warrior(String newname ){
	name = newname;
	hp =125;
	maxhp =125;
	strength = 100;
	defense = 40;
	attackrating = 0.4;
	
    }
    protected String getName(){
	return name;
    }
	
    public void specialize(){
	defense -= 20;
	strength += 20;
    }

    public void normalize(){
	defense = 40;
	strength = 100;
    }
	
	public String about(){
	return "fighting monsters";
	}


}
