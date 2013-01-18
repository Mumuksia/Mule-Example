package jug;

import org.mule.DefaultMuleMessage;
import org.mule.RequestContext;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.transport.PropertyScope;

import javax.jws.WebParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.rmi.RemoteException;
import java.util.Map;

/**
 * User: y.zavada
 * Date: 17.01.13
 * Time: 17:01
 */
@Path("/JUG")
public class JugFunService implements JugFunInterface {

    private final String ENDPOINT_NAME_XML = "processXML.inbound";
    private final String ENDPOINT_NAME_HTML = "processHTML.inbound";
    private final int TIMEOUT=1000;

    @GET
    @Path("/GetFunFromXML/{topic}")
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_XML)
    public JUGstats getCurrentBankRateXML(@PathParam("topic") String topic) throws RemoteException, MuleException {
        RequestContext.getEventContext().sendEventAsync(createMessage(new JUGstats(50, "Bod'ka", topic)), ENDPOINT_NAME_XML, TIMEOUT);
        return new JUGstats(50, "Bod'ka", topic);
    }

    @GET
    @Path("/GetFunFromHTML")
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.APPLICATION_XML)
    public JUGstats getCurrentBankRateHTML(@PathParam("topic") String topic) throws RemoteException, MuleException {
        RequestContext.getEventContext().sendEventAsync(createMessage(new JUGstats(70, topic, "Doggy")), ENDPOINT_NAME_HTML, TIMEOUT);
        return new JUGstats(50, "Bod'ka", topic);
    }

    private MuleMessage createMessage(Object payload) {
        return new DefaultMuleMessage(payload, RequestContext.getEventContext().getMuleContext());
    }
}
