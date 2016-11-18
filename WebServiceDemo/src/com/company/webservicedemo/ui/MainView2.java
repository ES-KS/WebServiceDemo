package com.company.webservicedemo.ui;

import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevView;
import com.xdev.ui.entitycomponent.table.XdevTable;

public class MainView2 extends XdevView {

	/**
	 * 
	 */
	public MainView2() {
		super();
		this.initUI();
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated
	 * by the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.gridLayout = new XdevGridLayout();
		this.table = new XdevTable<>();
	
		this.gridLayout.setColumns(1);
		this.gridLayout.setRows(1);
		this.table.setSizeFull();
		this.gridLayout.addComponent(this.table, 0, 0);
		this.gridLayout.setColumnExpandRatio(0, 100.0F);
		this.gridLayout.setRowExpandRatio(0, 100.0F);
		this.gridLayout.setSizeFull();
		this.setContent(this.gridLayout);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private XdevTable<?> table;
	private XdevGridLayout gridLayout; // </generated-code>


}
