package com.Student.Config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Collection;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        // Your JWT validation logic here
        // Example: Check if the request has a valid JWT token and set the authentication context
        String token = getTokenFromRequest(request);
        if (token != null && validateToken(token)) {
            // Set the authentication in the context
            SecurityContextHolder.getContext().setAuthentication(getAuthentication(token));
        }
        filterChain.doFilter(request, response);
    }

    private String getTokenFromRequest(HttpServletRequest request) {
        // Extract token from the request header
        return request.getHeader("Authorization");
    }

    private boolean validateToken(String token) {
        // Validate the token
        return true; // Implement your token validation logic here
    }

    private UsernamePasswordAuthenticationToken getAuthentication(String token) {
        Object user = null;
		Collection<? extends GrantedAuthority> authorities = null;
		// Parse the token and get the user authentication
        return new UsernamePasswordAuthenticationToken(user, null, authorities); // Implement your logic here
    }
}
