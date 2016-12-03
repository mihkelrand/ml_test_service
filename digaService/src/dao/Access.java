package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Document;
import dto.Series;
import dto.Company;

public class Access {
	public ArrayList<Document> getDocuments(Connection con) throws SQLException
	{
		ArrayList<Document> documentList = new ArrayList<Document>();
		PreparedStatement stmt = con.prepareStatement("SELECT id, name, mark, year, exitYear, intakeAct, destructionAct, containerCode, documentCode, placeCode, description, seriesId, companyId from document");
		ResultSet rs = stmt.executeQuery();
		try
		{
			while(rs.next())
			{
				Document documentObj = new Document();
				documentObj.setId(rs.getInt("id"));
				documentObj.setName(rs.getString("name"));
				documentObj.setMark(rs.getString("mark"));
				documentObj.setYear(rs.getString("year"));
				documentObj.setExitYear(rs.getString("exitYear"));
				documentObj.setIntakeAct(rs.getString("intakeAct"));
				documentObj.setDestructionAct(rs.getString("destructionAct"));
				documentObj.setContainerCode(rs.getString("containerCode"));
				documentObj.setDocumentCode(rs.getString("documentCode"));
				documentObj.setPlaceCode(rs.getString("placeCode"));
				documentObj.setDescription(rs.getString("description"));
				documentObj.setSeries(getSeries(con).get(rs.getInt("seriesId") - 1));
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
				companyObj.setCode(rs.getInt("code"));
				companyObj.setName(rs.getString("name"));
				companyList.add(companyObj);
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return companyList;

	}
	
	public ArrayList<Series> getSeries(Connection con) throws SQLException
	{
		ArrayList<Series> seriesList = new ArrayList<Series>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM series");
		ResultSet rs = stmt.executeQuery();
		try
		{
			while(rs.next())
			{
				Series seriesObj = new Series();
				seriesObj.setId(rs.getInt("id"));
				seriesObj.setName(rs.getString("name"));
				seriesList.add(seriesObj);
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return seriesList;

	}
}
