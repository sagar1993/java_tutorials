package commons_chain;


import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ChainBase;
import org.apache.commons.chain.impl.ContextBase;


/*The chain framework is used to execute number of commands*/


public class ProfileCheckTest  {

   public static void main(String [] argv) {

        Context context = new ContextBase();
        Command command = new ProfileCheck();
        Command command1 = new ProfileCheck();
        
        ChainBase c = new ChainBase();
        c.addCommand(command);
        c.addCommand(command1);
        try {
            c.execute(context);
        } catch (Exception e) {

        }

        Profile profile = (Profile) context.get(Profile.PROFILE_KEY);
        
        System.out.println(profile.PROFILE_KEY);

    }
}   