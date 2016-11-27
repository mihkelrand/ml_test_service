package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.Document;
import model.AccessManager;

@Path("/documents")
public class DocumentService {

	@GET
	@Path("")
	@Produces("application/json")
	public String courses()
	{
	String documents = null;
	ArrayList<Document> documentList = new ArrayList<Document>();
	try
	{
	documentList = new AccessManager().getDocuments();
	Gson gson = new Gson();
	documents = gson.toJson(documentList);
	} catch (Exception e)
	{
	e.printStackTrace();
	}
	return documents;
	}
}
