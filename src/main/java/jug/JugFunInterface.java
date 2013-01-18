package jug;

import org.mule.api.MuleException;

import javax.jws.WebParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.rmi.RemoteException;

/**
 * User: y.zavada
 * Date: 17.01.13
 * Time: 16:55
 */
public interface JugFunInterface {

    @GET
    @Path("/GetFunFromXML")
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_XML)
    public JUGstats getCurrentBankRateXML(@PathParam("counter") String counter) throws RemoteException, MuleException;

    /**
     * @return String
     * @throws java.rmi.RemoteException
     */
    @GET
    @Path("/GetFunFromHTML")
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.APPLICATION_XML)
    public JUGstats getCurrentBankRateHTML(@PathParam("counter") String counter) throws RemoteException, MuleException;
}
