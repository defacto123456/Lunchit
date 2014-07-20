package com.czl.li.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.czl.li.services.UserService;

/**
 * The web resource for user
 * 
 * @author defacto
 * 
 */
@Component("userResource")
@Path("/json/user")
public class UserResource {
	@Autowired
	@Qualifier(value = "userService")
	private UserService userService;

	/**
	 * Check to see whether there is a corresponding user account in the system
	 * based on the email from the facebook login.
	 * 
	 * @param uriInfo
	 *            the uri that contains the user's email from the facebook login
	 */
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public void valifyUser(@Context final UriInfo uriInfo) {
		System.out.println("valifyUser");
		final MultivaluedMap<String, String> queryParams = uriInfo
				.getQueryParameters();
		final String email = queryParams.getFirst("email");
		final String firstName = queryParams.getFirst("firstname");
		final String lastName = queryParams.getFirst("lastname");
		if (EmailValidator.getInstance().isValid(email)) {
			System.out.println("Email = " + email);
			System.out.println("First Name = " + firstName);
			System.out.println("Last Name = " + lastName);
			userService.verifyUserEmail(email, firstName, lastName);
		}
	}
}
