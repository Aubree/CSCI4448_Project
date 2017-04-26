package view;

import java.util.ArrayList;
import javax.swing.*;
import model.*;

public class HomeGUI extends JFrame {
	private ArrayList<JPanel> tab_panels;
	private JTabbedPane tabbed_pane;
	private Integer HEIGHT = 500;
	private Integer WIDTH = 500;
	
	public HomeGUI(CUMember cu_member) {
		setTitle("Revamp Rezlife Home");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildHomeGUI(cu_member);
	}
	
	private void buildHomeGUI(CUMember cu_member) {
		tabbed_pane = new JTabbedPane();
		buildTabs(cu_member);
		add(tabbed_pane);
		
		setVisible(true);
	}
	
	private void buildTabs(CUMember cu_member) {
		tab_panels = new ArrayList<JPanel>();
		if(cu_member.hasResidentProfile()) {
			tab_panels.add(new ResidentTab(cu_member));
			tabbed_pane.addTab("Resident", tab_panels.get(0));
		}
		
		ArrayList<CU_Job> jobs = cu_member.getJob_list();
		for (int i = 0; i < jobs.size(); i++) {
			if (jobs.get(i).getJob_title().equals("Resident Advisor")) {
				tab_panels.add(new ResidentAdvisorTab((ResidentAdvisor) jobs.get(i)));
			}
			if (jobs.get(i).getJob_title().equals("Community Assistant")) {
				tab_panels.add(new CommunityAssistantTab((CommunityAssistant) jobs.get(i)));
			}
			tabbed_pane.addTab(jobs.get(i).getJob_title(), tab_panels.get(tab_panels.size()-1));
		}
	}

}
