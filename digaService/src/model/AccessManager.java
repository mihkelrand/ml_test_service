package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.Access;
import dao.Database;
import dto.Company;
import dto.Document;
import dto.Series;

public class AccessManager {
	public ArrayList<Document> getDocuments() throws Exception
	{
		ArrayList<Document> documentList = new ArrayList<Document>();
		Database db = new Database();
		Connection con = db.getConnection();
		Access access = new Access();
		documentList = access.getDocuments(con);
		return documentList;
	}

	public ArrayList<Company> getCompanies() throws Exception
	{
		ArrayList<Company> companyList = new ArrayList<Company>();
		Database db = new Database();
		Connection con = db.getConnection();
		Access access = new Access();
		companyList = access.getCompanies(con);
		return companyList;
	}
	
	public ArrayList<Series> getSeries() throws Exception
	{
		ArrayList<Series> seriesList = new ArrayList<Series>();
		Database db = new Database();
		Connection con = db.getConnection();
		Access access = new Access();
		seriesList = access.getSeries(con);
		return seriesList;
	}
}
