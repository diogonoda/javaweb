package dnoda.scj;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class TesteFilter implements Filter {

	@Override
	public void doFilter(
			ServletRequest req, 
			ServletResponse resp, 
			FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Passou pelo filter");
		
		chain.doFilter(req, resp);
	}
}
