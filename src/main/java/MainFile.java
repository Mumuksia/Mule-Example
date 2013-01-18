import org.mule.api.MuleContext;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationBuilder;
import org.mule.config.spring.SpringXmlConfigurationBuilder;
import org.mule.context.DefaultMuleContextFactory;

/**
 * User: y.zavada
 * Date: 18.01.13
 * Time: 14:41
 */
public class MainFile {

    public final static String[] configResources = {
            "mule-file.xml"};

    public static void main(String[] args) throws Exception {
        start(configResources);
        System.out.println("STARTED");
    }

    public static MuleContext start(final String... configResources)
            throws MuleException {

        ConfigurationBuilder builder = new SpringXmlConfigurationBuilder(
                configResources);
        DefaultMuleContextFactory muleContextFactory = new DefaultMuleContextFactory();
        MuleContext context = muleContextFactory.createMuleContext(builder);
        context.start();

        return context;
    }
}
