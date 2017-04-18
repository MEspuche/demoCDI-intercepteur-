package interceptor;

import java.util.Scanner;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.jboss.logging.Logger;

@Interceptor
@Loged
public class Login {
	
private static Logger LOGGER = Logger.getLogger(Auditor.class.getName());
	
	@AroundInvoke
	public Object securite(InvocationContext context) throws Exception {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez le login");
		String login = clavier.next();
		System.out.println("Entrer le mdp");
		String mdp = clavier.next();
		if (login.equalsIgnoreCase("root") && mdp.equalsIgnoreCase("root"))
		{
			System.out.println("CONNECTE");
			return context.proceed();
		}
		else
		{
			System.out.println("ERREUR DE CONNEXION");
			return null;
		}
		
		

}
}
