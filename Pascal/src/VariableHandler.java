import java.util.HashMap;
import java.util.Map;

public class VariableHandler implements PascalHandler{

	Map<String, Integer> variaveisInt = new HashMap<String, Integer>();	
	
	@Override
	public void addline(String line) {
		line = line.replaceAll(" ", "");
		String[] parts = line.split(":");
		if (parts[1].startsWith("Integer")) {
			for (String varName : parts[0].split(",")) {
				variaveisInt.put(varName, 0);
			}
		}
		
	}

}
