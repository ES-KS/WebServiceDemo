
package com.company.webservicedemo.ui;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevTextField;
import com.xdev.ui.XdevView;

public class MainView extends XdevView {

	private final String urlString = "http://localhost:8080/WebServiceDemo/webservices/getServices/Test2";
	
	/**
	 * 
	 */
	public MainView() {
		super();
		this.initUI();
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #button}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void button_buttonClick(Button.ClickEvent event) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(urlString);
		final String response = target.request().get(String.class);
		textField.setValue(response);
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated
	 * by the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.gridLayout = new XdevGridLayout();
		this.textField = new XdevTextField();
		this.button = new XdevButton();
	
		this.textField.setColumns(5);
		this.button.setCaption("Button");
	
		this.gridLayout.setColumns(2);
		this.gridLayout.setRows(3);
		this.textField.setSizeUndefined();
		this.gridLayout.addComponent(this.textField, 0, 0);
		this.button.setSizeUndefined();
		this.gridLayout.addComponent(this.button, 0, 1);
		CustomComponent gridLayout_hSpacer = new CustomComponent();
		gridLayout_hSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_hSpacer, 1, 0, 1, 1);
		this.gridLayout.setColumnExpandRatio(1, 1.0F);
		CustomComponent gridLayout_vSpacer = new CustomComponent();
		gridLayout_vSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_vSpacer, 0, 2, 0, 2);
		this.gridLayout.setRowExpandRatio(2, 1.0F);
		this.gridLayout.setSizeFull();
		this.setContent(this.gridLayout);
		this.setSizeFull();
	
		button.addClickListener(event -> this.button_buttonClick(event));
	} // </generated-code>

	// <generated-code name="variables">
	private XdevButton button;
	private XdevGridLayout gridLayout;
	private XdevTextField textField; // </generated-code>


}
