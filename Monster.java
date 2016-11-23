public class Monster extends Character{
    
    //attributes

    public Monster(){
	hp = 150;
	defense = 20;
	attackrating = 1;

	strength = (int)((Math.random() * 45) + 20);

    }
	
    public void specialize(){
    }

    public void normalize(){
    }
	
	public String about(){
	return "attacking people";
	}

}
