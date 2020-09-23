import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PascalReader {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		VariableHandler v = new VariableHandler();
		CommandHandler c = new CommandHandler();
		PascalHandler h = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader("/Users/netuh/eclipse-workspace-PLP/Pascal/src/PascalCode.pas"))) {
		    for(String line; (line = br.readLine()) != null; ) {
		        System.out.println(line);
		        if (line.startsWith("Program")) {
		        	continue;
		        } else if (line.startsWith("Var")) {
		        	h = v;
		        	continue;
		        } else if (line.startsWith("Begin")) {
		        	h = c;
		        	continue;
		        }
		        //tratar outros casos
		        
		        h.addline(line);
		        
		    }
		
		}
	}
}
