package cn.jansen.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2018/11/13 20:45
 */
@WebFilter(urlPatterns = "/*", filterName = "MyFilter")
public class MyFilter implements Filter {
    private Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("MyFilter init ...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("MyFilter doFilter start ...");
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("MyFilter doFilter end ...");
    }

    @Override
    public void destroy() {
        log.info("MyFilter destroy ...");
    }
}
