package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.Series;
import model.AccessManager;

@Path("/series")
public class SeriesService {
	@GET
	@Produces("application/json")
	public String series()
	{
		String series = null;
		ArrayList<Series> seriesList = new ArrayList<Series>();
		try
		{
			seriesList = new AccessManager().getSeries();
			Gson gson = new Gson();
			series = gson.toJson(seriesList);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return series;
	}
}
