public class Summoner extends Character{
    
    private String name;

    public Summoner(String newname ){
	name = newname;
	hp =125;
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
	return "summoning demons";
	}



}
