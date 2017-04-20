package view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import model.*;
import controller.*;

public class HomeGUI {
	private JFrame main_frame;
	private ArrayList<JPanel> tab_panels;
	private JTabbedPane tabbed_pane;
	private Integer HEIGHT = 500;
	private Integer WIDTH = 500;
	
	public HomeGUI(CUMember cu_member) {
		buildHomeGUI(cu_member);
	}
	
	private void buildHomeGUI(CUMember cu_member) {
		main_frame = new JFrame("Revamp Rezlife Home");
		main_frame.setSize(WIDTH, HEIGHT);
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tabbed_pane = new JTabbedPane();
		buildTabs(cu_member);
		main_frame.add(tabbed_pane);
		
		main_frame.setVisible(true);
	}
	
	private void buildTabs(CUMember cu_member) {
		tab_panels = new ArrayList<JPanel>();
		if(cu_member.hasResidentProfile()) {
			tab_panels.add(new JPanel());
			tabbed_pane.addTab("Resident", tab_panels.get(0));
		}
		
		ArrayList<CU_Job> jobs = cu_member.getJob_list();
		for (int i = 0; i < jobs.size(); i++) {
			tab_panels.add(new JPanel());
			tabbed_pane.addTab(jobs.get(i).getJob_title(), tab_panels.get(tab_panels.size()-1));
		}
	}

}
