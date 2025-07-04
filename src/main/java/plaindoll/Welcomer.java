package plaindoll;

import java.util.Random;

public class Welcomer{
	private static final String[] HUNTER_PHRASES = {
        "The hunter lies in wait.",
        "May the hunter guide your path.",
        "A hunter never rests.",
        "Beware: the hunter is close."
    };

	public String sayWelcome() {
		return "Welcome home, good hunter. What is it your desire?";
	}

	public String sayFarewell() {
		return "Farewell, good hunter. May you find your worth in waking world.";
	}

	public String sayNeedGold(){
		return "Not enough gold";
	}

	public String saySome(){
		return "something in the way";
	}

	public String sayHunterRandom() {
        int idx = new Random().nextInt(HUNTER_PHRASES.length);
        return HUNTER_PHRASES[idx];
    }
}
