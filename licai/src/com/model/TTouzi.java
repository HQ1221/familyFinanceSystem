package com.model;

/**
 * TTouzi generated by MyEclipse Persistence Tools
 */

public class TTouzi implements java.io.Serializable
{

	private Integer id;
	private String xangmu;
	private Double benjin;
	private String kaishi;

	private String jiehsu;
	private Double shouyi;
	private Integer userId;
	
	
	public Double getBenjin()
	{
		return benjin;
	}
	public void setBenjin(Double benjin)
	{
		this.benjin = benjin;
	}
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getJiehsu()
	{
		return jiehsu;
	}
	public void setJiehsu(String jiehsu)
	{
		this.jiehsu = jiehsu;
	}
	public String getKaishi()
	{
		return kaishi;
	}
	public void setKaishi(String kaishi)
	{
		this.kaishi = kaishi;
	}
	
	public Double getShouyi()
	{
		return shouyi;
	}
	public void setShouyi(Double shouyi)
	{
		this.shouyi = shouyi;
	}
	public Integer getUserId()
	{
		return userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	public String getXangmu()
	{
		return xangmu;
	}
	public void setXangmu(String xangmu)
	{
		this.xangmu = xangmu;
	}

}