package graalSample;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String printNumberScript = "console.log(phone.number)";
        String callingScript = "phone.call('Someone')";

        Phone phone = new Phone(12345);

        Context jsContext = Context.create("js");

        jsContext.getBindings("js").putMember("phone",phone);

        runScript(printNumberScript,jsContext);
        runScript(callingScript,jsContext);

        runScript("console.log('Hello from the project')", jsContext);

    }

    private static Value runScript(String script, Context context) {

        return context.eval("js", script);
    }
}

