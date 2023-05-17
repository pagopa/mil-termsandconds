package it.pagopa.swclient.mil.termsandconds.client;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.smallrye.mutiny.Uni;
import it.pagopa.swclient.mil.bean.CommonHeader;
import it.pagopa.swclient.mil.termsandconds.client.bean.SaveNewCardsResponse;
import it.pagopa.swclient.mil.termsandconds.client.bean.SessionRequest;
import it.pagopa.swclient.mil.termsandconds.client.bean.SessionResponse;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

/**
 * Reactive rest client for the REST APIs exposed by the Session service
 */
@Path("/sessions")
@RegisterRestClient(configKey = "session-api")
public interface SessionService {

	/**
	 * Client of the getSessionById API exposed by the Session service
	 * Read a session by ID
	 * @param sessionId id of the session
	 * @param commonHeader a set of mandatory headers
	 * @return the response from the Session service
	 */
	@GET
	@Path("/{sessionId}")
	@ClientHeaderParam(name = "Ocp-Apim-Subscription-Key", value = "${ocp.apim.subscription}", required = false)
    Uni<SessionResponse> getSessionById(@NotNull @PathParam("sessionId") String sessionId, @BeanParam CommonHeader commonHeader);
	
	/**
	 * Client of the patchSessionById API exposed by the Session service
	 * Update partially a session by ID
	 * @param sessionId id of the session
	 * @param commonHeader a set of mandatory headers
	 * @param request a JSon body 
	 * @return the response from the Session service
	 */
	@PATCH
	@Path("/{sessionId}")
    Uni<SaveNewCardsResponse> patchSessionById(@PathParam("sessionId") String sessionId, @BeanParam CommonHeader commonHeader, SessionRequest request);
}
