package com.ecomerece.product.utils;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;

import java.security.Key;
import java.util.Date;
import java.util.List;

public class JwtUtils {
    private static final String SECRET_KEY = "your-secret-key";

    public static String generateToken(String username,List<String> roles){
        return Jwts.builder()
                .setSubject(username)
                .claim("roles", roles)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+1000 * 60 * 60))
                .signWith(SignatureAlgorithm.HS256,SECRET_KEY)
                .compact();
    }

    public static String extractUsername(String token){
        Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJwt(token)
                .getBody().getSubject();
    }

    public static Claims extractClaims(String token) {
        Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
        return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
    }

    public static String getUsername(String token) {
        return extractClaims(token).getSubject();
    }

    @SuppressWarnings("unchecked")
    public static List<String> getRoles(String token) {
        return (List<String>) extractClaims(token).get("roles");
    }

    public static boolean isTokenValid(String token) {
        try {
            extractUsername(token); // will throw if invalid
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
