package packageOne;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class ClassTwo {
	
	  @Test
	  public void testTwo(){
		  
		  throw new SkipException("Intentionally skipped");
		  
	  }

}
