package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Document;
import dto.Company;

public class Access {
	public ArrayList<Document> getDocuments(Connection con) throws SQLException
	{
		ArrayList<Document> documentList = new ArrayList<Document>();
		PreparedStatement stmt = con.prepareStatement("SELECT id, name, year, series, companyId from document");
		ResultSet rs = stmt.executeQuery();
		try
		{
			while(rs.next())
			{
				Document documentObj = new Document();
				documentObj.setId(rs.getInt("id"));
				documentObj.setName(rs.getString("name"));
				documentObj.setYear(rs.getString("year"));
				documentObj.setCompany(getCompanies(con).get(rs.getInt("companyId") - 1));
				documentList.add(documentObj);
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return documentList;

	}

	public ArrayList<Company> getCompanies(Connection con) throws SQLException
	{
		ArrayList<Company> companyList = new ArrayList<Company>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM company");
		ResultSet rs = stmt.executeQuery();
		try
		{
			while(rs.next())
			{
				Company companyObj = new Company();
				companyObj.setId(rs.getInt("id"));
				companyObj.setName(rs.getString("name"));
				companyList.add(companyObj);
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return companyList;

	}
}
