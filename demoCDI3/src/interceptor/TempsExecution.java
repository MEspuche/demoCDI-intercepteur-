package interceptor;

import java.util.Date;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.jboss.logging.Logger;

@Interceptor
@Temps
public class TempsExecution {
private static Logger LOGGER = Logger.getLogger(Auditor.class.getName());
	
	@AroundInvoke
	public Object time(InvocationContext context) throws Exception {
		System.out.println("AVANT");
		Date d1 = new Date();
		Object retVal = context.proceed();
		
		System.out.println("APRES");
		Date d2 = new Date();
		
		long time1 = d1.getTime();
		long time2 = d2.getTime();
		long diff = time2-time1;
		System.out.println("temps de traitement = " +  diff + " ms");
		
		return retVal;
	}
}
