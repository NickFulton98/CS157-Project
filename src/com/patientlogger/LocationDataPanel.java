package com.patientlogger;

import java.sql.Connection;

import javax.swing.JPanel;

public class LocationDataPanel extends JPanel
{
	Connection conn;
	
	public LocationDataPanel(Connection c)
	{
		conn = c;
	}
}
