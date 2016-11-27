package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.Company;
import model.AccessManager;

@Path("/companies")
public class CompanyService {
	@GET
	@Path("")
	@Produces("application/json")
	public String courses()
	{
	String companies = null;
	ArrayList<Company> companyList = new ArrayList<Company>();
	try
	{
	companyList = new AccessManager().getCompanies();
	Gson gson = new Gson();
	companies = gson.toJson(companyList);
	} catch (Exception e)
	{
	e.printStackTrace();
	}
	return companies;
	}
}
