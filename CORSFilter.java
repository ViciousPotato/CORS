package com.ms.msauction;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class CORSFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse)response;
        
        String origin = req.getHeader("Origin");
        res.addHeader("Access-Control-Allow-Origin", origin);
        res.addHeader("Access-Control-Allow-Credentials", "true");
        res.addHeader("Access-Control-Allow-Methods", "HEAD, GET, POST, PUT, DELETE, TRACE, OPTIONS, CONNECT, PATCH");
        res.addHeader("Access-Control-Allow-Headers", "Accept, Accept-Charset, Accept-Encoding, Accept-Language, Accept-Datetime, Authorization, Cache-Control, Connection, Cookie, Content-Length, Content-MD5, Content-Type, Date, User-Agent, X-Requested-With");
        chain.doFilter(request, response);
    }
}
