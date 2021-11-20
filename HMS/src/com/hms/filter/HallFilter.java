package com.hms.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.hms.db.dao.HostelDAO;
import com.hms.model.Hostel;

@WebFilter(urlPatterns = "/pages/warden/roomAllocation.jsp")
public class HallFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		List<Hostel> allHostels = HostelDAO.getAllHostels();

		req.setAttribute("allHostels", allHostels);

		chain.doFilter(req, resp);

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
